<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register</title>
</head>
<body>
 <form action="login" method="post">
      <label for="username">User name:</label>
      <input type="text" name="username"/>
      <br>
      <label for="password">Password: </label>
      <input type="password" name="password"/>
      <input type="submit" value="Say Hello"/>
   </form>
</body>
</html>