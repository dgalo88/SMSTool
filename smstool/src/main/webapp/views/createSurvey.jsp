<%@page import="com.venebel.smstool.model.Question"%>
<%@page import="com.venebel.smstool.model.Subcategory"%>
<%@page import="com.venebel.smstool.model.Survey"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.venebel.smstool.model.LoadSurvey"%>
<%@include file="header.jsp"%>
<%
	LoadSurvey loadSurvey=new LoadSurvey();
	ArrayList<Survey> listSurveys=loadSurvey.getListSurveys();
%>
<form class="form-group" id="form_1" name="form_1">

	<div class="container">
		<h1 class="glyphicon glyphicon-list-alt" align="left">Survey</h1>
		<div class="table-responsive" style="height: 250px;">
			<table class="table table-bordered">
			<% 
				for (Survey survey : listSurveys) {
				%>
					<tr bgcolor="B8AFAF" style="text-indent: 1%">
						<td colspan="2"><%=survey.getDescription()%></td>
					</tr>
				<%
					for (Subcategory subcategory : survey.getListSubcategorys()) {
					%>
						<tr bgcolor="D7D4D4" style="text-indent: 2%">
							<td colspan="2"><%=subcategory.getDescription()%></td>
						</tr>
					<%
						for (Question question : subcategory.getListQuestions()) {
						%>
							<tr style="text-indent: 3%">
								<td style="text-indent: 3%"><%=question.getDescription()%></td>
								<td align="center"><input type="checkbox"></td>
							</tr>
						<%
						}
					}
				}
			%>

			</table>
		</div>
		<br>
		<div align="right">
			<button type="button" class="btn btn-success dropdown-toggle">Save</button>
		</div>
	</div>
</form>
<%@include file="footer.jsp"%>