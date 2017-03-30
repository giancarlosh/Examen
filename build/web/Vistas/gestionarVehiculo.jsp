<%-- 
    Document   : gestionarVehiculo
    Created on : 05-mar-2017, 21:21:48
    Author     : Usuario
--%>

<%@page import="Modelos.Gestion.GestionMecanico"%>
<%@page import="Modelos.Gestion.GestionCliente"%>
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
        <form action="prueba" class="contenedor">
            <h3>Ingrese el id del vehiculo a relacionar</h3>
            <input type="text" name="idVehiculo"><br>
            <h3>Seleccione el id del dueño(s)</h3>
            <div class="relaciones">


                <% GestionCliente g = new GestionCliente();%>
                <% out.println(g.listado());%>

            </div>
            <h3>Seleccione los mecanicos que trabajaran en el vehiculo</h3>
            <div class="relaciones">


                <% GestionMecanico m = new GestionMecanico();%>
                <% out.println(m.listado());%>
            </div>

            <input class="boton boton-opciones" type="submit" value="Relacionar">
        </form>
    </body>
</html>
