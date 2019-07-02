
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;

public class Bebida extends Producto {
    
    private String caducidad;
    private String tamanio;

    public Bebida(String mensaje, String caducidad, double precio, String tamanio) {
        this.caducidad = caducidad;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    public Bebida() {
        this.nombre = "";
        this.mensaje = "";

    }

    public Bebida(String nombre) {
        this.nombre = nombre;
        this.mensaje = "";
    }

    public void setNombreBebida(String nombre, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.nombre = nombre;
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad,Usuario usuario) {
        if(this.rolPermitido(Rol.getGerente(), usuario)){
        this.caducidad = caducidad;
        this.mensaje=Mensaje.EXITO;
    }else{
        this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
    
    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.tamanio = tamanio;
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
}

