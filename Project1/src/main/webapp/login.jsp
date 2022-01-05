<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>House Rental MAnagement System</title>
	<link rel="stylesheet" type="text/css" href="CSS/login.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">
		
		    <div class="login">
				<form method="post" action="OwnersLogin.jsp">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="email" name="email" placeholder="Email">
					<input type="password" name="password" placeholder="Password">
					<button>Login</button>
				</form>
			</div>

			<%--<div class="signup">
				<form method="post" action="SignUp">
					<label for="chk" aria-hidden="true">Sign up</label>
					<input type="text" name="username" placeholder="User name">
					<input type="email" name="email" placeholder="Email">
					<input type="password" name="password" placeholder="Password">
					<button>Sign up</button>
				</form>
			</div> --%>

			
	</div>
</body>
</html>