/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
    //atributos
    private String nombre;
    private long id;
    private Fecha fecha_nacimiento;
    private String ciudad_nacimiento;
    private long tel;
    private String email;
    private Direccion dir;
    
    //constructoras
    public Usuario(){
    }
    
    public Usuario(String nombre,long id, Fecha fecha_nacimiento, String ciudad_nacimiento, long tel, String email, Direccion dir){
        this.nombre=nombre;
        this.id=id;
        this.fecha_nacimiento=fecha_nacimiento;
        this.ciudad_nacimiento=ciudad_nacimiento;
        this.tel=tel;
        this.email=email;
        this.dir=dir;
    }
    
    //metodos
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setFecha_nacimiento(Fecha fecha_nacimiento){
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public void setCiudad_nacimiento(String ciudad_nacimiento){
        this.ciudad_nacimiento=ciudad_nacimiento;
    }
    public void setTel(long tel){
        this.tel=tel;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setDir(Direccion dir){
        this.dir=dir;
    }
    public String getNombre(){
        return nombre;
    }
    public long getId(){
        return id;
    }
    public Fecha getFecha(){
        return fecha_nacimiento;
    }
    public String getCiudad_nacimiento(){
        return ciudad_nacimiento;
    }
    public long getTel(){
        return tel;
    }
    public String getEmail(){
        return email;
    }
    public Direccion getDir(){
        return dir;
    }
    public String toString(){
        return "Nombre: " + nombre + "\nID: " + id + "\nFecha de nacimiento: " + fecha_nacimiento + "\nCiudad de nacimiento: " + ciudad_nacimiento + "\nTelefono: " + tel + "\nEmail: " + email + "\nDireccion: " + dir;
    }
    
}
