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
public class Ensalada extends Producto{
    public final static String MIL_ISLAS = "mil islas";
    public final static String ROSADO = "salsa rosada";
    public final static String RANCH = "aderezo ranch";
    public final static String BALSAMICO = "vinagre balsámico";
    
    public String aderezo;
    public Boolean crotones;
    
    public Ensalada(){}
    
    public Ensalada(String nombre){
        this.nombre = nombre;
    }
}
