
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listando com hibernate e vraptor</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Descri��o</th>
				<th>Pre�o</th>
			</tr>
		</thead>
		<tbody>

			<ul>
				<c:forEach items="${produtoList}" var="produto">
					<li>${produto.nome}- ${produto.descricao}</li>
				</c:forEach>
			</ul>
			<c:forEach items="${produtoList}" var="produto">

				<tr>
					<td>${produto.nome }</td>
					<td>${produto.descricao }</td>
					<td>${produto.preco }</td>
					<td><a href="edita?id=${produto.id }">Editar</a></td>
					<td><a href="remove?id=${produto.id }">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>