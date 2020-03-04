<!-- 
 * View for the Account page of the application
 * 
 *
 -->
 <!-- 
  - Author(s): Kyle Kraft
  - Date: 02/26/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description:
  		- linked header and footer to account page
  		- Added columns and rows for basic account information
  		- Inserted and formatted a dropdown button to change account type
  		- Added and formatted two more buttons for payment method and deleting account
 - Author(s): Kyle Kraft
  - Date: 03/03/2020
  - Copyright Notice: Swoletics
  - @(#)
  - Description:
  		- Added and customized modal windows for payment method and deleting account
  		- Used payform.js (jQuery) and custom JavaScript for credit card client-side form validation	
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<!-- Scripts -->
		
	
	<!-- CSS Links -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
		<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet">
		<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Fitness Tracker - My Account</title>
</head>


<body id="main">

	<header class="sticky-top"> 
		<jsp:include page="/WEB-INF/views/partials/navbar.jsp" />
	</header>

	<div class="mt-2">
		<h1 class="h1">Hello, {user.firstName}</h1>
		<p class="text-center font-italic">Account created on {date}</p>
	</div>
	
	<div class="container">
		<div class="row">
			<div id="accountCategories" class="col d-block p-0">
				<div class="float-right">
					<p class="mb-0 float-right">First Name:</p><br>
					<p class="mb-0 float-right">Last Name:</p><br>
					<p class="mb-0 float-right">Email:</p><br>
					<p class="mb-0 float-right">Account Type:</p><br>
					<div class="btn-group dropright float-right">
					  <button type="button" id="btnAccountChange" class="mt-1 btn btn-sm btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    Change?
					  </button>
					  <div id="accountBtnDrop" class="dropdown-menu">
					    <button class="dropdown-item" type="button"><small>Basic package</small></button>
					    <button class="dropdown-item" type="button"><small>Upgraded package</small></button>
					  </div>
					</div>
				</div>
			</div>
			<div id="accountInfo" class="col d-block p-0">
				<div class="float-left">
					<p class="mb-0">Joe</p>
					<p class="mb-0">Goldberg</p>
					<p class="mb-0">jgoldberg@email.com</p>
					<p class="mb-0">Basic/Upgraded Package</p>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container d-flex flex-column mt-5 pt-5">
		<div class="row d-flex justify-content-center">
			<button id="btnPayment" type="button" class="btn btn-info" data-toggle="modal" data-target="#paymentModal">Payment Method</button>
			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteAccModal">Delete Account</button>
		</div>
	</div>
	
	<footer class="fixed-bottom">
		<jsp:include page="/WEB-INF/views/partials/footer.jsp" />
	</footer>
	
<!---------------MODAL WINDOWS----------------->

	<div class="modal fade" id="paymentModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="paymentForm">Payment Method</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				        <form id="paymentForm">
				        	<div class="container">
				        		<div class="row">
						            <div class="form-group col-9">
						                <label for="owner">Name On Card</label>
						                <input type="text" class="form-control" id="owner">
						            </div>
						            <div class="form-group col">
						                <label for="cvv">CVV</label>
						                <input type="text" class="form-control" id="cvv">
						            </div>
					            </div>
					            <div class="form-group" id="card-number-field">
					                <label for="cardNumber">Card Number</label>
					                <input type="text" class="form-control" id="cardNumber">
					            </div>
					            <div class="row">
						            <div class="form-group col-6 float-left">
						                <label>Expiration Date</label>
						                <select>
						                    <option value="01">January</option>
						                    <option value="02">February </option>
						                    <option value="03">March</option>
						                    <option value="04">April</option>
						                    <option value="05">May</option>
						                    <option value="06">June</option>
						                    <option value="07">July</option>
						                    <option value="08">August</option>
						                    <option value="09">September</option>
						                    <option value="10">October</option>
						                    <option value="11">November</option>
						                    <option value="12">December</option>
						                </select>
						                <select>
						                    <option value="19"> 2019</option>
						                    <option value="20"> 2020</option>
						                    <option value="21"> 2021</option>
						                    <option value="22"> 2022</option>
						                    <option value="23"> 2023</option>
						                    <option value="24"> 2024</option>
						                    <option value="25"> 2025</option>
						                </select>
						            </div>
						            <div class="form-group col-6 float-right pt-4">
						            	<img src="${pageContext.request.contextPath}/resources/img/amex.jpg" class="ccPics float-right" id="amex">
						                <img src="${pageContext.request.contextPath}/resources/img/mastercard.jpg" class="ccPics float-right" id="mastercard">
						                <img src="${pageContext.request.contextPath}/resources/img/visa.jpg" class="ccPics float-right" id="visa">
					            </div>
					            <div class="form-group col">
					                <button type="submit" class="btn btn-default" id="paymentMethodBtn">Confirm</button>
					            </div>
				            </div>
				           </div>
				        </form>
	      </div>
	    </div>
	  </div>
	</div>
	
	<div class="modal fade" id="deleteAccModal" tabindex="-1" role="dialog" aria-labelledby="deleteAccModalTitle" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="deleteAccModalTitle">Are You Sure?</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-footer">
	        <button type="button" id="deleteAccBtn" class="btn btn-primary">Yes</button>
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
	      </div>
	    </div>
	  </div>
	</div>
		
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.0.4/popper.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/paymentFormScripts.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.payform.min.js"></script>
</body>
</html>