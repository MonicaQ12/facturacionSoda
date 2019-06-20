
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
import facturacionsoda.Ingrediente;
import facturacionsoda.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bebida {
   private String nombre;
   private Double precio;
   private Date caducidad;
   private String tipo_Bebida;
   private String tamanio_Bebida;
   private String mensaje;
   private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public String getTipo_Bebida() {
        return tipo_Bebida;
    }

    public String getTamanio_Bebida() {
        return tamanio_Bebida;
    }

    public String getMensaje() {
        return mensaje;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public void setTipo_Bebida(String tipo_Bebida) {
        this.tipo_Bebida = tipo_Bebida;
    }

    public void setTamanio_Bebida(String tamanio_Bebida) {
        this.tamanio_Bebida = tamanio_Bebida;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
   public void addIngrediente(Producto producto, Usuario usuario){
        
            this.mensaje = Mensaje.EXITO;
        
        
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
