
<%@include file="header.jsp"%>

<style type="text/css">
.loginLeftImage {
 	background: url(/SMSTool/resources/images/loginLeft.png) no-repeat top right;
 	height: 79vh;
}
</style>

<div class="container-fluid">

	<div class="row">
		<div class="col-xs-6 loginLeftImage"></div>
		<div class="col-xs-6">
			<br>
			<div class="panel panel-default" style="width: 50%">
				<div class="panel-heading">
					<h3 class="panel-title">
						<spring:message code="smstool.login.please" text="Please sign in"/>
					</h3>
				</div>
				<div class="panel-body">
					<form accept-charset="UTF-8" role="form">
						<fieldset>
							<div class="form-group">
								<input type="text" class="form-control" id="username" name="username"
										placeholder="<spring:message code="smstool.login.username" text="Username"/>">
							</div>
							<div class="form-group">
								<input type="password" class="form-control" id="password" name="password" value=""
										placeholder="<spring:message code="smstool.login.password" text="Password"/>">
							</div>
							<div class="checkbox">
								<label>
									<input type="checkbox" id="remember" name="remember"
											value="<spring:message code="smstool.login.remember" text="Remember Me"/>">
									<spring:message code="smstool.login.remember" text="Remember Me"/>
								</label>
							</div>
							<input class="btn btn-lg btn-success btn-block" type="submit"
									value="<spring:message code="smstool.login" text="Login"/>">
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="footer.jsp"%>
