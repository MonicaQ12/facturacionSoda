package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;

public class Postre extends Producto {
    private String tipo;
    private String sabor;
    
    public Postre(){
        
        this.nombre = "";
        this.mensaje = "";
    }
    
    public Postre (String nombre) {
        this.nombre = nombre;
        this.mensaje = "";
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
    return this.tipo;
    }
    
     public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    public String getSabor(){
        return this.sabor;
    }
}
