/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Clases;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 *
 * @author curso mañana
 */
public class Pruebas {
    public static void main(String[] args){
        Configuration configuracion = new Configuration();
        configuracion.configure();  // lee el archivo de hibernate

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuracion.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuracion.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();

        LoginDAO login=new LoginDAO("root","root");
        ClienteDAO cliente = new ClienteDAO("nombre","apellido","telefono","dni");
        VehiculoDAO vehiculo= new VehiculoDAO("marca","modelo","color","matricula","descripcion");
        MecanicoDAO mecanico= new MecanicoDAO("nombre", "apellido");
        cliente.setVehiculo(vehiculo);
        vehiculo.setCliente(cliente);
        vehiculo.setMecanico(mecanico);
        mecanico.setVehiculo(vehiculo);
        
        
        session.beginTransaction();
        session.saveOrUpdate(login);
        session.saveOrUpdate(cliente);
        session.saveOrUpdate(vehiculo);
        session.saveOrUpdate(mecanico);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    
    }
}
