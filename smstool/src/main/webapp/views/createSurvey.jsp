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
		<div class="table-responsive" style="height: 350px;">
<!-- 			<table class="table table-bordered"> -->
<%-- 			<%  --%>
<!-- // 				for (Survey survey : listSurveys) { -->
<%-- 				%> --%>
<!-- 					<tr bgcolor="B8AFAF" style="text-indent: 1%"> -->
<%-- 						<td colspan="2"><%=survey.getDescription()%></td> --%>
<!-- 					</tr> -->
<%-- 				<% --%>
<!-- // 					for (Subcategory subcategory : survey.getListSubcategorys()) { -->
<%-- 					%> --%>
<!-- 						<tr bgcolor="D7D4D4" style="text-indent: 2%"> -->
<%-- 							<td colspan="2"><%=subcategory.getDescription()%></td> --%>
<!-- 						</tr> -->
<%-- 					<% --%>
<!-- // 						for (Question question : subcategory.getListQuestions()) { -->
<%-- 						%> --%>
<!-- 							<tr style="text-indent: 3%"> -->
<%-- 								<td style="text-indent: 3%"><%=question.getDescription()%></td> --%>
<!-- 								<td align="center"><input type="checkbox"></td> -->
<!-- 							</tr> -->
<%-- 						<% --%>
<!-- // 						} -->
<!-- // 					} -->
<!-- // 				} -->
<%-- 			%> --%>

<!-- 			</table> -->

<!-- 			<div class="table-responsive" style="height: 250px;"> -->
				<table class="table table-bordered">
					<tr bgcolor="B8AFAF">
						<td colspan="2"><h4>Learning</h4></td>
					</tr>
					<tr valign="middle">
						<td width="20%"><h5>Motivation</h5></td>
						<td width="80%">
							<table class="table" bordercolor="#FFFFFF" style="margin-bottom: 0px;">
								<tr>
									<td>The young person is interest in learning new things</td>
									<td align="center" width="20%"><input type="checkbox"></td>
								</tr>
								<tr>
									<td>The young person attends regularly </td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can do something that benefits him/her, even if he/she does not like or find it boring</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person makes an effort</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person wants to learn for the purpose of gaining certification</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person requests work</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person displays interest in teaching material</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr bgcolor="D7D4D4">
						<td colspan="2"></td>
					</tr>
					<tr valign="middle">
						<td width="20%">Independence</td>
						<td width="80%">
							<table class="table" bordercolor="#FFFFFF" style="margin-bottom: 0px;">
								<tr>
									<td>The young person can work on his/her own initiative</td>
									<td align="center" width="20%"><input type="checkbox"></td>
								</tr>
								<tr>
									<td>The young person can organise his/her own class materials</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can ask for help when required</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can source information independently</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can complete tasks on his/her own</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can make independent decisions</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
							</table>
						</td>
					</tr>
<!-- 					<tr bgcolor="D7D4D4"> -->
<!-- 						<td colspan="2"></td> -->
<!-- 					</tr> -->
				</table>
				<table class="table table-bordered">
					<tr bgcolor="B8AFAF">
						<td colspan="2"><h4>Social</h4></td>
					</tr>
					<tr valign="middle">
						<td width="20%"><h5>Situational awareness</h5></td>
						<td width="80%">
							<table class="table" bordercolor="#FFFFFF" style="margin-bottom: 0px;">
								<tr>
									<td>The young person adapt his/her language in relation to whom he/she is talking to</td>
									<td align="center" width="20%"><input type="checkbox"></td>
								</tr>
								<tr>
									<td>The young person complies with the written and unwritten rules in a familiar teaching situation</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person complies with the written and unwritten rules in an unfamiliar teaching situation</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person complies with the written and unwritten rules within a classroom context</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person complies with the written and unwritten rules in informal situations</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person  deal effectively with people in a variety of contexts</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person express emotions appropriately according to the setting</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr bgcolor="D7D4D4">
						<td colspan="2"></td>
					</tr>
					<tr valign="middle">
						<td width="20%">Cooperation</td>
						<td width="80%">
							<table class="table" bordercolor="#FFFFFF" style="margin-bottom: 0px;">
								<tr>
									<td>The young person can work in a group</td>
									<td align="center" width="20%"><input type="checkbox"></td>
								</tr>
								<tr>
									<td>The young person can work in a group although he/she did not choose the group members</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person takes responsibility in the group</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person accepts diversity within the group</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person can tolerate opinions different to their own</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
																<tr>
									<td>The young person listens to others in the group</td>
									<td align="center"><input type="checkbox"></td>
								</tr>
							</table>
						</td>
					</tr>
<!-- 					<tr bgcolor="D7D4D4"> -->
<!-- 						<td colspan="2"></td> -->
<!-- 					</tr> -->
				</table>
<!-- 			</div> -->
		</div>
		<br>
		<div align="right">
			<button type="button" class="btn btn-success dropdown-toggle">Save</button>
		</div>
	</div>
</form>
<%@include file="footer.jsp"%>