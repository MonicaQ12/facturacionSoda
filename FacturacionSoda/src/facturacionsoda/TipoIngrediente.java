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
public class TipoIngrediente {
    private final static String VEGETAL = "Vegetal";
    private final static String CARNE = "Carnes";
    
    private boolean vegetal = false;
    private boolean carne = false;
    
    public String getClasificacion(){
        return this.vegetal ? TipoIngrediente.VEGETAL :
                this.carne ? TipoIngrediente.CARNE :
                null;
    }
}
