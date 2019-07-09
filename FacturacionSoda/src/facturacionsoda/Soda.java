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
public class Soda {
    private String nombre;
    private int id;
    public Soda(){}
    public Soda(int id){this.id = id;}
    public Soda(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}
