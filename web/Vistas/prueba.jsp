<%-- 
    Document   : prueba
    Created on : 06-mar-2017, 0:20:12
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
              //este codigo funciona:
              1)crear en gestionVehiculo las relaciones con todos los id 
              2)pasar esta vista a otra como en opciones
              3)falta hacer el metodo de buscar

        <% String idVehiculo = request.getParameter("idVehiculo");
            String[] listaCliente = request.getParameterValues("listaCliente");
            String[] listaMecanico = request.getParameterValues("listaMecanico");
        %>
        <% out.println(listaCliente[0]);%>
    </body>
</html>
