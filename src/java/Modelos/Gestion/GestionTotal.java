/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import Modelos.Clases.ClienteDAO;

/**
 *
 * @author curso mañana
 */
public class GestionTotal {

    public static String mostrar(String clase) {

        String tabla = "";

        Gestion g;
        switch (clase) {

            case "ClienteDAO":
                g = new GestionCliente();
                tabla = g.mostrar();
                break;

            case "VehiculoDAO":
                g = new GestionVehiculo();
                tabla = g.mostrar();
                break;
            case "MecanicoDAO":
                g = new GestionMecanico();
                tabla = g.mostrar();
                break;

        }
        return tabla;
    }

    public static void eliminar(String clase, int id) {
        Gestion g;
        switch (clase) {

            case "ClienteDAO":
                g = new GestionCliente();
                g.eliminar(id);
                break;

            case "VehiculoDAO":
                g = new GestionVehiculo();
                g.eliminar(id);
                break;
            case "MecanicoDAO":
                g = new GestionMecanico();
                g.eliminar(id);
                break;

        }
    }
    public static void buscar(String clase, int id) {
        Gestion g;
        switch (clase) {

            case "ClienteDAO":
                g = new GestionCliente();
                g.eliminar(id);
                break;

            case "VehiculoDAO":
                g = new GestionVehiculo();
                g.eliminar(id);
                break;
            case "MecanicoDAO":
                g = new GestionMecanico();
                g.eliminar(id);
                break;

        }
    }
    public static void nuevo(String clase, Object objeto) {
        Gestion g;
    
        switch (clase) {

            case "ClienteDAO":
                g = new GestionCliente();
                g.nuevo(objeto);
                break;

            case "VehiculoDAO":
                g = new GestionVehiculo();
                g.nuevo(objeto);
                break;
            case "MecanicoDAO":
                g = new GestionMecanico();
                g.nuevo(objeto);
                break;

        }
    }
}
