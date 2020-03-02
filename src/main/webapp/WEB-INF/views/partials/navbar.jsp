<!-- 
 * View that creates the navbar on page it's imported on.
 * 
 *
 -->
<!-- 
  - Author(s): Kyle Kraft
  - Date: 02/19/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description:
  		- Used bootstrap to import navbar. Then customized background color and font color of navbar
  		- Added links and custom CSS for active and focus highlighted states of links
  		- Added <p> area for current logged in user email
  		- Added logout button dropdown from bootstrap, then customized dropdown color
  		- Changed icon for logout dropdown button using ionicons 
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="true"%>

<html>
	<head>
		<meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<!-- Scripts -->	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
			
	<!-- CSS Links -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
	</head>
	
	<body>
		<div class="pos-f-t">
		  <div class="collapse" id="navbarToggleExternalContent">
		    <div class="navDarkish p-2">
			      <ul  id="navLinks" class="nav nav-pills">
					  <li class="nav-item">
					    <a class="nav-link" href="#">Home</a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" href="#">Tracker</a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" href="#">Food Log</a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" href="#">Account</a>
					  </li>
					</ul>
		    </div>
		  </div>
		  <nav class="navbar navbar-dark navDarkish">
		  	<div>
			    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
		    </div>
		    <div class="float-right">
		    	<p class="d-inline" id="userFullName"></p>
		    	<div class="btn-group">
				  <button  id="logoutBtn" type="button" class="btn btn-info p-1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				  	<ion-icon class="logoutIcon" name="power-outline"></ion-icon>
				  </button>
				  <div id="logoutBtnDrop" class="dropdown-menu dropdown-menu-right">
				    <form class="mb-0" action="${pageContext.request.contextPath}/logout" method="get">
						<div class="col-sm-10">
							<button type="submit" name="submit" class="dropdown-item">Log Out</button>
						</div>
					</form>
				  </div>
				</div>
			</div>
		  </nav>
		</div>
		
		<script src="https://unpkg.com/ionicons@5.0.0/dist/ionicons.js"></script>
		<script>populateName("userFullName")</script>
	</body>
	
</html>