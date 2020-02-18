<%-- 
 * View for the User Setup page of the application
 * 
 *
 --%>
<%-- 
  - Author(s): Kyle Kraft
  - Date: 02/10/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description: 
  		- Created user registration form (bootstrap/CSS)
  		- Added media query so form cannot exceed 540px in width
  		- Added custom radio buttons so user can choose account type
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
<title>Swoletics - Registration</title>
</head>

<body id="main">
	<div id="register-form" class="container">
		<div class="my-3">
			<h1 class="h1">Create Account</h1>
		</div>
		<div class=" px-3">
			<form method="POST"
				action="${pageContext.request.contextPath}/register">
				<div class="form-group row">
					<div class="col">
						<input type="text" class="form-control" placeholder="First name">
					</div>
					<div class="col">
						<input type="text" class="form-control" placeholder="Last name">
					</div>
				</div>
				<div class="form-group">
					<input name="username" type="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp"
						placeholder="Email"> <small id="emailHelp"
						class="form-text text-muted"></small>
				</div>
				<div class="form-group">
					<input name="password" type="password" class="form-control"
						id="exampleInputPassword1" placeholder="Password">
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="exampleRadios"
						id="exampleRadios1" value="option1" checked> <label
						class="form-check-label" for="exampleRadios1"> <small>Fitness
							tracker only</small>
					</label>
				</div>
				<input name="enabled" type="hidden" value="1">
				<div class="form-check">
					<input class="form-check-input" type="radio" name="exampleRadios"
						id="exampleRadios2" value="option2"> <label
						class="form-check-label" for="exampleRadios2"> <small>Fitness
							tracker + Custom workout and diet plans</small>
					</label>
				</div>
				<div class="col-sm-10">
					<button type="submit" name="submit" id="btn-or"
						class="btn btn-primary">Sign Up</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>