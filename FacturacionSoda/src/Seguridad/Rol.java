/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

/**
 *
 * @author Jheron Chacon
 */
public class Rol {
    private String nombre;
    
    public Rol(){
        this.nombre = "";
    }
    
    public String getCodigo(){
        return Codigo.getCodigo();
    }
    
    public Rol(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public static String getGerente(){
        return "Gerente";
    }
    
    public static String getCajero(){
        return "Cajero";
    }
    
    public static String getCocinero(){
        return "Cocinero";        
    }
    
    public static String getSalonero(){
        return "Salonero";
    }
    
    public static String getCliente(){
        return "Cliente";
    }
}
