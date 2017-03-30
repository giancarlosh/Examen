/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import ClasesControlador.Cliente;
import Modelos.Clases.ClienteDAO;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author curso mañana
 */
public class GestionCliente extends Gestion {

    public GestionCliente() {
        super();
    }

    public String mostrar() {
        session.beginTransaction();
        Query query = session.createQuery("FROM ClienteDAO");

        List<ClienteDAO> clientes = query.list();
        session.clear();
        return crearTabla(clientes);
    }

    public String crearTabla(List<ClienteDAO> clientes) {
        String tabla = "<table class='contenedor tabla'><tr><th>ID</th><th>Nombre</th>"
                + "<th>Apellido</th><th>Telefono</th><th>DNI</th></tr>";

        for (ClienteDAO cliente : clientes) {
            tabla += "<tr><td>" + cliente.getId() + "</td>"
                    + "<td>" + cliente.getNombre() + "</td>"
                    + "<td>" + cliente.getApellido() + "</td>"
                    + "<td>" + cliente.getTelefono() + "</td>"
                    + "<td>" + cliente.getDni() + "</td></tr>";
        }
        return tabla + "</table>";
    }

    public void eliminar(int id) {
        session.beginTransaction();
        ClienteDAO cliente=(ClienteDAO)session.get(ClienteDAO.class, id);
        session.delete(cliente);
        session.getTransaction().commit();

    }
    public void buscar(int id) {
        session.beginTransaction();
        ClienteDAO cliente=(ClienteDAO)session.get(ClienteDAO.class, id);
        session.delete(cliente);
        session.getTransaction().commit();

    }
    public void nuevo(Object objeto){
        session.beginTransaction();
        Cliente c=(Cliente)objeto;
        ClienteDAO cliente= new ClienteDAO(c.getNombre(),c.getApellido(),c.getTelefono(),c.getDni());
        session.save(cliente);
        session.getTransaction().commit();
    }
    public String listado(){
        session.beginTransaction();
        Query query = session.createQuery("FROM ClienteDAO");

        List<ClienteDAO> clientes = query.list();
        session.clear();
        return crearLista(clientes);
    }
    public String crearLista(List<ClienteDAO> clientes){
        String tabla="";
        for (ClienteDAO cliente : clientes) {
            tabla += "<div class='listaVehiculos'><input name='listaCliente' type='checkbox' value='"+cliente.getId()+"'>"+cliente.getNombre()+" "+cliente.getApellido()+"</div>";
        }
        return tabla;
        
    }
}
