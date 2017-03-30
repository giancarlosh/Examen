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
public class Mecanico {
    private int id;
    private String nombre;
    private String apellido;

    public Mecanico() {
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
    public String eliminar(){
        GestionTotal.eliminar("MecanicoDAO",id);
        return "success";
    }
    public String nuevo(){
        GestionTotal.nuevo("MecanicoDAO",this);
        return "success";
    }
}
