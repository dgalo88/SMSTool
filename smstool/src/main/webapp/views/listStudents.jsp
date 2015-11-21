<%@page import="com.venebel.smstool.util.ExecuteConstants"%>
<%@include file="header.jsp"%>

<link href="<c:url value="/resources/css/dataTables.bootstrap.css" />" rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
<script src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>

<c:url value="<%= ExecuteConstants.ACTION_DELTE_STUDENT %>" var="urlDeleteStudent"/>
<c:url value="<%= ExecuteConstants.ACTION_EDIT_STUDENT %>" var="urlEditStudent"/>
<script type="text/javascript">

$(document).ready(function() {
	loadDatatable();
	
	$('.delete').on('click', function() {
		$('#modalText').html("<spring:message code='smstool.student.delete' text='Manage Students' />");
		$('#modalConfirm').modal('show');
		currentDelete = $(this);
	});
	
	$('#confirm').on('click', function() {

		$('#modalConfirm').modal('hide');
		var id = currentDelete.attr('id');
		
		$.ajax({
			url: '${urlDeleteStudent}',
			data: "id=" + id,
			success: function(data) {
				location.reload(true);
// 				var message = JSON.parse(data);
// 				showSuccess(message.message);
			 },
			 error: function() {
				var message = JSON.parse(data);
				showError(message.message); 
			 }
		});
		
	});
	
	$('.edit').on('click', function() {
		var id = $(this).attr('id');
		
		window.location.href = '${urlEditStudent}?id=' + id;
		
	});
	
});

</script>

<%
	String studentJSON = (String) request.getAttribute("listStudents");	
%>

<script type="text/javascript">

function loadDatatable() {

	var jsonData = JSON.parse('<%= studentJSON%>');

	$('#tableStudents').dataTable({
		'scrollY': '450px',
		'scrollCollapse': true,
		'data': jsonData.data,
		'columns': jsonData.columns
	});

}

</script>

<div class="container">
	<div class="container table-responsive">
		<br>
		<div class="row">
	    	<div class="col-sm-1">
	    		<h1 class="glyphicon glyphicon-user"></h1>
	    	</div>
			<div class="col-sm-8">
				<h3><spring:message code="smstool.student.list.title" text="Manage Students" /></h3>
				<p><spring:message code="smstool.student.list.description" text="Here you can add, delete students and edit their information." /></p>  
			</div>
  		</div>
  		<br><br>
  		<div class="panel panel-default">
  			<div class="panel-body">
				<table id="tableStudents" class="table table-striped table-bordered"></table>
			</div>
		</div>	
		<br>
		<div class="btn-footer pull-right">
			<a href="#" class="btn btn-default" role="button" id="back"><spring:message code="smstool.button.back" text="Back" /></a>
			<a href="<c:url value="<%= ExecuteConstants.ACTION_ADD_STUDENT %>"/>" class="btn btn-primary" role="button" id="addStudet"><spring:message code="smstool.student.add.button" text="Add Student" /></a>
		</div>
	</div>
</div>

<%@include file="footer.jsp"%>