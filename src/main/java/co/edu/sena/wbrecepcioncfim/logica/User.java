/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.wbrecepcioncfim.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Diego A Cuenca
 */
@Entity
@Table
public class User implements Serializable {
    
    @Id
    @Column (name ="id_use")
    private  int id;
    
    @Id
    @Column (name ="email_use")
  private String email;
    @Id
    @Column (name ="nom_use")
  private String nombre;
    
    @Id
    @Column (name ="ape_use")
  private String apellido;
    
    @Id
    @Column (name ="fchc_use")
  private String fechaContratacion;
    
    @Id
    @Column (name ="rol_use")
  private String rol;

    public User() {
    }

    public User(int id, String email, String nombre, String apellido, String fechaContratacion, String rol) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaContratacion=" + fechaContratacion + ", rol=" + rol + '}';
    }

    
    
}
