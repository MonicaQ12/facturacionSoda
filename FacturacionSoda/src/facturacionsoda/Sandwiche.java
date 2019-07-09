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
public class Sandwiche extends Producto implements Jsonable{
   public enum Panes
   {
       CIABTA, INTEGRAL, AJONJOLI, BLANCO, CUADRADO_BLANCO;
   }
    
    public String tipoPan;
    
    public Sandwiche(){}
  
    public Sandwiche(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void printToJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
