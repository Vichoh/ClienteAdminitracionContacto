<%-- 
    Document   : buscarContactosActividades
    Created on : 05-jul-2016, 10:53:14
    Author     : Adrian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="capaNegocio.Contacto"%>
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
        
        .espacioboton{
            margin-top: 20px;
        }
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
                    <b class="letra">Busqueda Contactos Actividad Leida</b>
                </h2>
            </center>
        </div>
    <center>
        <form class="form-inline" method="post" action="Actividadleida"
              id="formRegistroTrabajador">
            <div class="row">
                <div class="col-sm-12">
                    
                    <div class="form-group">
                        <div class="col-sm-7">
                            <input type="text" placeholder="uid de actividad" class="form-control" id="textoBusqueda"
                                   name="uidActividad" pattern="[0-9]{1,20}" required>
                        </div>
                        <<div class="row" >
                            <div class="col-sm-12"> 
                            <center><button type="submit" class="espacioboton" > <img src="botones/send-button01.png" width="100" height="30"/> </button></center>
                        </div>    
            </div>
                    </div>
                </div>
            </div>
            </div>
    </div>
        </form>
    </center>
   <br>
    <br>
    
    <center>
        <table class="table table-striped">
            <thead>
            <th></th>    
            <th>Uid</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Teléfono</th>
            <th>Email</th>
            <th>Ciudad</th>
            <th>Empresa</th>
            </thead>
            <tbody>
                <i:forEach items="${busqueda}" var="contacto">
                    <tr>
                        <td><img src = "botones/${contacto.imagenes}" width="30" height="30"</td>
                        <td>${contacto.uid}</td>
                        <td>${contacto.nombre}</td>
                        <td>${contacto.apellido}</td>
                        <td>${contacto.telefono}</td>
                        <td>${contacto.mail}</td>
                        <td>${contacto.ciudad}</td>
                        <td>${contacto.empresa}</td>
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