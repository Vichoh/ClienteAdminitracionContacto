<%-- 
    Document   : buscarGrupo
    Created on : 04-jul-2016, 13:17:14
    Author     : Adrian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="capaNegocio.Grupo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="i"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/vista.css">
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Lora' rel='stylesheet' type='text/css'>
        
    </head>
    <style>
        
    .letra{
	font-family: 'Lora', serif !important;
        font-weight:600;
        
    }
    .color{
        background:cadetblue;
    }
    th{
        color: white !important
    }
    td{
        color:darkblue !important ;
    }
    </style>
    <body >
        <jsp:include page="menu.jsp"/>
    <div  class="container" >
            <div class="jumbotron">    
        <div class="row" >
            <center>
                <h2 >
                    <b class="letra">Búsqueda simple</b>
                </h2>
            </center>
        </div>
    <center>
        <form class="form-inline" method="post" action="BuscarGrupo"
              id="formRegistroTrabajador">
            <div class="row">
                <div class="col-sm-12">
                    
                    <div class="form-group">
                        <div class="col-sm-7">
                            <input type="text" placeholder="Búsqueda simple" class="form-control" id="textoBusqueda"
                                   name="textoBusqueda" pattern="([A-Za-z]{1,20})(\s[A-Za-z]{1,20})*" required>
                        </div>
                        <div class="col-sm-3">
                            <button type="submit" value="simple" name="btn_accion"  >
                                <span></span><img src="botones/buscar.png" width="29" height="29"/>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </center>
    <center>
        <form class="form-horizontal" method="post" action="BuscarGrupo"
               id="formRegistroTrabajador">
            <div class="row" >
                <div class="col-sm-12">
                     <center>
                         <h2 >
                             <b class="letra">Búsqueda avanzada</b>
                         </h2>
                    </center>
                </div>    
            </div>
            <div class="col-sm-8">
                <div class="form-group">
                    <label for="nombreGrupo" class="col-sm-5 control-label">Nombre del Grupo:</label> 
                    <div class="col-sm-7">
                        <input type="text" placeholder="nombre Grupo" class="form-control" id="nombreGrupo"
                               name="nombre" pattern="[A-Za-z]{1,20}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="descripcion" class="col-sm-5 control-label">Descripcion del Grupo</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="descripcionGrupo"
                               placeholder="descripcion grupo" name="descripcion" pattern="([A-Za-z]{1,20})(\s[A-Za-z]{1,20})*">
                    </div>
                </div>
                
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <center><button type="submit" value="avanzado" name="btn_accion" >
                            <span ></span> <img src="botones/search-button01.png" width="100" height="30"/> </button></center>
                </div>
            </div>
        </form>
    </center>
    </div>
    </div>    
    <br>
    <br>
    
    <center>
        <table class="table table-striped">
            <thead>
            <th>Uid</th>
            <th>Nombre</th>
            <th>Descripcion</th>          
            </thead>
            <tbody>
                <i:forEach items="${busqueda}" var="grupo">
                    <tr>
                        <td>${grupo.uid}</td>
                        <td>${grupo.nombre}</td>
                        <td>${grupo.descripcion}</td>
                        <td><button><a href="EditarContacto"
                            <span ></span> <img src="botones/editar1.png" width="30" height="30"/></a> </button></td>
                        <td><button><a href="EliminarContacto"
                            <span ></span> <img src="botones/cerrar.png" width="30" height="30"/></a> </button></td>    
                    </tr>
                </i:forEach>
            </tbody>
        </table>
    </center>
</body>
</html>
