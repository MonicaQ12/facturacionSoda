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
class Entrada extends Producto{
    private boolean pequeño;
    private boolean mediana;
    private boolean fria;
    private boolean caliente;
    
    public Entrada(){
        
    }
    public Entrada(String nombre){
        this.nombre = nombre;
    }
    
    public void setTamaño(boolean pequeño){
        this.pequeño=pequeño;
    }
    public void setTemperatura(boolean frio){
        this.pequeño=frio;
    }
}
