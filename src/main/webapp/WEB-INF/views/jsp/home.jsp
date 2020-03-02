<!-- 
 * View for the homepage of the application
 * 
 *
 -->
 <!-- 
  - Author(s): Kyle Kraft
  - Date: 02/19/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description:
  		- linked navbar and footer to homepage
  		- customized homepage buttons and centered with bootstrap/flexbox
  		- added new background image and modified with CSS (gradients and background image positioning)
  		- added jQuery to animate/delay hide>fadeIn of h1 and both buttons
  		- used animate CSS and jQuery to add onClick rubber band effect to footer logo
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
	<head>
	<!-- Scripts -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	
	<!-- CSS Links -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
		<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Swoletics - Fitness Tracker</title>
	</head>
	
	<body id="homeMain">
		<script>
			setUserName("${fullName}");
		</script>
		<header class="sticky-top"> 
			<jsp:include page="/WEB-INF/views/partials/navbar.jsp" />
		</header>
		
		<h1 id="welcomeFade" class="main-head mt-5 pt-4">Welcome</h1>
		
		<div id="homeBtns" class="d-flex flex-column">
			<div class="d-flex justify-content-center">
				<button type="button" id="btnWelcome" class="btnFadeTop btn btn-info btn-lg my-2 shadow p-3">Fitness Tracker</button>
			</div>
			<div class="d-flex justify-content-center">
				<button type="button" id="btnWelcome" class="btnFadeBot btn btn-info btn-lg my-2 shadow p-3">Food Log</button>
			</div>
		</div>
		
		<footer class="fixed-bottom">
			<jsp:include page="/WEB-INF/views/partials/footer.jsp" />
		</footer>		
	</body>
</html>