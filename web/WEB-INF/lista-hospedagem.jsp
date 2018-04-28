<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospedagens</title>
    </head>
    <body>
        <h1>Hospedagens Disponíveis</h1>
        <table class="table table-dark">
            <thead>
                <th>Nome</th>
                <th>Email</th>
                <th>Endereço</th>
                <th>Telefone</th>
                <th>Cargo</th>
            </thead>
            <tbody>
                <c:forEach var="hospedagem" items="${hospedagens}">
                <tr>
                    <td>${hospedagem.nome}</td>
                    <td>${hospedagem.email}</td>
                    <td>${hospedagem.endereco}</td>
                    <td>${hospedagem.telefone}</td>
                    <td>${hospedagem.cargo}</td>                    
                </tr>
            </c:forEach>
            </tbody>
    </body>
</html>
