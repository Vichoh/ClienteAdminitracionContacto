<%-- 
    Document   : agregarContacto
    Created on : 10-may-2016, 22:27:42
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
        <form class="form-horizontal" action="AgregarContacto" method="post" id="formRegistroTrabajador"> 
            <center>
                <div class="row">
                    <div class="col-sm-12">
                        <center>
                            <h2
                                <b class="letra" > Agregar Contacto</b>
                            </h2>
                        </center>
                    </div>
                </div>
                <div class="col-sm-8">
                    <div class="form-group">
                        <label for="nombreContacto" class="col-sm-5 control-label" > Nombre Contacto </label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="nombre del contacto" class="form-control" id="nombreContacto" 
                                   name="nombreContacto" pattern="[A-Za-z]{1,20}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="apellidoContacto" class="col-sm-5 control-label" > Apellido Contacto </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="apellido del contacto" class="form-control" id="apellidosContacto"
                                    name="apellidoContacto" pattern="[A-Za-z]{1,20}">
                        </div>
                    </div>
                     <div class="form-group">
                        <label for="telefonoContacto" class="col-sm-5 control-label" > Telefono Contacto </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="telefono del contacto" class="form-control" id="telefonoContacto"
                                    name="telefonoContacto" pattern="^[9|8|7|6]\d{7}$" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="mailContacto" class="col-sm-5 control-label" > Email Contacto </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="email del contacto" class="form-control" id="apellidosContacto"
                                    name="mailContacto" pattern="^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nombreEmpresa" class="col-sm-5 control-label" > Empresa Contacto </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="empresa del contacto" class="form-control" id="apellidosContacto"
                                    name="nombreEmpresa" pattern="([A-Za-z]{1,20})(\s[A-Za-z]{1,20})*">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nombreCiudad" class="col-sm-5 control-label" > Ciudad Contacto </label>
                        <div class="col-sm-7">
                             <input type="text"  placeholder="ciudad del contacto" class="form-control" id="apellidosContacto"
                                    name="nombreCiudad" pattern="([A-Za-z]{1,20})(\s[A-Za-z]{1,20})*" >
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
