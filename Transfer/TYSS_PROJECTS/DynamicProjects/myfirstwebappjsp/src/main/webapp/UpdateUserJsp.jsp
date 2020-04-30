<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
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
	<div class="col-md-3 offset-md-7 mt-1">
		<form action="./updateUser2" method="post">
			<div class="form-group">
				<label for="email">User Id</label> <input type="number" name="uid"
					id="uid" class=form-control placeholder="User id..." required>
			</div>

			<div class="form-group">
				<label for="username">User Name</label> <input type="text"
					name="username" id="username" class=form-control
					placeholder="User name...">
			</div>

			<div class="form-group">
				<label for="email">Email Id</label> <input type="email" name="email"
					id="email" class=form-control placeholder="Email address...">
			</div>

			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					name="password" id="password" class=form-control
					placeholder="Password">
			</div>
			<button type="submit" value="Login"
				class="btn btn-primary btn-lg btn-block">Update User</button>

		</form>
	</div>

	<%
		String msg = (String) request.getAttribute("msg");
		if (msg != null && !msg.isEmpty()) {
	%>
	<%=msg%>
	<%
		}
	%>
</body>
</html>