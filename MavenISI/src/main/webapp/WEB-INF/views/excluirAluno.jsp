<%-- 
    Document   : excluirAluno
    Created on : 03/06/2016, 20:47:01
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Excluir Aluno</h1>
        <form action="Controlador/aluno/remover" method="post">
            <h1>Digite o numero de matricula do aluno</h1>
            <div> Numero de matricula <input type="text" name="numMatricula"> </div>

            <input type="submit" value="Enviar">

        </form>


    </body>
</html>
