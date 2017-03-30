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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author curso mañana
 */
@Entity
@Table(name = "cliente")
public class ClienteDAO implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "pk_id_cliente")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "dni")
    private String dni;
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="clientes")
    private Set<VehiculoDAO> vehiculos;

    public ClienteDAO() {
    }

    public ClienteDAO(String nombre, String apellido, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
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
