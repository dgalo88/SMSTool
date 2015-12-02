package com.venebel.smstool.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.venebel.smstool.database.Person;
import com.venebel.smstool.database.Student;
import com.venebel.smstool.database.User;
import com.venebel.smstool.database.dao.StudentDAOImpl;
import com.venebel.smstool.util.Constants;
import com.venebel.smstool.util.TableUtils;
import com.venebel.smstool.util.TextUtils;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired  
	private MessageSource messageSource;
	@Autowired
	private JavaMailSender mailSender;
	 
	@RequestMapping(value="/listStudent", method = RequestMethod.GET)
	public ModelAndView listStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		List<Student> listStudents = daoImpl.listStudents();
		
		//Create data table
		List<Object> listPersons = new ArrayList<Object>();
		for (int i = 0; i < listStudents.size(); i++) {
			Person person = listStudents.get(i).getPerson();
			person.setGender(person.getGender().equals("1") ?  messageSource.getMessage("smstool.student.male", null, null) :  messageSource.getMessage("smstool.student.female", null, null));
			person.setActions(TableUtils.buildButtonsActions(listStudents.get(i).getId(), messageSource));
			listPersons.add(person);
		}
		
		//Create columns table
		LinkedHashMap<String, String> columns = new LinkedHashMap<String, String>();
		columns.put("firstname", messageSource.getMessage("smstool.student.firstname", null, null));
		columns.put("lastname", messageSource.getMessage("smstool.student.lastname", null, null));
		columns.put("email", messageSource.getMessage("smstool.student.email", null, null));
		columns.put("birthDate", messageSource.getMessage("smstool.student.birthdate", null, null));
		columns.put("gender", messageSource.getMessage("smstool.student.gender", null, null));
		columns.put("actions", messageSource.getMessage("smstool.table.actions", null, null));
		
		request.setAttribute("listStudents", TableUtils.buildDataTable(listPersons, columns));
		
		return new ModelAndView("listStudents");
	}
	
	@RequestMapping(value="/addStudent", method = RequestMethod.GET)
	public ModelAndView addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		return new ModelAndView("addStudent");
	}
	
	@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
	public String saveStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, ParseException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String className = request.getParameter("nameClass");
		String birthDate = request.getParameter("birth");
		String gender = request.getParameter("gender");
		
		User user = new User(email, TextUtils.generatePassword(), Constants.ROLE_STUDENT);
		Student student = new Student(new Person(firstName, lastName, email, gender, new SimpleDateFormat(Constants.FORMAT_BIRTH_DATE).parse(birthDate), user), className);
		
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		daoImpl.addStudent(student);
        
        mailSender.send(new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			    message.setTo(email);
			    message.setSubject(messageSource.getMessage("smstool.email.subject", null, null));
			    message.setText(messageSource.getMessage("smstool.email.body", 
    							new Object[] { firstName, lastName, user.getUsername(), user.getPassword() }, null), true);
			}
		});
	
		return "redirect:listStudent";
	}

	@RequestMapping(value="/deleteStudent", method = RequestMethod.GET)
	public void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		String id = request.getParameter("id");		
		
		JSONObject json = new JSONObject();
		
		try {
			StudentDAOImpl daoImpl = new StudentDAOImpl();
			daoImpl.removeStudent(Integer.valueOf(id));
		    json.put("message", messageSource.getMessage("smstool.student.delete.success", null, null));
		} catch (Exception e) { 
			System.out.println("Error delete student. " + e.getMessage());
		    json.put("message", messageSource.getMessage("smstool.message.error.admin", null, null));
		}
		
		response.getWriter().write(json.toString());
		
	}
	
	@RequestMapping(value="/editStudent", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String id = request.getParameter("id");
		
		Student student = new Student();
		
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		student = daoImpl.getStudentById(Integer.valueOf(id));
		
		request.setAttribute("student", student);
		
		return new ModelAndView("addStudent");
	}
	
	@RequestMapping(value="/updateStudent", method = RequestMethod.POST)
	public String updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String id = request.getParameter("idStudent");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String className = request.getParameter("nameClass");
		String gender = request.getParameter("gender");
				
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		Student student = daoImpl.getStudentById(Integer.valueOf(id));
		student.getPerson().setFirstname(firstName);
		student.getPerson().setLastname(lastName); 
		student.getPerson().setEmail(email);
		student.getPerson().setGender(gender);
		student.setClassName(className);
		daoImpl.updateStudent(student);
		
		return "redirect:listStudent";
	}
}
