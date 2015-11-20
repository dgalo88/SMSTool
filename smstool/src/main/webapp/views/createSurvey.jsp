<%@page import="com.venebel.smstool.model.Question"%>
<%@page import="com.venebel.smstool.model.Subcategory"%>
<%@page import="com.venebel.smstool.model.Survey"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.venebel.smstool.model.LoadSurvey"%>

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
	});
});


</script>

<%
	LoadSurvey loadSurvey=new LoadSurvey();
	ArrayList<Survey> listSurveys=loadSurvey.getListSurveys();
%>
<form class="form-group" id="form_1" name="form_1">
	<div id="survey_checked"></div>
	<div class="container">
		<h1 class="glyphicon glyphicon-list-alt" align="left">Survey</h1>
		<br>
		<br>
		<div class="table-responsive" style="height: 350px;">
			<%for (Survey survey : listSurveys) {%>
				<table class="table table-bordered">
					<tr bgcolor="B8AFAF">
						<td colspan="2"><h4><%=survey.getDescription()%></h4></td>
					</tr>
					<%for (Subcategory subcategory : survey.getListSubcategorys()) { %>
						<tr valign="middle">
							<td width="20%"><h5><%=subcategory.getDescription() %></h5></td>
							<td width="80%">
								<table class="table" style="border-top: 1px hidden;margin-bottom: 0px;">
									<%for (Question question : subcategory.getListQuestions()) { %>
										<tr>
											<td><%=question.getDescription()%></td>
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
			<button type="button" class="btn btn-success dropdown-toggle" id="save_survey">Save</button>
		</div>
	</div>
</form>
<%@include file="footer.jsp"%>