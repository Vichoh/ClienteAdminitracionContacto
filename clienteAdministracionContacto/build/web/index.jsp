<%-- 
    Document   : index
    Created on : 10-may-2016, 22:16:08
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
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet' type='text/css'>
    </head>
    <style type="text/css">
    body {   } 
    .espacio-arriba{
	margin-top:100px; 
    } 
    .quitar-float{
    float: none;
    }
    .espacio-derecha{
	margin-right: 1em;
    }
    h4{
        color: #0F85EF !important;
    }
    .letra{
        font-family: 'Roboto Slab', serif;
        color: white !important;
        
    }
    </style>
    <body >
        <jsp:include page="menu.jsp" />
        <h1  class="letra" class="center block text-center">${resultado}</h1>
         <div  class="col-md-3 center-block quitar-float espacio-arriba text-center">   
          <h1 class="letra " >PROGRAMACION</h1>
          <h4>Registro, Informaciòn y Data</h4>
         </div> 
    </body>
</html>
