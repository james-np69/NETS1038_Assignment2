<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Sign-up</title>
  <style>
  
  body {
  background-image: url("1214264.jpg");
 background-color: #cccccc;
 }
    form {
      width: 300px;
      margin: auto;
    }
    label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
      text-align: left;
    }
    input {
      width: 100%;
      padding: 5px;
      margin-top: 5px;
    }
  </style>
</head>
<body>

	<div align="center">
		<h1>User Sign-up Form</h1>

		<form action="<%=request.getContextPath()%>/StudentServlet"
			method="post">
			
					<label>User Name</label>
					<input type="text" name="userName"/>
				
				
					<label>User Email</label>
					<input type="email" name="userEmail" required />
			
					<label>Password</label>
					<input type="password" name="password" required pattern=  "^[A-Za-z0-9$%&*]{7,10}$" />
				
					<label>Preferred Name</label>
					<input type="text" name="preferredName" pattern="^[A-Za-z]{1,10}$" />
				
					<label>Name</label>
					<input type="text" name="name" pattern="^[A-Za-z]{1,20}$" />
				
				
			
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>