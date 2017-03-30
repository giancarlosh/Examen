<%-- 
    Document   : nuevoVehiculo
    Created on : 05-mar-2017, 11:34:11
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
                <h1>Ingrese los siguientes datos del Vehiculo</h1>
            </div>

            <form action="nuevoVehiculo" class="login-form">
                <input class="grupo input-login" type="text" placeholder="Marca" name="marca" required><br>
                <input class="grupo input-login" type="text" placeholder="Modelo" name="modelo" required><br>
                <input class="grupo input-login" type="text" placeholder="Color" name="color" required><br>
                <input class="grupo input-login" type="text" placeholder="Matricula" name="matricula" required><br>
                <input class="grupo input-login" type="text" placeholder="Descripcion" name="descripcion" required><br>
                <input class="boton boton-opciones" type="submit" value="Enviar" onclick="nuevo()">
            </form>
        </div>
        <form action="volver" class="contenedor">
            <input type="submit" class="boton boton-opciones" value="Volver">
        </form>
        <script src="js/examen.js"></script>
    </body>
</html>
