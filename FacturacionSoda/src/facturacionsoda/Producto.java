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
    //Atributos privados
    protected String nombre;
    protected String mensaje;
    protected List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    protected double precio;
    //Constructores
    public Producto(){
        this.nombre = "";
        this.mensaje = "";
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.mensaje = "";
        this.precio = 0.00;
    }
    //Setters y Getters
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(),usuario)){
            this.precio = precio;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else{
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
        }
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

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre, Usuario usuario){
        if(this.rolPermitido(Rol.getGerente(), usuario)){
            this.nombre = nombre;
            this.mensaje = Mensaje.Mensage.EXITO.name();
        }
        else
            this.mensaje = Mensaje.Mensage.ACCESO_DENEGADO.name();
    }
    
    public String getMensaje(){
        return this.mensaje;
    }
    //Metodos privados de la clase
    protected boolean rolPermitido(String rolEsperado, Usuario usuario) {
        Rol rolUsuario = usuario.getRol();
        String nombreRol = rolUsuario.getNombre();
        return nombreRol.equals(rolEsperado);
    }    
}
