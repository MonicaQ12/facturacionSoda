package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;

/**
 * @author Monica
 */

public class Casados extends Producto
{
    private int calorias;
    private String tipoCasado;
    
    public Casados()
    {}
    
    public Casados(String nombre)
    {
        super(nombre);
        this.mensaje = Mensaje.Mensage.EXITO.name();
    }
    
    public int getCalorias()
    {
        return this.calorias;
    }
    
    public String getTipoCasado()
    {
        return this.tipoCasado;
    }
    
    public void setCalorias(int calorias, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getCocinero(), usuario))
        {
            this.calorias = calorias;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public void setTipoCasado(String tipoCasado, Usuario usuario)
    {
        if(this.rolPermitido(Rol.getCocinero(), usuario))
        {
            this.tipoCasado = tipoCasado;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
        {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
}
