package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;

/**
 * @author Monica
 */

public class Entrada extends Producto
{
    private boolean pequenio;
    private boolean mediana;
    private boolean fria;
    private boolean caliente;
    
    public Entrada()
    {}
    
    public Entrada(String nombre)
    {
        super(nombre);
        this.mensaje = Mensaje.Mensage.EXITO.name();
    }
    
    public void setTamanio(boolean pequenio, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getGerente(), usuario))
        {
            this.pequenio = pequenio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public void setTemperatura(boolean fria, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getCocinero(), usuario))
        {
            this.fria = fria;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
}
