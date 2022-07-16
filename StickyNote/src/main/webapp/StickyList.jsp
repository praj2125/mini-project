<%@page import="com.project.entity.StickyEntity"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Sticky List</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>

		<header>
			<nav class="navbar navbar-expand-md navbar-dark"
				style="background-color: black">
				<div>
					<a  class="navbar-brand"> StickyNote</a>
				</div>

				<ul class="navbar-nav">
					<li><a href="loginHome.jsp" class="nav-link">Profile</a></li>
				</ul>

				<ul class="navbar-nav navbar-collapse justify-content-end">
					<li><form action="logout.project" >
							<button type="submit" class="glyphicon glyphicon-log-out">
								Logout</button>
						</form></li>
				</ul>
			</nav>
		</header>
<form action="fetchSticky.project" method="post">
		<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">
				<h3 class="text-center">List of stickys</h3>
				<hr>
				<div class="container text-left">

					<a href="Sticky_Form.jsp" class="btn btn-outline-success">Add
						Sticky</a>
				</div>
				<br>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Title</th>
							<th>Target Date</th>
							<th>Description</th>
							<th>Remarks</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${ list }" var="st">
							<tr>
								<td><c:out value="${ st.title }" /></td>
								<td><c:out value="${ st.target_date }" /></td>
								<td><c:out value="${ st.description }" /></td>
								<td><c:out value="${ st.remark }" /></td>
								<td>
									<form action="updateSticky.project">
										<button class="btn btn-sm btn-primary" type="submit"
											value=<c:out value='${st.id}' /> name="ud" id="ud">Update</button>
									</form> &nbsp;&nbsp;&nbsp;&nbsp;
									</td>

                                    <td>
									<form action="deleteSticky.project">
										<button class="btn btn-sm btn-danger" type="submit"
											onclick="if(!(confirm('Are you sure want to delete this Sticky ?'))) return false"
											value=<c:out value='${st.id}' /> name="id" id="id">Delete</button>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

