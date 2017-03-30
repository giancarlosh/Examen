<%-- 
    Document   : nuevoCliente
    Created on : 05-mar-2017, 11:33:57
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <img src="imagenes/logo.png" width="300px">
            <form action="cerrar">
                <input type="submit" value="Cerrar sesion" onclick="cerrar()" class="boton boton-cerrar">
            </form>
        </header>
        <div class="contenedor login">
            <div class="titulo">
                <h1>Ingrese los siguientes datos del Cliente</h1>
            </div>
            <form action="nuevoCliente" class="login-form">
                <input class="grupo input-login" type="text" placeholder="Nombre" name="nombre" required><br>
                <input class="grupo input-login" type="text" placeholder="Apellido" name="apellido" required><br>
                <input class="grupo input-login" type="text" placeholder="Telefono" name="telefono" required><br>
                <input class="grupo input-login" type="text" placeholder="DNI" name="dni" required><br>
                <input  class="boton boton-opciones contenedor" type="submit" value="Enviar" onclick="nuevo()">
            </form>


        </div>
        <form action="volver" class="contenedor">
            <input type="submit" class="boton boton-opciones" value="Volver">

        </form>
        <script src="js/examen.js"></script>
    </body>
</html>
