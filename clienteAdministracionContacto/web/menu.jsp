<%-- 
    Document   : menu
    Created on : 10-may-2016, 22:24:11
    Author     : Adrian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        
        <!-- Latest compiled and minified CSS -->
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
       integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
      integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link href="/css/vista.css" rel="stylesheet" type="text/css">
    </head>
    <style type="text/css">
    body {    } 
    .espacio-arriba{
	margin-top:100px; 
    } 
    .quitar-float{
    float: none;
    }
    .espacio-derecha{
	margin-right: 1em;
    }
   
    
    </style>
    <body background="botones/fondo4.png">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse" 
                            >
                        <span class="sr-only"> Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a  class="navbar-brand" href="index.jsp">Inicio</a>
                </div>
                
                <div class="collapse navbar-collapse navbar-ex1-collapse" >
                    <ul class=" nav navbar-nav">
                        
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >
                                Contacto <b class="caret"></b></a>
                            <ul class="dropdown-menu"> 
                                <li><a href="AgregarContacto"> Agregar Contacto</a></li>
                                <li><a href="EditarContacto"> Editar Contacto</a></li>
                                <li><a href="EliminarContacto"> Eliminar Contacto</a></li>
                                <li><a href="Busqueda"> Buscar Contacto</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >
                                Grupo <b class="caret"></b></a>
                            <ul class="dropdown-menu"> 
                                <li><a href="AgregarGrupo"> Agregar Grupo</a></li>
                                <li><a href="EditarGrupo"> Editar Grupo</a></li>
                                <li><a href="EliminarGrupo"> Eliminar Grupo</a></li>
                                <li><a href="BuscarGrupo"> Buscar Grupo</a></li>
                                <li><a href="AgregarContactoAGrupo"> Agregar Contacto a Grupo</a></li>                                
                            </ul
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >
                                Notificacion <b class="caret"></b></a>
                            <ul class="dropdown-menu"> 
                                <li><a href="AgregarNotificacion"> Agregar Notificacion</a></li>
                                <li><a href="Notificacionleida"> Notificaciones Leidas</a></li>
                                
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >
                                Actividad <b class="caret"></b></a>
                            <ul class="dropdown-menu"> 
                                <li><a href="AgregarActividad"> Agregar Actividad</a></li>
                                <li><a href="Actividadleida"> Actividades Leidas</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    
    </body>
</html>
