<%-- 
    Document   : buscarAluno
    Created on : 04/06/2016, 17:06:06
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Aluno</title>
    </head>
    <body>
        <h1>Buscar Aluno</h1>
        
        <form action="aluno/buscar " method="post">
            <!--SHAKE, PODEMOS TAMBEM PESQUISAR ALUNO POR NOME VISSE, SE TU QUISER, ME DIZ QUE EU FAÇO AQUI, AI 
                VC COLOCA UMA OPÇÃO QUANDO ELE CLICAR PRA BUSCAR ALUNO, SE ELE QUER POR NUMERO DE MATRICULA OU
                POR NOME, SE ELE CLICAR PARA PESQUISAR POR NUMERO DE MATRICULA VC COLOCA ESSE FORMULARIO AQUI DE BAIXO
                CASO FOR POR NOME, ME AVISA SE FOR COLOCAR PQ EU IMPLEMENTO AQUI
            -->
            <div> Informe o numero de matricula do Aluno: <input type="text" name="numMatricula"> </div>
            <input type="submit" value="Enviar">
       
        </form>
    </body>
</html>
