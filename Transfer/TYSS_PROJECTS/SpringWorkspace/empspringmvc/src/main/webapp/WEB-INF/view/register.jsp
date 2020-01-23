<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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

	<div class="col-md-3 offset-md-3 mt-1">
		<form action="./register" method="post">
			<fieldset class="form-group">
				<div class="form-group">
					<legend>Employee Details</legend>
					<label for="name">Name</label> <input type="text" name="name"
						id="name" class=form-control placeholder="name..." required>
				</div>

				<div class="form-group">
					<label for="email">Email Id</label> <input type="email"
						name="email" id="email" class=form-control
						placeholder="Email address..." required>
				</div>

				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						name="password" id="password" class=form-control
						placeholder="Password..." required>
				</div>
			</fieldset>

			<fieldset class="form-group">
				<legend>Employee Address 1</legend>
				<div class="form-group">
					<select name="addressBeans[0].addType">
					<option>----Select------</option>
						<option value="P">Permanent Address </option>
						<option value="C">Current Address</option>
					</select> <br>
					<br>
				</div>

				<div class="form-group">
					<label for="address1">Address1</label> <input type="text" name="addressBeans[0].address1" id=address1" class=form-control placeholder="Address1..."
						required>
				</div>

				<div class="form-group">
					<label for="address2">Address2</label> <input type="text" name="addressBeans[0].address2" id="address2" class=form-control
						placeholder="Address2..." required>
				</div>
			</fieldset>

		<fieldset class="form-group">
				<legend>Employee Address 2</legend>
				<div class="form-group">
					<select name="addressBeans[1].addType">
					<option>----Select------</option>
						<option value="P">Permanent Address </option>
						<option value="C">Current Address</option>
					</select> <br>
					<br>
				</div>

				<div class="form-group">
					<label for="address1">Address1</label> <input type="text" name="addressBeans[1].address1" id=address1" class=form-control placeholder="Address1..."
						required>
				</div>

				<div class="form-group">
					<label for="address2">Address2</label> <input type="text" name="addressBeans[1].address2" id="address2" class=form-control
						placeholder="Address2..." required>
				</div>
			</fieldset>
			

			<button type="submit" value="Login"
				class="btn btn-primary btn-lg btn-block">Register</button>
		</form>
	</div>



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