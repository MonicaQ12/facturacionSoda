/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import Seguridad.Rol;
import Seguridad.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jheron Chacon
 */
public class Menu {
    private List<Producto> productos = new ArrayList<Producto>();
    private Rol cajero = new Rol("Cajero");
    private Rol gerente = new Rol("Gerente");

    public List<Producto> getProductos(Usuario usuario) {
        if(usuario.getRol().getNombre().equals(cajero.getNombre()) ||
            usuario.getRol().getNombre().equals(gerente.getNombre()))
            return this.productos;
        else
            return null;
    }
    
    public void addProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public List<Producto> getProductos() {
        return this.productos;
    }
    
    public void delProducto(String nombre){
        Producto producto = new Producto();
        for(int i = 0; i < this.productos.size(); i++){
            producto = this.productos.get(i);
            if(producto.getNombre().equals(nombre)){
                break;
            }
        }
        this.productos.remove(producto);
    }
}
