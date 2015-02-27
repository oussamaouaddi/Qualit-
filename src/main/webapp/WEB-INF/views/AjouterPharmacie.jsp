<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="menu.jsp"></c:import>
<div id="formEmployee">
		<f:form modelAttribute="pharmacie" method="POST" action="savePharmacie">
			<table>
				<tr>
					<td>nom</td>
					<td><f:input path="nom" /></td>
				</tr>

				<tr>
					<td>adresse</td>
					<td><f:input path="adresse" /></td>

				</tr>
				<tr>
					<td>latitude</td>
					<td><f:input path="latitude" /></td>
				</tr>
				<tr>
					<td>longitude</td>
					<td><f:input path="longitude" /></td>
				</tr>
				<tr>
					<td>telephone</td>
					<td><f:input path="telephone" /></td>
				</tr>


				<tr>
					<td></td>
					<td><input type="submit" value="enregister"> </td>
				</tr>


			</table>
		</f:form>


	</div>
</body>
</html>