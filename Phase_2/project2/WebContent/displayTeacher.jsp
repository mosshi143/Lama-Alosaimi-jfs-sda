<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Display All teacher</h3>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




	<table border="1">
		<tr>
			<th>Teacher id</th>
			<th>First name</th>
			<th>last name</th>
		

		</tr>
		<c:forEach var="obj" items="${requestScope.teacher}">

			<tr>

				<td>${obj.tecId}</td>
				<td>${obj.fname}</td>
				<td>${obj.lname}</td>
				
			</tr>

		</c:forEach>
	</table>
</body>
</html>