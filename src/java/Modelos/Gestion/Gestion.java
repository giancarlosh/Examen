/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author curso mañana
 */
public abstract class Gestion {

    protected SessionFactory sessionFactory;
    protected Session session;

    public Gestion() {
        Configuration configuracion = new Configuration();
        configuracion.configure();  // lee el archivo de hibernate

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuracion.getProperties()).buildServiceRegistry();
        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
    }

    public void cerrarSesion() {

        session.close();
        sessionFactory.close();
    }

    public abstract String mostrar();

    public abstract void eliminar(int id);

    public abstract void buscar(int id);

    public abstract void nuevo(Object objeto);
}
