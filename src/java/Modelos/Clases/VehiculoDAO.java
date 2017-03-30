/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Clases;

/**
 *
 * @author curso mañana
 */
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

@Entity
@Table(name = "vehiculo")
public class VehiculoDAO implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "pk_id_vehiculo")
    private int id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "color")
    private String color;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(cascade = {CascadeType.ALL})

    @JoinTable(name = "clienteVehiculo", joinColumns = {
        @JoinColumn(name = "fk_id_vehiculo")}, inverseJoinColumns = {
        @JoinColumn(name = "fk_id_cliente")})

    private Set<ClienteDAO> clientes;
    @ManyToMany(cascade = {CascadeType.ALL})

    @JoinTable(name = "mecanicoVehiculo", joinColumns = {
        @JoinColumn(name = "fk_id_vehiculo")}, inverseJoinColumns = {
        @JoinColumn(name = "fk_id_mecanico")})
    private Set<MecanicoDAO> mecanicos;

    public VehiculoDAO() {
    }

    public VehiculoDAO(String marca, String modelo, String color, String matricula, String descripcion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.descripcion = descripcion;
        clientes = new HashSet();
        mecanicos = new HashSet();
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

    public Set<ClienteDAO> getClientes() {
        return clientes;
    }

    public void setClientes(Set<ClienteDAO> clientes) {
        this.clientes = clientes;
    }

    public void setCliente(ClienteDAO cliente) {
        clientes.add(cliente);
    }

    public Set<MecanicoDAO> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(Set<MecanicoDAO> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public void setMecanico(MecanicoDAO mecanico) {
        mecanicos.add(mecanico);
    }

}
