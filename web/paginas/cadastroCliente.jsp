<%-- 
    Document   : cadastroMaquina
    Created on : 13/09/2018, 15:33:58
    Author     : a1712209
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="image/png" href="fenix.png"/>
        <title>Cadastro CLiente</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/CadastroCliente">
            Rg Cliente
            <input type="text" name="RgCliente"/> <br>
            Nome do Cliente
            <input type="text" name="NomeCliente"/><br>
            Endereço
            <input type="text" name="Endereco"/><br>
           Email
            <input type="text" name="Email"/><br>
           Telefone
            <input type="text" name="Telefone"/><br>
            
            <input type="submit" name="ok"/>
        </form>
    </body>
</html>
