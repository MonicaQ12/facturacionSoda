/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

/**
 *
 * @author Jheron Chacon
 */
public class Ingrediente {

    private String nombre;

    Ingrediente(String nombre) {
        this.nombre = nombre;
    }

    Ingrediente() {
        this.nombre = "";
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
