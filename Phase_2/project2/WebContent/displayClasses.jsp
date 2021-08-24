<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Display All Classes</h3>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




	<table border="1">
		<tr>
			<th>Class id</th>
			<th>Teacher</th>
			<th>Subject</th>
			<th>Time</th>

		</tr>
		<c:forEach var="obj" items="${requestScope.classes}">

			<tr>

				<td>${obj.clasesId}</td>
				<td>${obj.teacherId}</td>
				<td>${obj.subjectId}</td>
				<td>${obj.time}</td>


			</tr>

		</c:forEach>
	</table>
</body>
</html>