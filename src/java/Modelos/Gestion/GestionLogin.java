/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Gestion;

import Modelos.Clases.LoginDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author curso mañana
 */
public class GestionLogin {
    protected SessionFactory sessionFactory;
    protected Session session;
    
    public GestionLogin(){
        Configuration configuracion = new Configuration();
        configuracion.configure();  // lee el archivo de hibernate

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuracion.getProperties()).buildServiceRegistry();
        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
    }
    public String validar(String usuario, String contrasenia){
        session.beginTransaction();
        String hql = "FROM LoginDAO WHERE usuario LIKE \'" + usuario + "\' AND contrasenia LIKE \'" + contrasenia + "\'";
        LoginDAO nuevoUsuario = (LoginDAO) session.createQuery(hql).uniqueResult();
        session.getTransaction().commit();
        if (nuevoUsuario==null){
            return " ";
        }else {
            return "success";
        }
        
        
    }
}
