<!-- 
 * View for the homepage of the application
 * 
 *
 -->
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
<link
	href="${pageContext.request.contextPath}/resources/navbar/css/home.css"
	rel="stylesheet">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Fitness Tracker</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/logout" method="get"
		style="float: right;">
		<div class="col-sm-10">
			<button type="submit" name="submit" id="btn-or"
				class="btn btn-primary">Log Out</button>
		</div>
	</form>
	<h1>
		Welcome to the Fitness Tracker <b>${userName}</b>
	</h1>
</body>
</html>