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
        this.mensaje = Mensaje.Mensage.EXITO.name();
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
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    
    public void setServicio(boolean servicio, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getGerente(), usuario))
        {
            this.servicio = servicio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    
}
