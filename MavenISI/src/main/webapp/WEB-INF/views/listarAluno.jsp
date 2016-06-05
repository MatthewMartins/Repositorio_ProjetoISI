<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Listar Alunos</title>
    <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/mavenprojetoISI/css/normalize.css">
    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="/mavenprojetoISI/css/style.css">
    <link rel="stylesheet" href="/mavenprojetoISI/css/styles.css">
     <link rel="stylesheet" type="text/css" href="/mavenprojetoISI/css/style.css" />
        <script>    
    if(typeof window.history.pushState == 'function') {
        window.history.pushState({}, "Hide", "http://localhost:8084/mavenprojetoISI/");
    }
</script>
  </head>

  <body>
  	
    	<h1>Academia FitPro - <span>Listar Alunos</span></h1>
    	<hr>

        <div id="formulario">
                       <form action="api/Controlador/aluno/listar" method="get">
   
</form>

</div>

		<div id="nav" class="nav">
			<div class="icon">
				<ul>
					</br></br></br></br>
					<li><a href=""><i></i></a></li>
                                        <li><a href=""><i></i></a></li>
                                         <li><a href=""><i class="fa fa-home"></i></a></li>
                                        <li><a href="api/Controlador/cadastroAluno"><i class="fa fa-plus-circle"></i></a></li>
					<li><a href="api/Controlador/excluirAluno"><i class="fa fa-close "></i></a></li>
					<li><a href="api/Controlador/atualizarAluno"><i class="fa fa-refresh"></i></a></li>
					<li><a href="api/Controlador/buscarAluno"><i class="fa fa-search"></i></a></li>
					<li><a href="api/Controlador/aluno/listar"><i class="fa fa-sort-alpha-asc "></i></a></li>
				

				</ul>
			</div>
			
			<div class="text">
				<ul>
				    </br></br></br></br>
					
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="">Tela Inicial</a></li>
					<li><a href="api/Controlador/cadastroAluno" >Cadastrar Aluno</a></li>
					<li><a href="api/Controlador/excluirAluno" >Excluir Aluno</a></li>
					<li><a href="api/Controlador/atualizarAluno" >Alterar Dados</a></li>
					<li><a href="api/Controlador/buscarAluno" >Pesquisar Aluno</a></li>
					<li><a href="api/Controlador/aluno/listar" >Listar Alunos</a></li>
				
				</ul>
			</div>
 
    </div>


    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  </body>
</html>      

