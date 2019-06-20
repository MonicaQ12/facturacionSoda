/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jheron Chacon
 */
public class Producto {

    private String nombre;
    private String mensaje;
    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    private double precio;
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(),usuario)){
            this.precio = precio;
            this.mensaje = Mensaje.EXITO;
        }
        else{
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
    
    public void addIngrediente(Ingrediente ingrediente, Usuario usuario){
        if(this.rolPermitido(Rol.getCocinero(),usuario)){
            this.ingredientes.add(ingrediente);
            this.mensaje = Mensaje.EXITO;
        }
        else{
            this.mensaje = Mensaje.ACCESO_DENEGADO;
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
            this.mensaje = eliminado ? Mensaje.EXITO : Mensaje.NO_ENCONTRADO;
        }
        else
            this.mensaje = Mensaje.ACCESO_DENEGADO;
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
    
    public Producto(){
        this.nombre = "";
        this.mensaje = "";
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.mensaje = "";
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(), usuario)){
            this.nombre = nombre;
            this.mensaje = Mensaje.EXITO;
        }
        else
            this.mensaje = Mensaje.ACCESO_DENEGADO;
    }
    
    public String getMensaje(){
        return this.mensaje;
    }

    
    
    
    
}
