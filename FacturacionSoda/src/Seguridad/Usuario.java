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
public class Usuario {
    private Rol rolUsuario = null;
    private String nombre = null;
    
    public Usuario(){
        this.rolUsuario = new Rol();
        this.nombre = "";
    }
    public Usuario(String nombre){
        this.nombre = nombre;
        this.rolUsuario = new Rol();
    }
    public Usuario(String nombre, Rol rol){
        this.nombre = nombre;
        this.rolUsuario = rol;
    }
    public Usuario(Rol rol){
        this.rolUsuario = rol;
        this.nombre = "";
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setRol(Rol rol){
        this.rolUsuario = rol;
    }
    public Rol getRol(){
        return this.rolUsuario;
    }
}
