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
public class Casados extends Producto {
    private int calorias;
    private String tipoCasado;
    
    public Casados(){
        
    }
    public Casados(String nombre){
        this.nombre = nombre;
    }
    public int getCalorias(){
        return this.calorias;
    }
    public void setCalorias(int calorias){
        this.calorias = calorias;
    }
    public String getTipoCasado(){
        return this.tipoCasado;
    }
    public void setTipoCasado(String tipoCasado){
        this.tipoCasado = tipoCasado;
    }
}
