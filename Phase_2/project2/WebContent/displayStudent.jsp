<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Display All student</h3>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




	<table border="1">
		<tr>
			<th>Student id</th>
			<th>First name</th>
			<th>last name</th>
			<th>class</th>


		</tr>
		<c:forEach var="obj" items="${requestScope.student}">

			<tr>

				<td>${obj.stuId}</td>
				<td>${obj.fname}</td>
				<td>${obj.lname}</td>
				<td>${obj.classe}</td>

			</tr>

		</c:forEach>
	</table>
</body>
</html>