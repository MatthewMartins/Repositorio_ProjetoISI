<%-- 
    Document   : cadastroAluno
    Created on : 17/05/2016, 15:58:02
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fase de testes</title>
    </head>
    <body>
        
        <form action="Controlador/aluno/adicionar" method="post">
            
            <h1>Cadastro de Aluno</h1>
            <div> Nome <input type="text" name="nome"> </div>
            <div> Idade <input type="text" name="idade"> </div>
            <div> Telefone <input type="text" name="telefone"> </div>
            <div> Rua <input type="text" name="rua"> </div>
            <div> Bairro <input type="text" name="bairro"> </div>
            <div> Cidade <input type="text" name="cidade"> </div>
            <div> Número de Matricula <input type="text" name="numMatricula"> </div>
            <div> Senha <input type="text" name="senha"> </div>
            
            <input type="submit" value="Enviar">
        
        </form>
    </body>
</html>
