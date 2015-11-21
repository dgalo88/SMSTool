<%@page import="com.venebel.smstool.database.Student"%>
<%@page import="com.venebel.smstool.util.ExecuteConstants"%>
<%@include file="header.jsp"%>

<spring:message code="smstool.student.validation.firstName" var="firstName" text="First Name" />
<spring:message code="smstool.student.validation.lastName" var="lastName" text="Last Name" />
<spring:message code="smstool.student.email" var="email" text="Email" />
<spring:message code="smstool.student.class" var="nameClass" text="Class" />
<spring:message code="smstool.student.gender" var="gender" text="Gender" />
<script>
$(document).ready(function() {
    $('#formSaveStudent').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	firstName: {
                validators: {
                    notEmpty: {
                        message: "<spring:message code='smstool.student.validation.empty' arguments='${firstName}' text='The first name is required' />"
                    },
                    stringLength: {
                        min: 1,
                        max: 30,
                        message: "<spring:message code='smstool.student.validation.long' arguments='1,30' text='The first name must be more than 1 and less than 30 characters long' />"
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: "<spring:message code='smstool.student.validation.regexp.text' arguments='${firstName}' text='The first name can only consist of alphabetical, number and underscore' />"
                    }
                }
            },
        	lastName: {
                validators: {
                    notEmpty: {
                        message: "<spring:message code='smstool.student.validation.empty' arguments='${lastName}' text='The last name is required' />"
                    },
                    stringLength: {
                        min: 1,
                        max: 30,
                        message: "<spring:message code='smstool.student.validation.long' arguments='1,30' text='The last name must be more than 1 and less than 30 characters long' />"
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: "<spring:message code='smstool.student.validation.regexp.text' arguments='${lastName}' text='The last name can only consist of alphabetical, number and underscore' />"
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: "<spring:message code='smstool.student.validation.empty' arguments='${email}' text='The email is required' />"
                    },
                    regexp: {
                        regexp: /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/,
                        message: "<spring:message code='smstool.student.validation.regexp.email' text='The input is not a valid email address' />"
                    }
                }
            },
            nameClass: {
                validators: {
                    notEmpty: {
                        message: "<spring:message code='smstool.student.validation.empty' arguments='${nameClass}' text='The class is required' />"
                    }
                }
            }
        }
    });
});
</script>

<%

	Student student = (Student)request.getAttribute("student");
	boolean edit = false;
	if( student != null )
		edit = true;

%>

<div class="container">
	<div class="container table-responsive">
		<br>
		<div class="row">
	    	<div class="col-sm-1">
	    		<h1 class="glyphicon glyphicon-user"></h1>
	    	</div>
			<div class="col-sm-8">
				<h3><spring:message code='<%= edit ? "smstool.student.edit.title" : "smstool.student.add.title"%>' text='<%= edit ? "Edit Student" : "Add Students"%>' /></h3>
				<p><spring:message code='<%= edit ? "" : "smstool.student.add.description"%>' text='<%= edit ? "" : "Complete all the information below to add a student. The student will receive a login and password on the mail address provided below."%>' /></p>  
			</div>
  		</div>
  		<br><br>
  		<form class="form-horizontal" id="formSaveStudent" action="<c:url value="<%= edit ? ExecuteConstants.ACTION_UPDATE_STUDENT : ExecuteConstants.ACTION_SAVE_STUDENT %>" />" method="post">
  			<input type="hidden" id="idStudent" name="idStudent" value="<%=edit ? student.getId() : ""%>">
  			<div class="panel panel-default">
  				<div class="panel-body">
					<div class="form-group">
						<label class="control-label col-sm-2" for="firstName">${firstName}:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="firstName" name="firstName" placeholder="${firstName}" value="<%= edit ? student.getPerson().getFirstname() : ""%>">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="lastName">${lastName}:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="lastName" name="lastName" placeholder="${lastName}" value="<%= edit ? student.getPerson().getLastname() : ""%>">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">${email}:</label>
						<div class="col-sm-4">
							<input type="email" class="form-control" id="email" name="email" placeholder="Enter ${email}" value="<%= edit ? student.getPerson().getEmail() : ""%>">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="nameClass">${nameClass}:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="nameClass" name="nameClass" placeholder="Enter ${nameClass}" value="<%= edit ? student.getClassName() : ""%>">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="gender">${gender}:</label>
						<div class="col-sm-4">
							<div class="form-inline">
  								<label class="radio-inline">
    								<input type="radio" name="gender" id="gender" value="1" <%= edit ? (student.getPerson().getGender().equals("1") ?  "checked" : "") : "checked"  %> ><spring:message code="smstool.student.male" text="Male" />
  								</label>
  								<label class="radio-inline">
    								<input type="radio" name="gender" id="gender" value="0" <%= edit ? (student.getPerson().getGender().equals("0") ?  "checked" : "") : ""  %>><spring:message code="smstool.student.female" text="Female" />
  								</label>
							</div>
						</div>
					</div>
				</div>
  			</div>
  			<div class="btn-footer pull-right">
				<a href="javascript:history.go(-1);" class="btn btn-default" role="button" id="back" title="Back"><spring:message code="smstool.button.back" text="Back" /></a>
				<button type="submit" class="btn btn-primary"><spring:message code='<%= edit ? "smstool.student.update" : "smstool.student.create"%>' text='<%= edit ? "Save Student" : "Create New Student"%>' /></button>
			</div>
  		</form>
	</div>
</div>

<%@include file="footer.jsp"%>