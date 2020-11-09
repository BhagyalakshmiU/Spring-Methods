<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create an Account</title>
</head>
<body>
<h1>Enter Account Details</h1>
<form:form commandName="aNewAccount" method="post" action="doCreate.html">
<table>

	<tr><td>First Name<form:input path="FirstName" name="FirstName" type="text" /></td></tr>
	<!--<form:errors path="FirstName" cssClass="error"/>-->
	
	<tr><td>Last Name<form:input path="LastName" name="LastName" type="text" /></td></tr>
	<!--<form:errors path="LastName" cssClass="error"/>-->
	
	<tr><td>Age<form:input path="Age" name="Age" type="text" /></td></tr>
	<!--<form:errors path="Age" cssClass="error"/>-->
	
	<tr><td>Address::<form:input path="Address" name="Address" type="text"/></td></tr>
	<!--<form:errors path="Address" cssClass="error"/>-->
	
	<tr><td>Email<form:input path="Email" name="Email" type="text"/></td></tr>
	<!--<form:errors path="Email" cssClass="error"/>-->
	
	<tr><td><input value="Create" type="submit" ></td></tr>
	
</table>
</form:form>
</body>
</html>