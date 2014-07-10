<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="resources/logincss.css">
</head>
<body>

<c:url value="/login" var = "myUrl"/>
<div class ="wrapper">
<form:form cssClass="log" action="${myUrl}" method ="POST" commandName="p">
 <h1>
	 Log in! 
	<span></span> 
 </h1>
 <div>
<label>Username: </label> 
	  <form:input path="username"  /><br>
 <label>Password:</label>
  	 <form:password path="password" /><br>
<input class="button" type="submit" value="LOGIN" />
<c:if test="${k == 1}">
   <p>Error.Please enter your data!</p>
</c:if>   
</div>
</form:form>
</div>
</body>
</html>