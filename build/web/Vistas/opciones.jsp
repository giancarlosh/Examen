<%-- 
    Document   : opciones
    Created on : 03-mar-2017, 11:47:27
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
    <body >
        <header>
            <img src="imagenes/logo.png" width="300px">
            <form action="cerrar">
                <input type="submit" value="Cerrar sesion" onclick="cerrar()" class="boton boton-cerrar">
            </form>
        </header>
        <div class="contenedor opciones">
            <h1>¿Que deseas hacer?</h1>
            <div class="botones">
                <input class="boton boton-opciones" type="button" value="Mostrar Registros" onclick="mostrar('mostrar', 'eliminar', 'agregar', 'buscar', 'gestion')">
                <input class="boton boton-opciones" type="button" value="Eliminar Registros" onclick="mostrar('eliminar', 'mostrar', 'agregar', 'buscar', 'gestion')" >
                <input class="boton boton-opciones" type="button" value="Buscar por ID" onclick="mostrar('buscar', 'mostrar', 'agregar', 'eliminar', 'gestion')" >
                <input  class="boton boton-opciones" type="button" value="Agregar Registro" onclick="mostrar('agregar', 'mostrar', 'buscar', 'eliminar', 'gestion')" >
                <form action="relaciones">

                    <input  class="boton boton-opciones" type="submit" value="Gestionar Vehiculos" >
                </form>

            </div>
        </div>

        <div class="oculto" id="mostrar">
            <h3>¿Que registros quieres ver?</h3>
            <form action="mostrarRegistro" >
                <input type="radio" name="tabla" value="ClienteDAO" > Registro de clientes<br>
                <input type="radio" name="tabla" value="VehiculoDAO"> Registro de Vehiculos<br>
                <input type="radio" name="tabla" value="MecanicoDAO"> Registro de Mecanicos<br>
                <input type="submit" value="Mostrar" class="boton boton-opciones">
            </form>
        </div>
        <div class="oculto" id="eliminar">
            <h3>Ingrese el ID a eliminar</h3>
            <h4>Tabla de clientes</h4>
            <form action="eliminarCliente" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>
            <h4>Tabla de vehiculos</h4>
            <form action="eliminarVehiculo" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>
            <h4>Tabla de mecanicos</h4>
            <form action="eliminarMecanico" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>

        </div>
        <div class="oculto" id="agregar">
            <h3>Elija la tabla donde quiere añadir un registro</h3>
            <div class="botones">
                <form action="agregarCliente">
                    <input class="boton boton-opciones" type="submit" value="CLIENTE">
                </form>
                <form action="agregarVehiculo">
                    <input class="boton boton-opciones" type="submit" value="VEHICULO">
                </form>
                <form action="agregarMecanico">
                    <input class="boton boton-opciones" type="submit" value="MECANICO">
                </form>
            </div>
        </div>
        <div class="oculto" id="buscar">
            <h3>Ingrese el ID del registro que quiere visualizar</h3>
            <h4>Tabla de clientes</h4>
            <form action="buscarCliente" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>
            <h4>Tabla de vehiculos</h4>
            <form action="buscarVehiculo" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>
            <h4>Tabla de mecanicos</h4>
            <form action="buscarMecanico" >
                <input placeholder="ID" name="id">
                <input type="submit" value="eliminar">
            </form>
        </div>

        <script src="js/examen.js"></script>
    </body>
</html>
