<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <html>
<head>
<title>Sticky Form</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black">
			<div>
				<a href="index.jsp" class="navbar-brand"> Home
					</a>
			</div>

			<ul class="navbar-nav">
				<li><form action="fetchSticky.project"
					class="nav-link"><button type="submit">stickys</button></form></li>
			</ul>
			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><form action="logout.project" method="post"><button type="submit" class="glyphicon glyphicon-log-in"> Logout</button></form></li>
			</ul>
		</nav>
	</header>
	<div class="container col-md-5 mt-5">
		<div class="card">
			<div class="card-body">
			<form action="addSticky.project" method="post">
				<fieldset class="form-group">
					<label>STICKY TITLE</label> <input type="text"
						 class="form-control"
						name="title" required="required" minlength="5" maxlength="15">
				</fieldset>

				<fieldset class="form-group">
					<label>STICKY DESCRIPTION</label> <input type="text"
						 class="form-control"
						name="description" minlength="5" maxlength="50">
				</fieldset>

				<fieldset class="form-group">
					<label>STICKY TARGET DATE</label> <input type="date"
						 class="form-control"
						name="target_date" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>REMARKS</label> <input type="text"
					class="form-control"
						name="remark" minlength="3" maxlength="15">
						
					</select>
				</fieldset>
				<button type="submit" class="btn btn-lg btn-dark w-100">SAVE</button>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>