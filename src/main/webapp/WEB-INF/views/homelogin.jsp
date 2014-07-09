<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	Login!  
</h1>
<c:url value="/login" var = "myUrl"/>
<form:form action="myUrl" method ="POST" commandName="p">

 Username: 
	  <form:input path="username" /><br>
 Password:
  	<form:password  path="password" /><br>
<input type="submit" value="Login"/>
</form:form>
</body>
</html>