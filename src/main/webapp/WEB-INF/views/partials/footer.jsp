<!-- 
 * View that creates the footer on whatever page it's imported on.
 * 
 *
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${pageContext.request.contextPath}/resources/navbar/css/bootstrap-submenu.css">
	<link href="${pageContext.request.contextPath}/resources/navbar/css/font-awesome.min.css" >
	<link href="${pageContext.request.contextPath}/resources/navbar/css/footer.css">      
</head>
<body>
	<div id="footer">
		<div id="container">
			<hr style="border: none; height: 1px; background-color: #EDEDED;">
			<img src="${pageContext.request.contextPath}/resources/Content/Images/Cerner_Footer_Logo.png" />
			<br><br>
			<div class="row-fluid">
				<div class="span12">
					<a href="http://www.cerner.com/Terms_Of_Use/ " style="text-decoration: none;">
						<spring:message code="footer.termsOfUse" text="Terms of Use" /></a>&nbsp; &nbsp; &nbsp;
					<a href="http://www.cerner.com/Privacy/ " style="text-decoration: none;">
						<spring:message code="footer.privacyPolicyAndCookies" text = "Privacy Policy and Cookies" /></a>&nbsp; &nbsp; &nbsp;
					<a href="http://www.cerner.com/GlobalPrivacy/" style="text-decoration: none;">
						<spring:message code="footer.globalPrivacyPolicy" text="Global Privacy policy" /></a>&nbsp; &nbsp; &nbsp;
					<a style = "font-size: xx-small; color: #A6A6A6; text-align: center;">
						<spring:message code= "footer.copyright" text = "COPYRIGHT © 2019 CERNER CORPORATION. ALL RIGHTS RESERVED." /></a>
				</div>
			</div><!--/.row-fluid-->
		</div> <!--/.container-->
	</div>
</body>
</html>