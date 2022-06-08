<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learners Academy Registration</title>
</head>
<body>
	<h1> Learners Academy Registration Form</h1>
	
	 <form action="<%= request.getContextPath() %>/studentServlet" method="get">
	
	 First Name: <input type="text" name="firstName">
	 <br> <br> 
	  
	 Last Name: <input type="text" name="lastName">
	 <br> <br> 
	
	 Mobile no: <input type="mobile" name="mobileNo">
	 <br> <br> 
	  
	 Password: <input type="password" name="password">
	 <br> <br>
	
	 <tr>
		<td colspan="2" align="center"><input type="submit" value="Register"/></td>
	 </tr>
	 
	 </form>
	
</body>
</html>l>