<!-- 
 * View that creates the footer on page it's imported on.
 * 
 *
 -->
<!-- 
  - Author(s): Kyle Kraft
  - Date: 02/19/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description:
  		- created footer container and two divs for company name and company logo
  		- customized company name text and company logo size with CSS 
  		- linked animate CSS used jQuery to animate company logo on click
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Scripts -->

<!-- CSS Links -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
	<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
</head>

<body>

	<footer id="foot" class="py-1">
		<div class="container">
			<div class="float-left">
				<h3 class="h3">swoletics</h3>
			</div>
			<div class="float-right pt-1">
				<img src="${pageContext.request.contextPath}/resources/img/swoletics-logo.png" alt="Swoletics logo" class="footerLogo" />
			</div>
		</div>
	</footer>
	
</body>

</html>