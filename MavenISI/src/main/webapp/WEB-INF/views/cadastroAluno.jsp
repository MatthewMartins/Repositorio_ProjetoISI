<%-- 
    Document   : cadastroAluno
    Created on : 17/05/2016, 15:58:02
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Cadastrar Aluno</title>
    <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/mavenprojetoISI/css/normalize.css">
    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="/mavenprojetoISI/css/style.css">
    <link rel="stylesheet" href="/mavenprojetoISI/css/styles.css">
     <link rel="stylesheet" type="text/css" href="/mavenprojetoISI/css/style.css" />
  </head>

  <body>
  	
    	<h1>Academia FitPro - <span>Cadastrar Aluno</span></h1>
    	<hr>

        <div id="formulario">
            <form action="aluno/adicionar" method="post">
    <fieldset>
        <fieldset class="grupo">
            <div class="campo">
            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" style="width: 25em" value="" placeholder="Nome Completo">
        </div>  
        

        <div class="campo">
            <label for="idade">Idade</label>
            <input type="number" name="idade" min="1" max="90">
        </div>
</br>
        <div class="campo">
            <label for="telefone">Telefone</label>
            <input type="text" id="telefone" name="telefone" style="width: 10em"  value="" placeholder="(xx)xxxx-xxxx"  />
        </div>
        </fieldset>   
        <fieldset class="grupo">
            <div class="campo">
                <label for="rua">Rua</label>
                <input type="text" id="rua" name="rua" style="width: 40em" value="" />
            </div>
        
            <div class="campo">
                <label for="bairro">Bairro</label>
                <input type="text" id="bairro" name="bairro" style="width: 30em" value="" />
            </div>   
            <div class="campo">
                <label for="cidade">Cidade</label>
                <input type="text" id="cidade" name="cidade" style="width: 10em" value="" />
            </div>

        </fieldset>

      </fieldset>

      <fieldset>
        <fieldset class="grupo">
            <div class="campo">
                <label for="numMatricula">Nº da Matrícula</label>
                <input type="text" id="numMatricula" name="numMatricula" style="width: 10em" value="" />
            </div>
            
            <div class="campo">
                <label for="senha">Senha</label>
                <input type="password" id="password" name="senha" style="width: 10em" value="" />
            </div>

 </fieldset>
 
        <button type="submit">Cadastrar</button>
 
    </fieldset>
</form>

</div>

		<div id="nav" class="nav">
			<div class="icon">
				<ul>
					</br></br></br></br>
					<li><a href=""><i></i></a></li>
                                        <li><a href=""><i></i></a></li>
                                         <li><a href="index"><i class="fa fa-home"></i></a></li>
                                        <li><a href=""><i class="fa fa-plus-circle"></i></a></li>
					<li><a href="excluirAluno"><i class="fa fa-close "></i></a></li>
					<li><a href="atualizarAluno"><i class="fa fa-refresh"></i></a></li>
					<li><a href="buscarAluno"><i class="fa fa-search"></i></a></li>
					<li><a href="aluno/listar"><i class="fa fa-sort-alpha-asc "></i></a></li>
				

				</ul>
			</div>
			
			<div class="text">
				<ul>
				    </br></br></br></br>
					
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="index">Tela Inicial</a></li>
					<li><a href="cadastroAluno" >Cadastrar Aluno</a></li>
					<li><a href="excluirAluno" >Excluir Aluno</a></li>
					<li><a href="" >Alterar Dados</a></li>
					<li><a href="buscarAluno" >Pesquisar Aluno</a></li>
					<li><a href="aluno/listar" >Listar Alunos</a></li>
				
				</ul>
			</div>
 
    </div>


    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  </body>
</html>
