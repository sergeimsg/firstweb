<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="by.it.academy.htp.bean.User" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
		User userN = (User) request.getAttribute("user1");
	
		if (userN == null) {
			userN = new User();
		}
		out.println("Age: " + userN.getAge());
		out.println("<br>");
		%>
		<%
		out.println("Name: " + userN.getSurname());
		
  	%>
  
	<br>
	<hr>
	<jsp:useBean id="user1" class="by.it.academy.htp.bean.User" scope="request" ></jsp:useBean>
	<p> Age: <jsp:getProperty property="age" name="user1"/></p>
	
	Name: <jsp:getProperty property="name" name="user1"/>
			
	<hr/>
       
       
        <c:forEach var="elem" items="${user1.framework}">
        
        ${elem}
                   
        </c:forEach>
        <br>
        
   
	

</body>
</html>