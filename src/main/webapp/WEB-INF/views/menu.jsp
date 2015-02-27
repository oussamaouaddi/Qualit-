<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body, p {
font: normal 8pt verdana, helvetica, sans-serif;
}
 .menu{
	border: thin solid #6495ed;
	width: 50%;
	}
  .menu{
     margin:auto;
  }
</style>
<title>Menu JSP</title>
</head>
<body>
	<div class="menu">
		<p>
			<a href="<c:url value="/indexPharmacie"/>">Tous les Pharmacies </a>
		</p>
		<p>
			<a href="<c:url value="/ajoutPharmacie"/>">Ajout d'un nouveau pharmacie </a>
		</p>
		<!-- <p>
			<a href="<c:url value="/indexPharmacieGarde"/>">Tous les pharmacie de Garde</a>
		</p>
		<p>
			<a href="<c:url value="/ajoutPharmacieGarde"/>">Ajouter un pharmacie de garde</a>
		</p> -->
	</div>
</body>
</html>