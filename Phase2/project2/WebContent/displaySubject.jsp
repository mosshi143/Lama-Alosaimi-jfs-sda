<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Display All subject</h3>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




	<table border="1">
		<tr>
			<th>Subject id</th>
			<th>name</th>
			<th>code</th>


		</tr>
		<c:forEach var="obj" items="${requestScope.subject}">

			<tr>

				<td>${obj.subId}</td>
				<td>${obj.name}</td>
				<td>${obj.code}</td>


			</tr>

		</c:forEach>
	</table>
</body>
</html>