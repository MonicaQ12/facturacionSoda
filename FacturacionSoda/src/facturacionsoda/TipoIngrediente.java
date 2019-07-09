package facturacionsoda;

import Mensajeria.ClasificacionTipoDeIngrediente;

public class TipoIngrediente 
{
    private String nombre;
    private String mensaje;
    private boolean vegetal, carne, lacteo, licor, granos;
    
    public TipoIngrediente()
    {
    }
    
    public TipoIngrediente(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getMensaje()
    {
        return this.mensaje;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setCarne()
    {
        this.carne = true;
        this.granos = false;
        this.lacteo = false;
        this.licor = false;
        this.vegetal = false;
    }
    
    public void setVegetal()
    {
        this.vegetal = true;
        this.carne  = false;
        this.granos = false;
        this.lacteo = false;
        this.licor = false;
    }
    
    public void setLacteo()
    {
        this.lacteo = true;
        this.carne = false;
        this.granos = false;
        this.licor = false;
        this.vegetal = false;
    }
    
    public void setLicor()
    {
        this.licor = true;
        this.carne = false;
        this.granos = false;
        this.vegetal = false;
        this.lacteo = false;
    }
    
    public void setGranos()
    {
        this.granos = true;
        this.carne = false;
        this.lacteo = false;
        this.licor = false;
        this.vegetal = false;
    }
    
    public String getClasificacion()
    {
        return this.vegetal ? ClasificacionTipoDeIngrediente.Clasificacion.VEGETAL.name() :
                this.carne ? ClasificacionTipoDeIngrediente.Clasificacion.CARNE.name() :
                this.granos ? ClasificacionTipoDeIngrediente.Clasificacion.GRANOS.name():
                this.lacteo ? ClasificacionTipoDeIngrediente.Clasificacion.LACTEO.name():
                this.licor ? ClasificacionTipoDeIngrediente.Clasificacion.LICOR.name():
                null;
    }
}
