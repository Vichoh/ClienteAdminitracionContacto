<%-- 
    Document   : agregarActividad
    Created on : 17-jun-2016, 9:28:35
    Author     : Adrian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
     h3{
         color:white !important
     }
    </style>
    <body>
        <jsp:include page="menu.jsp" />
        <div class="container">
            <div class="jumbotron">
        <form class="form-horizontal" action="AgregarActividad" method="post" id="formRegistroTrabajador"> 
            <center>
                <div class="row">
                    <div class="col-sm-12">
                        <center>
                            <h2
                                <b class="letra" > Agregar Actividad</b>
                            </h2>
                        </center>
                    </div>
                </div>
                <div class="col-sm-8">
                    <div class="form-group">
                        <label for="nombreActividad" class="col-sm-5 control-label" > Nombre Actividad </label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="nombre de la actividad" class="form-control" id="nombreActividad" 
                                   name="nombreActividad" pattern="[A-Za-z]{1,20}" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="descripcionActividad" class="col-sm-5 control-label" > Descripcion Actividad </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="descripcion de la actividad" class="form-control" id="descripcionActividad"
                                    name="descripcionActividad" pattern="([A-Za-z]{1,20})(\s[A-Za-z]{1,20})*">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="uidGrupo" class="col-sm-5 control-label" > Uid Grupo </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="uid del grupo" class="form-control" id="uidGrupo"
                                    name="uidGrupo" pattern="[0-9]{1,20}" required>
                        </div>
                </div>
                </div>    
                
            </center>
            <div class="row">
                <div class="col-sm-12"> 
                    <center><button type="submit" > <img src="botones/send-button01.png" width="100" height="30"/> </button></center>
                </div>    
            </div>
        </form>
            </div>
        </div>
            <center><h3 class="letra">${resultado}</h3></center>
    </body>
</html>
