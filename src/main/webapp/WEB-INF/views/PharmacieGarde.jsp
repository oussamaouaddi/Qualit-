<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	border: medium solid #000000;
	width: 70%;
	margin: auto;
}

td, th {
	border: thin solid #6495ed;
	width: 70%;
}
</style>
</head>
<body>
	<c:import url="menu.jsp"></c:import>
	<div id="ListEmployee">

		<table class="table1">
			<tr>
				<th>nom</th>
				<th>adresse</th>
				<th>latitude</th>
				<th>longitude</th>
				<th>telephone</th>


			</tr>
			<tr>


			</tr>

			<c:forEach items="${pharmaciesgardes}" var="emp">
				<tr>
					<td>${emp.nomgarde}</td>
					<td>${emp.adressegarde}</td>
					<td>${emp.latitudegarde}</td>
					<td>${emp.longitudegarde}</td>
					<td>${emp.telephonegarde}</td>

				</tr>

			</c:forEach>

		</table>



	</div>

</body>
</html>