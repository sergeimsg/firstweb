<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
</head>
<body bgcolor="yellow">

	<h2> <font color="blue"> To enter, please register </font></h2>
	
	
	<form action="register" method="post">
	<label> Name: </label>
	<input type="text" name="name" /> 
	
	<br>
	<br>
	<label> Surname: </label>
	<input type="text" name="surname"> 
	<br>
	<br>
	<label> Age: </label>
	<input type="text" name="age"> 
	<br>
	<br>
	<label> Language: </label>
	<select name="language">
		<option>English</option>
		<option>French</option>
		<option>Belarus</option>
		<option>Chinese</option>
	
	 </select>
	
	<br>
	<br>
	
	<label>Framework: </label>
	<input type="checkbox" name="framework" value="Maven">Maven
	<input type="checkbox" name="framework" value="Hibernate">Hibernate
	<input type="checkbox" name="framework" value="Spring">Spring
	
	<br>
	<br>
	<input type="submit" value="send">
	
	<br>
	<br>
	<p><font color="green"> If register go to  </font>  
	<a href="authorization.jsp"> authorization> </a>  </p>
	 
	
	
	</form>


</body>
</html>