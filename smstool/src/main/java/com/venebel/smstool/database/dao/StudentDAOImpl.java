package com.venebel.smstool.database.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.venebel.smstool.database.Student;
import com.venebel.smstool.database.util.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> listStudents() {
		
		Session session = null;
		List<Student> studentList = null;
		try {
			
			session = HibernateUtil.openSession();
			studentList = session.createCriteria(Student.class).list();
			for(Student student : studentList){
				System.out.println("Student List: " + student.getPerson());
			}
			
		} catch (HibernateException he) { 
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
				
		return studentList;
	}

	@Override
	public void addStudent(Student student) {
		
		Session session = null;
		Transaction transaction = null;
		
        try { 
        	session = HibernateUtil.openSession(); 
        	transaction = session.beginTransaction();
        	session.save(student.getPerson().getUser().getRole());
    		session.save(student.getPerson().getUser());
    		session.save(student.getPerson());
    		session.save(student);
    		transaction.commit();
    		
    		System.out.println("Student saved successfully. Student id = " + student.getId() + ", details = " + student.getPerson());
        } catch (HibernateException he) { 
        	transaction.rollback(); 
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
	}

	@Override
	public void updateStudent(Student student) {
		
		Session session = null;
		Transaction transaction = null;
		try { 
        	session = HibernateUtil.openSession(); 
        	transaction = session.beginTransaction();
    		session.update(student);
    		session.update(student.getPerson());
    		session.update(student.getPerson().getUser());
    		session.update(student.getPerson().getUser().getRole());
        	transaction.commit();
        	
    		System.out.println("Student updated successfully. Student id = " + student.getId() + ", details = " + student.getPerson());
		} catch (HibernateException he) { 
        	transaction.rollback(); 
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
	}

	@Override
	public void removeStudent(int id) {
		
		Session session = null;
		Transaction transaction = null;
        try { 
        	session = HibernateUtil.openSession(); 
        	transaction = session.beginTransaction();
        	Student student = (Student) session.load(Student.class, new Integer(id));
        	if(student != null){
    			session.delete(student);
    			session.delete(student.getPerson());
        		session.delete(student.getPerson().getUser());
        		session.delete(student.getPerson().getUser().getRole());
    			transaction.commit();
    		}
        	
    		System.out.println("Student deleted successfully. Student id = " + student.getId() + ", details = " + student.getPerson());
        } catch (HibernateException he) { 
        	transaction.rollback();
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
	}

	@Override
	public Student getStudentById(int id) {
		
		Session session = null;
		Student student = null;
		try {
			session = HibernateUtil.openSession();      
			student = (Student) session.load(Student.class, new Integer(id));
		
			System.out.println("Student loaded successfully. Student id = " + student.getId() + ", details = " + student.getPerson());
		} catch (HibernateException he) { 
            throw new HibernateException("Error: ", he);
        } finally { 
        	if( session != null )
        		session.close();
        }
			
		return student;
	}

}
