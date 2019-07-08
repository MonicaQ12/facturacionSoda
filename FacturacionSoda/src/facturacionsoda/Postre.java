package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
import facturacionsoda.Ingrediente;
import facturacionsoda.Ingrediente;
import java.util.ArrayList;
import java.util.List;

public class Postre {
    private String nombre;
    private String mensaje;
    private float precio;
    private String tipo;
    private String sabor;
    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    
    public Postre(){
        
        this.nombre = "";
        this.mensaje = "";
    }
    
    public Postre (String nombre) {
        this.nombre = nombre;
        this.mensaje = "";
    }
    
    public void setNombre(String nombre, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(), usuario)){
            this.nombre = nombre;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
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
    
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getMensaje(){
        return this.mensaje;
    }
    
    public void setPrecio(float precio, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(),usuario)){
            this.precio = precio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else{
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
    }
    
    public double getPrecio(){
        return this.precio;
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
    
    public List<Ingrediente> getIngredientes(){
        return this.ingredientes;
    }
    
    public Ingrediente getIngrediente(String nombre){
        for(int i = 0; i < this.ingredientes.size();i++){
            Ingrediente actual = this.ingredientes.get(i);
            if(actual.getNombre().equals(nombre))
                return actual;
        }
        return new Ingrediente();
    }
    
    private boolean rolPermitido(String rolEsperado, Usuario usuario) {
        Rol rolUsuario = usuario.getRol();
        String nombreRol = rolUsuario.getNombre();
        return nombreRol.equals(rolEsperado);
    }
}
