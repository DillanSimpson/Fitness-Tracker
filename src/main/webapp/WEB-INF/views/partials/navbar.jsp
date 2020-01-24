<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>
<html>
<head>
	<fmt:setBundle basename="i18n-resources" />
	<meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="${pageContext.request.contextPath}/resources/navbar/css/navbar.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/resources/javascript/menuToggler.js"></script>
</head>
<body>
	<!-- Navbar that becomes vertical on small screens -->
	<nav class="navbar navbar-expand-sm navbar-custom">
		<!-- Brand -->
		<a class="navbar-brand" href="/fitnesstracker/home">
			Fitness Tracker
		</a>
		<!-- Toggler/collapsible Divison -->
		<div class="navbar-toggler" data-toggle="collapse" 
			data-target="#main-nav-collapse" onclick = "toggleMenuIcon(this)">
				<div class="upper-bar"></div>
				<div class="middle-bar"></div>
				<div class="lower-bar"></div>
		</div>
		<!-- Navbar links -->
		<div class="collapse navbar-collapse" id="main-nav-collapse">
			<ul class="navbar-nav">
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbardrop"
						data-toggle="dropdown"> 
					</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" data-toggle="modal" data-target="#contributionModal"> 
						</a> 
					</div>
				</li>
			</ul>
			<!-- NavBar link to display in the right side-->
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> 
						<i class="fa fa-user" aria-hidden="true"></i>
							${sessionScope.lastName},${sessionScope.firstName}
					</a>
					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="/fitnesstracker/myAccount">
							<spring:message code="navbar.userDropdownMenuMyAccount" text="My Account" />
						</a>						
						<a class="dropdown-item" href="/fitnesstracker/logoutUser"> 
							<spring:message code="navbar.userDropdownMenuLogout" text="Logout"></spring:message>
						</a>
					</div>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>