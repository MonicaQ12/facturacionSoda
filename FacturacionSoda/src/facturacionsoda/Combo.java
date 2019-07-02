/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

/**
 *
 * @author T.YENDY
 */
public class Combo extends Producto {
    private Bebida natural = new Bebida("Natural");
    private String gaseosa;
    private boolean agua;
    public Entrada acompañamiento = new Entrada();
    public Postre postre = new Postre();
    
    public Combo(){
        
    }
    public Combo(String nombre){
        this.nombre = nombre;
    }
    
    public void setBebida(Bebida bebida){
        this.natural=bebida;
    }
    public void setBebida(String bebida){
        this.gaseosa=bebida;
    }
    public void setBebida(){
        this.agua=true;
    }
    public String getBebida(){
        return this.gaseosa;
    }
}
