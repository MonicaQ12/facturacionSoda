/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

/**
 *
 * @author Jheron Chacon
 */
public interface Crudable {
    public abstract void verProductos();
    public abstract void verProducto(int id);
    public abstract void addProducto(Producto producto);
    public abstract void updProducto(Producto producto);
    public abstract void delProducto(Producto producto);
}
