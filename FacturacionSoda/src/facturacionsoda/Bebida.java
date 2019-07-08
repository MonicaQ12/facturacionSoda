
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Bebida extends Producto{

    private String nombre;
    private String caducidad;
    private double precio;
    private String tamanio;
    private String mensaje;
    protected List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

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

    public String getNombre() {
        return nombre;
    }

    public void setNombreBebida(String nombre, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.nombre = nombre;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        } else {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }

    public String getMensaje() {
        return mensaje;
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
        this.mensaje=Mensaje.Mensage.EXITO.name();
    }else{
        this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.precio = precio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        } else {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }

    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.tamanio = tamanio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        } else {
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public List<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
        public void addIngrediente(Ingrediente ingrediente, Usuario usuario){
        if(this.rolPermitido(Rol.getCocinero(),usuario)){
            this.ingredientes.add(ingrediente);
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else{
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public void delIngrediente(Ingrediente ingrediente, Usuario usuario){
        boolean eliminado = false;
        if(this.rolPermitido(Rol.getCocinero(), usuario)){
            String nombreIngrediente = ingrediente.getNombre();
            
            Ingrediente actual = this.getIngrediente(nombreIngrediente);
            
            if(actual.getNombre().equals(nombreIngrediente)){
                this.ingredientes.remove(actual);
                eliminado = true;
            }
            this.mensaje = eliminado ? Mensaje.Mensage.EXITO.name() : Mensaje.Mensage.NO_ENCONTRADO.name();
        }
        else
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
    }
  
    
    public Ingrediente getIngrediente(String nombre){
        for(int i = 0; i < this.ingredientes.size();i++){
            Ingrediente actual = this.ingredientes.get(i);
            if(actual.getNombre().equals(nombre))
                return actual;
        }
        return new Ingrediente();
    }
    

}

