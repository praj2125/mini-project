<%@page import="com.project.entity.StickyEntity"%>
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
		<nav class="navbar navbar-expand-md navbar-dark" style="background-color: black">
			<div>
				<a href="index.jsp" class="navbar-brand"> Home </a>
			</div>
				<ul class="navbar-nav">
					<li><form action="fetchSticky.project" class="nav-link">
							<button type="submit">stickys</button>
						</form></li>
				</ul>
				<ul class="navbar-nav navbar-collapse justify-content-end">
					<li><form action="logout.project" method="post">
							<button type="submit" class="glyphicon glyphicon-log-in">Logout</button>
						</form></li>
				</ul>
		</nav>
	</header>
	<div class="container col-md-5 mt-5">
		<div class="card">
			<div class="card-body">
				<form action="editSticky.project" method="post">
					<fieldset class="form-group">
						<label>Sticky Title</label> 
							<input type="text"
								value="<c:out value='${ls.getTitle()}' />" class="form-control"
								name="title" required="required" minlength="5" maxlength="15">
					</fieldset>

					<fieldset class="form-group">
						<label>Sticky Decription</label>
							 <input type="text"
								value="<c:out value='${ls.getDescription()}' />"
								class="form-control" name="description" minlength="5" maxlength="50">
					</fieldset>

					<fieldset class="form-group">
						<label>Sticky Target Date</label> 
							<input type="date"
								value="<c:out value='${ls.getTarget_date()}' />"
								class="form-control" name="target_date" required="required">
					</fieldset>

					<fieldset class="form-group">
						<label>Remarks</label> 
							<input type="text"
								value="<c:out value='${ls.getRemark()}'/>" class="form-control"
								name="remark" minlength="5" maxlength="15"> </select>
					</fieldset>
					<button type="submit" class="btn btn-lg btn-dark w-100">Save</button>
				</form>
			</div>
		</div>
	</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>