<!-- 
 * View for the User Setup page of the application
 * 
 *
 -->
 <!-- 
  - Author(s): Kyle Kraft
  - Date: 02/10/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description: 
  		- Created user registration form (bootstrap/CSS)
  		- Added media query so form cannot exceed 540px in width
  		- Added custom radio buttons so user can choose account type
  - Date: 02/16/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description: 
  		- Added birth date section with dropdowns for month, year, and day
  		- Created a script (js) to populate the appropriate months, days, and years into the select options
  - Date: 02/18/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description: 
  		- Added height, weight, plan selection, and goal weight inputs and submit button
  		- used jQuery to disable inputs and make custom plan part of the form fade in and out on radio toggle click
  		- Added delay and fadeIn/Out on submit button with jQuery
--!>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head>
		<!-- Scripts -->	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
		
		<!-- CSS Links -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Swoletics - Registration</title>
	</head>
	
	<body id="main">
		<div id="register-form" class="container">
			<div class="my-3">
				<h1 class="h1">Create Account</h1>	
			</div>
			<div class=" px-3">
				<form method="POST" action="${pageContext.request.contextPath}/register">
				  <div class="form-group row">
				    <div class="col">
				      <input type="text" class="form-control" placeholder="First name">
				    </div>
				    <div class="col">
				      <input type="text" class="form-control" placeholder="Last name">
				    </div>
				  </div>
				  <div class="form-group">
				    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email">
				    <small id="emailHelp" class="form-text text-muted"></small>
				  </div>
				  <div class="form-group">
				    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
				  </div>
				  	<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="trackerRadio" value="option1" checked>
						  <label class="form-check-label" for="trackerRadio">
						    <small>Fitness tracker only</small>
						  </label>
					</div>
					<div class="form-check">
						  <input class="form-check-input" type="radio" name="exampleRadios" id="planRadio" value="option2">
						  <label class="form-check-label" for="planRadio">
						    <small>Fitness tracker + Custom workout and diet plans</small>
						  </label>
					</div>
					<div id="planForm">
						<div class="form-group mt-1 mb-0">
						    <label for="monthDrop">Birthday :</label>
						    	<div class="form-row"> 
						    		<div class="form-group col-4">
									    <select class="form-control form-control-sm" id="monthDrop" onchange="setDaysValue('monthDrop', 'yearDrop')">
									    </select>
								    </div>
								    <div class="form-group col-3">
									    <select class="form-control form-control-sm" id="dayDrop">
									    </select>
									 </div>
									 <div class="form-group col-5">
									    <select class="form-control form-control-sm" id="yearDrop" onchange="setDaysValue('monthDrop', 'yearDrop')">
									    </select>
								    </div>
							    </div>
						  </div>	
						  <div class="form-row">
								<div class="form-group col-3">
									    <label for="heightFt">Height :</label>
									    <input type="text" class="form-control" id="heightFt" placeholder="feet">
								</div>
								<div class="form-group col-3">
								    	<label for="heightIn">&nbsp;</label>
								    	<input type="text" class="form-control" id="heightIn" placeholder="inches">
								</div>
								<div class="form-group col-6">
									    <label for="weight">Weight :</label>
									    <input type="text" class="form-control" id="weight" placeholder="lbs">
								</div>
						</div>
						<div class="form-row">
							<div class="form-group col">
						      <label for="planSelect">Plan Selection :</label>
						      <select id="planSelect" class="form-control">
						        <option>Keto</option>
						        <option>Paleo</option>
						      </select>
						    </div>
							<div class="form-group col">
							    <label for="goalWeight">Goal Weight :</label>
							    <input type="text" class="form-control" id="goalWeight">
							</div>
						</div>
					</div>
					<button type="submit" name="submit" id="btn-or" class="fadeBtn btn btn-info btn-lg shadow p-3 float-right mt-3">Submit</button>
				</form>
			</div>
		</div>
		
		<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	</body>	
</html>
