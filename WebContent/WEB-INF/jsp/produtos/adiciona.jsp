<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>produto adicionado com sucesso!

<li><a href="<c:url value="/produtos/lista"/>">
Lista Produtos
</a></li>

<li><a href="<c:url value="/produtos/formulario"/>">
Novo Produto
</a></li>
</body>
</html>