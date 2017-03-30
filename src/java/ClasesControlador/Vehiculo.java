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
public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private String descripcion;

    public Vehiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String eliminar(){
        GestionTotal.eliminar("VehiculoDAO",id);
        return "success";
    }
    public String nuevo(){
        GestionTotal.nuevo("VehiculoDAO",this);
        return "success";
    }
}
