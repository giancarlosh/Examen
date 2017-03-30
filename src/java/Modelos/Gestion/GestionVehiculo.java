/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import ClasesControlador.Vehiculo;
import Modelos.Clases.VehiculoDAO;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author curso mañana
 */
public class GestionVehiculo extends Gestion {

    public GestionVehiculo() {
        super();

    }

    public String mostrar() {
        session.beginTransaction();
        Query query = session.createQuery("FROM VehiculoDAO");

        List<VehiculoDAO> vehiculos = query.list();
        session.clear();
        return crearTabla(vehiculos);
    }

    public String crearTabla(List<VehiculoDAO> vehiculos) {
        String tabla = "<table class='contenedor tabla'><tr><th>ID</th><th>Marca</th>"
                + "<th>Modelo</th><th>Color</th><th>Matricula</th><th>Descripcion</th></tr>";

        for (VehiculoDAO vehiculo : vehiculos) {
            tabla += "<tr><td>" + vehiculo.getId() + "</td>"
                    + "<td>" + vehiculo.getMarca() + "</td>"
                    + "<td>" + vehiculo.getModelo() + "</td>"
                    + "<td>" + vehiculo.getColor() + "</td>"
                    + "<td>" + vehiculo.getMatricula() + "</td>"
                    + "<td>" + vehiculo.getDescripcion() + "</td></tr>";
        }
        return tabla + "</table>";
    }

    public void eliminar(int id) {
        session.beginTransaction();
        VehiculoDAO cliente = (VehiculoDAO) session.get(VehiculoDAO.class, id);
        session.delete(cliente);
        session.getTransaction().commit();

    }

    public void buscar(int id) {
    }

    public void nuevo(Object objeto) {
        session.beginTransaction();
        Vehiculo v = (Vehiculo) objeto;
        VehiculoDAO mecanico = new VehiculoDAO(v.getMarca(),v.getModelo(),v.getColor(),v.getMatricula(),v.getDescripcion());
        session.save(mecanico);
        session.getTransaction().commit();
    }
}
