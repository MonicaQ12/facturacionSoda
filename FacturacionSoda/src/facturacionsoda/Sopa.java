package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;

/*
 * @author Monica
 */

public class Sopa extends Producto
{
    public String tamanio;
    public boolean servicio;
    
    public Sopa()
    {
        super();
        this.mensaje = Mensaje.EXITO;
    }
    
    public Sopa(String nombre)
    {
        super(nombre);
    }
    
    public String getTamanio()
    {
        return this.tamanio;
    }
    
    public boolean getServicio()
    {
        return this.servicio;
    }
    
        
    public void setTamanio(String tamanio, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getGerente(), usuario))
        {
            this.tamanio = tamanio;
            this.mensaje = Mensaje.EXITO;
        }
        else
        {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
    
    
    public void setServicio(boolean servicio, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getSalonero(), usuario))
        {
            this.servicio = servicio;
            this.mensaje = Mensaje.EXITO;
        }
        else
        {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
    
    
}
