<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	Login!  
</h1>
<form action="demo_form.asp" method="get">
  Username: <input type="text" name="fname"><br>
  Password: <input type="text" name="lname"><br>
  <input type="submit" value="Login">
</form>
</body>
</html>