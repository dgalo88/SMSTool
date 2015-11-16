
	<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

	<nav class="navbar navbar-default text-center">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
						data-target="#navbar-collapsible" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">
					<img src="<c:url value="/resources/images/smart.jpg"/>" alt="SmartLogo" style="width: 65px;">
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-collapsible">
				<ul class="nav navbar-nav">
					<li class="active">
						<a href="#">
							<spring:message code="smstool.home" text="Home"/>
							<span class="sr-only">(current)</span>
						</a>
					</li>
					<li><a href="#"><spring:message code="smstool.about" text="About"/></a></li>
					<li><a href="#"><spring:message code="smstool.contact" text="Contact"/></a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
