/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario
 */
public class Direccion {
    
    //atributos
    private String calle;
    private String nomenclatura;
    private String barrio;
    private String ciudad;
    private String edificio;
    private String apto;
    
    //constructores
    public Direccion(){
        
    }
    
    //metodos
    public void setCalle(String calle){
        this.calle=calle;
    }
    public void setNomenclatura(String nomenclatura){
        this.nomenclatura=nomenclatura;
    }
    public void setBarrio(String barrio){
        this.barrio=barrio;
    }
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public void setEdificio(String edificio){
        this.edificio=edificio;
    }
    public void setApto(String apto){
        this.apto=apto;
    }
    public String getCalle(){
        return calle;
    }
    public String getNomenclatura(){
        return nomenclatura;
    }
    public String getBarrio(){
        return barrio;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getEdificio(){
        return edificio;
    }
    public String getApto(){
        return apto;
    }
    public String toString(){
        return "Calle: " + calle + ", Nomenclatura: " + nomenclatura + ", Barrio: " + barrio + ", Ciudad: " + ciudad + ", Edificio: " + edificio + ", Apartamento: " + apto;
    }
    
}
