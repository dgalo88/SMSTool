<%@page import="com.venebel.smstool.model.LoadSurvey"%>
<%@page import="com.venebel.smstool.util.ExecuteConstants"%>
<%@page import="com.venebel.smstool.model.Question"%>
<%@page import="com.venebel.smstool.model.Subcategory"%>
<%@page import="com.venebel.smstool.model.Survey"%>
<%@page import="java.util.ArrayList"%>

<%@include file="header.jsp"%>

<script type="text/javascript">

$( document ).ready(function() {
	$( "#save_survey" ).on( "click", function() {
		var i=1;
		$( "#survey_checked" ).empty();
		$("input[type=checkbox]:checked").each(function(){
			$("#survey_checked").append('<input type="hidden" name="question_checked_'+i+'" value="'+$(this).val()+'">');
			i++;
		});
// 		$( "#survey_checked" ).empty();
		if($('#survey_checked').is(':empty')){
			showError("<spring:message code='smstool.message.validation.empty' arguments='${firstName}' text='The first name is required' />"); 
		}else{
			$("#formSaveSurvey").submit();
		}
// 		$("#formSaveSurvey").submit();
		
	});
});


</script>

<%
	LoadSurvey loadSurvey=(LoadSurvey)request.getAttribute("loadSurvey");
	ArrayList<Survey> listSurveys=loadSurvey.getListSurveys();
%>

<form class="form-horizontal" id="formSaveSurvey" action="<c:url value="<%=ExecuteConstants.SAVE_SURVEY%>" />" method="post">
	<div class="container">
		<div class="row">
			<div class="col-sm-1">
				<h1 class="glyphicon glyphicon-copy"></h1>
			</div>
			<div class="col-sm-11">
				<h3><spring:message code='smstool.survey.title' text='' /></h3>
				<p><spring:message code='smstool.survey.create.description' text='The survey' /></p>
			</div>
		</div>
		<br>
		<div id="survey_checked"></div>
		<div class="table-responsive" style="height: 320px;">
			<%for (Survey survey : listSurveys) {%>
				<table class="table table-bordered">
					<tr bgcolor="B8AFAF">
						<td colspan="2"><h4><spring:message code='<%=survey.getDescription()%>' text='' /></h4></td>
					</tr>
					<%for (Subcategory subcategory : survey.getListSubcategorys()) { %>
						<tr valign="middle">
							<td width="20%"><h5><spring:message code='<%=subcategory.getDescription() %>' text='' /></h5></td>
							<td width="80%">
								<table class="table" style="border-top: 1px hidden;margin-bottom: 0px;">
									<%for (Question question : subcategory.getListQuestions()) { %>
										<tr>
											<td><spring:message code='<%=question.getDescription()%>' text='' /></td>
											<td align="center" width="20%"><input type="checkbox" value="<%=question.getId()%>" checked></td>
										</tr>
									<%}%>
								</table>
							</td>
						</tr>
					<%}%>
				</table>
			<%}%>
		</div>
		<br>
		<div align="right">
			<button type="button" class="btn btn-success dropdown-toggle" id="save_survey"><spring:message code='smstool.survey.Save' text='' /></button>
		</div>
	</div>
</form>
<%@include file="footer.jsp"%>