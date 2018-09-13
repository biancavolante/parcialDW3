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
        <title>Cadastro Maquina</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/CadastroMaquina">
            Id da Maquina
            <input type="text" name="IDMaquina"/> <br>
            Nome da Maquina
            <input type="text" name="NomeMaquina"/><br>
            Valor hora
            <input type="text" name="ValorHora"/><br>
           
            <input type="submit" name="ok"/>
        </form>
    </body>
</html>
