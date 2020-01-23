<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page session="false"%>
<%
	String msg = (String) request.getAttribute("msg");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Jsp</title>
</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary"> <a
		class="navbar-brand">User Management</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		<div class="navbar-nav">
			<a class="nav-item nav-link active" href="./Homepage">Home <span
				class="sr-only"></span></a> <a class="nav-item nav-link"
				href="./AddUserJsp">Add User</a> <a class="nav-item nav-link"
				href="./deleteJsp">Delete User</a> <a class="nav-item nav-link"
				href="./updateUserJsp">Update User</a> <a class="nav-item nav-link"
				href="./seachUserJsp">Search User</a> <a
				class="nav-item nav-link" href="./fetchAllUsersServlet">Get all
				User</a> <a class="nav-item nav-link" href="./logout2">Logout</a>
		</div>
	</div>
	</nav>


	<div class="col-md-3 offset-md-3 mt-1">
		<form action="./addUserServlet2" method="post">
			<div class="form-group">
				<label for="email">User Id</label> <input type="number" name="uid"
					id="uid" class=form-control placeholder="User id..." required>
			</div>

			<div class="form-group">
				<label for="username">User Name</label> <input type="text"
					name="username" id="username" class=form-control
					placeholder="User name..." required>
			</div>

			<div class="form-group">
				<label for="email">Email Id</label> <input type="email" name="email"
					id="email" class=form-control placeholder="Email address..."
					required>
			</div>

			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					name="password" id="password" class=form-control
					placeholder="Password" required>
			</div>
			<button type="submit" value="Login"
				class="btn btn-primary btn-lg btn-block">Add User</button>
		</form>
	</div>


	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h4><%=msg%></h4>

	<%
		}
	%>

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>