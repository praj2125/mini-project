<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Sticky Note Project</title>
		<meta name="viewport"
					content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<link rel="stylesheet"
					href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
		<link
					href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
					rel="stylesheet">
	</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-6 col-md-6 d-none d-md-block image-container">
					<img src="image/back5.webp" width="1350px" height="650px" align="center">
			</div>

					<div class="col-lg-6 col-md-6 form-container" style="margin-top: 300px;">
						<div class="col-lg-8 col-md-12 col-sm-9 col-xs-12 form-box text-center">
							<div class="logo mb-3"></div>
								<div class="heading mb-4">
									<h4>WELCOME TO STICKY NOTE APP</h4>
								</div>

	                           <div>
									<a href="Login.jsp" class="btn btn-success btn-lg btn-block">Login</a>
									<a href="register.jsp" class="btn btn-primary btn-lg btn-block">Signup</a>
							</div>
					</div>
				</div>
			</div>
		</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>