<%@page import="com.venebel.smstool.util.ExecuteConstants"%>
<%@include file="header.jsp"%>

<link href="<c:url value="/resources/css/dataTables.bootstrap.css"/>" rel="stylesheet" media="screen">
<script src="<c:url value="/resources/js/jquery.dataTables.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.bootstrap.min.js"/>" type="text/javascript"></script>
<script type="text/javascript">

var dataSet = [
               [ "Tiger Nixon", "<a href='#'><span class='glyphicon glyphicon-edit' title='<spring:message code='smstool.button.edit' text='' />'></span></a><a href='#'> <span class='glyphicon glyphicon-trash' title='<spring:message code='smstool.button.delete' text='' />'></span></a>"],
               [ "Garrett Winters", "<a href='#'><span class='glyphicon glyphicon-edit' title='<spring:message code='smstool.button.edit' text='' />'></span></a><a href='#'> <span class='glyphicon glyphicon-trash' title='<spring:message code='smstool.button.delete' text='' />'></span></a>"]
           ];
           
$(document).ready(function() {
    $('#listSurvey').DataTable( {
        data: dataSet,
        columns: [
            { title: "<spring:message code='smstool.survey.open.Name' text='' />" },
            { title: "<spring:message code='smstool.survey.open.Actions' text='' />" ,"width": "20%", "className":"text-center" }
        ]
    } );
} );
</script>

<form class="form-horizontal" id="formSaveSurvey" action="<c:url value="<%=ExecuteConstants.SAVE_SURVEY%>" />" method="post">
	<div class="container">
		<h1 class="glyphicon glyphicon-align-justify" align="left"><spring:message code='smstool.survey.open.title' text='' /></h1>
		<br>
		<br>
		<table id="listSurvey" class="table table-striped table-bordered"></table>
		
	</div>
</form>
<%@include file="footer.jsp"%>