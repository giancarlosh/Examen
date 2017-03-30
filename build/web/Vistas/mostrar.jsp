<%-- 
    Document   : infoClientes
    Created on : 02-mar-2017, 12:19:59
    Author     : curso mañana
--%>

<%@page import="Modelos.Gestion.GestionTotal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <img src="imagenes/logo.png" width="300px">
            <form action="cerrar">
                <input type="submit" value="Cerrar sesion" onclick="cerrar()" class="boton boton-cerrar">
            </form>
        </header>
        <% String clase = request.getParameter("tabla"); %>
        <% out.println(GestionTotal.mostrar(clase));%>
        <form action="volver">
            <input type="submit" class="boton boton-opciones contenedor" value="Volver">
 
        </form>
        
   
    </body>
</html>
