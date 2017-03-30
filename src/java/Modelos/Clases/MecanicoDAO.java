/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Clases;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author curso mañana
 */
@Entity
@Table(name = "mecanico")
public class MecanicoDAO implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "pk_id_mecanico")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="mecanicos")
    private Set<VehiculoDAO> vehiculos;

    public MecanicoDAO() {
    }

    public MecanicoDAO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        vehiculos = new HashSet();
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

    public Set<VehiculoDAO> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Set<VehiculoDAO> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void setVehiculo(VehiculoDAO vehiculo){
        vehiculos.add(vehiculo);
    
    }
}
