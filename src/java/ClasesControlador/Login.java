/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesControlador;

import Modelos.Gestion.GestionLogin;

/**
 *
 * @author curso mañana
 */
public class Login {
    private String usuario;
    private String contrasenia;

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

   
    
    public String validar(){
        GestionLogin g=new GestionLogin();
        
        return g.validar(usuario, contrasenia);
    }
}
