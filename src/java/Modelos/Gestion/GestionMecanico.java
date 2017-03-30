/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import ClasesControlador.Mecanico;
import Modelos.Clases.MecanicoDAO;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author curso mañana
 */
public class GestionMecanico extends Gestion {

    public GestionMecanico() {
        super();

    }

    public String mostrar() {
        session.beginTransaction();
        Query query = session.createQuery("FROM MecanicoDAO");

        List<MecanicoDAO> clientes = query.list();
        session.clear();
        return crearTabla(clientes);
    }

    public String crearTabla(List<MecanicoDAO> mecanicos) {
        String tabla = "<table class='contenedor tabla'><tr><th>ID</th><th>Nombre</th>"
                + "<th>Apellido</tr>";

        for (MecanicoDAO mecanico : mecanicos) {
            tabla += "<tr><td>" + mecanico.getId() + "</td>"
                    + "<td>" + mecanico.getNombre() + "</td>"
                    + "<td>" + mecanico.getApellido() + "</td></tr>";
        }
        return tabla + "</table>";
    }

    public void eliminar(int id) {
        session.beginTransaction();
        MecanicoDAO cliente = (MecanicoDAO) session.get(MecanicoDAO.class, id);
        session.delete(cliente);
        session.getTransaction().commit();

    }
    public void buscar(int id){
    }
    public void nuevo(Object objeto){
        session.beginTransaction();
        Mecanico m=(Mecanico)objeto;
        MecanicoDAO mecanico= new MecanicoDAO(m.getNombre(),m.getApellido());
        session.save(mecanico);
        session.getTransaction().commit();
    }
    public String listado(){
        session.beginTransaction();
        Query query = session.createQuery("FROM MecanicoDAO");

        List<MecanicoDAO> mecanicos = query.list();
        session.clear();
        return crearLista(mecanicos);
    }
    public String crearLista(List<MecanicoDAO> mecanicos){
        String tabla="";
        for (MecanicoDAO mecanico : mecanicos) {
            tabla += "<div class='listaVehiculos'><input name='listaMecanico' type='checkbox' value='"+mecanico.getId()+"'>"+mecanico.getNombre()+" "+mecanico.getApellido()+"</div>";
        }
        return tabla;
        
    }
}
