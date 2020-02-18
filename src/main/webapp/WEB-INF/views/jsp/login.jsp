<%-- 
 * View for the login page of the application
 *
 *
--%>
<%-- 
  - Author(s): Kyle Kraft
  - Date: 02/10/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description: 
  		- Customized h1 and h2 headings with CSS (font-size, shadow). Created div containers for both headings and buttons, aligned with bootstrap
  		- Applied base background color with CSS gradient
  		- Positioned (absolute, CSS), sized, and colored (shadow) buttons with CSS/bootstrap
  		- Inserted and sized company logo. Added a zoom-in and zoom-out onclick effect with CSS
  		- Added media query to allow buttons to stretch full screen width on larger devices (tablets, landscape mode on phones, desktops) 
  		- Created modal window for login button (bootstrap)
  		- Added link to userSetup page on Register button
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<!-- Scripts -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<!-- CSS Links -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/home.css"
	rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Swoletics - Log In</title>
</head>

<body id="main">
	<div id="container-or" class="container-md">
		<div class="my-5 py-5">
			<input type="checkbox" id="zoomCheck"> <label id="swolezoom"
				for="zoomCheck"> <img
				src="${pageContext.request.contextPath}/resources/img/swoletics-logo.png"
				alt="Swoletics logo" class="logo mt-2" />
			</label>
			<h1 class="h1 main-head mt-3">Swoletics</h1>
			<h2 class="h2">Fitness Tracker</h2>
		</div>
		<div class="pt-5 btn-container">
			<button type="button" id="btn-or"
				class="btn btn-info btn-lg my-4 shadow p-3" data-toggle="modal"
				data-target="#login">Log In</button>
			<button type="button" id="btn-or"
				class="btn btn-info btn-lg my-4 shadow p-3"
				onclick="location.href ='${pageContext.request.contextPath}/userSetup'">Register</button>
		</div>
	</div>

	<!-- MODAL WINDOW -->

	<div class="modal fade" id="login" tabindex="-1" role="dialog"
		aria-labelledby="login form" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalCenterTitle">Swoletics
						- Log In</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form name='login'
						action="${pageContext.request.contextPath}/login" method='POST'>
						<div class="form-group row">
							<div class="col-sm-10">
								<input type="email" class="form-control" name="username"
									id="inputEmail3" placeholder="Email">
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<input type="password" name="password" class="form-control"
									id="inputPassword3" placeholder="Password">
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-2"></div>
							<div class="col-sm-10">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" id="gridCheck1">
									<label class="form-check-label" for="gridCheck1">
										Remember me? </label>
								</div>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" name="submit" id="btn-or"
									class="btn btn-primary">Log In</button>
							</div>
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>

<!-- #4d8fac -->