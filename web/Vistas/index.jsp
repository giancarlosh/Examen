<%-- 
    Document   : index
    Created on : 03-mar-2017, 11:32:40
    Author     : curso mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <div class="login">
            <div class="titulo">
                <h1>Iniciar sesión</h1>
            </div>
            <form action="validar" class="login-form">
                
                <input type="text" placeholder="usuario" name="usuario" class="grupo input-login"><br>
                <input type="password" placeholder="contraseña" name="contrasenia" class="grupo input-login"><br>
                <input type="submit" value="Iniciar Sesión" onclick="validar()" class="boton input-login">
            </form>

        </div>

        <script src="js/examen.js"></script>

    </body>
</html>
