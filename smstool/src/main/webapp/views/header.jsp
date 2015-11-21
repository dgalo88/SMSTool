<%@page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title><spring:message code="smstool.title" text="Systematic Measurement System (SMS) Tool"/></title>

<%-- 	<link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico"/>"> --%>

	<link href="<c:url value="/resources/css/normalize.css"/>" rel="stylesheet" media="screen">

	<!-- Bootstrap -->
	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" media="screen">

	<!-- FormValidation CSS file -->
	<link href="<c:url value="/resources/css/formValidation.min.css"/>" rel="stylesheet">

	<!-- HTML5 shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		<script src="<c:url value="/resources/js/html5shiv.min.js"/>"></script>
		<script src="<c:url value="/resources/js/respond.min.js"/>"></script>
	<![endif]-->

	<link href="<c:url value="/resources/css/styles.css"/>" rel="stylesheet" media="screen">

	<script src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
	<!-- FormValidation plugin and the class supports validating Bootstrap form -->
	<script src="<c:url value="/resources/js/formValidation.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/js/framework/bootstrap.js"/>" type="text/javascript"></script>
	
	<script src="<c:url value="/resources/js/notifications.js"/>" type="text/javascript"></script>
</head>

<script type="text/javascript">
<!-- init tooltip -->
$(document).on('ready', function() {
    $('[data-toggle="tooltip"]').tooltip(); 
});
</script>

<body>

	<div class="alert alert-dismissible notification hidden" role="alert" id="notification"></div>
	
	<%@include file="navbar.jsp"%>
	<%@include file="include/modal.jsp" %>
