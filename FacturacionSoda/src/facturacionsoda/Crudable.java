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
    public abstract void selElements();
    public abstract void selElement(int id);
    public abstract void addElement(Producto producto);
    public abstract void updElement(Producto producto);
    public abstract void delElement(Producto producto);
}
