/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesControlador;

import Modelos.Gestion.GestionTotal;

/**
 *
 * @author curso mañana
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String dni;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String eliminar(){
        GestionTotal.eliminar("ClienteDAO",id);
        return "success";
    }
    public String buscar(){
        GestionTotal.buscar("ClienteDAO",id);
        return "success";
    }
    public String nuevo(){
        GestionTotal.nuevo("ClienteDAO",this);
        return "success";
    }
}
