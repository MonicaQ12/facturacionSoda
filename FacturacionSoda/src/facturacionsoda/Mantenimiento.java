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
public abstract class Mantenimiento extends Menu implements Crudable{
    protected String elemento = "";
    protected int codigo = 0;
    protected int opcion = 0;
    
    public Mantenimiento(Producto producto){
        this.elemento = producto instanceof Bebida ? "Bebida" :
                producto instanceof Casados ? "Casados" :
                producto instanceof Combo ? "Combo" : 
                producto instanceof Ensalada ? "Ensalada" :
                producto instanceof Entrada ? "Entrada" :
                producto instanceof Postre ? "Postre" :
                producto instanceof Sandwiche ? "Sandwiche" : 
                "Producto";
    }
    
    public int imprimirMenu(){
        Io.escribir("que desea hacer?");
        Io.escribir("1. Ver todos los " + this.elemento + "s");
        Io.escribir("2. Ver un " + this.elemento + " específico");
        Io.escribir("3. Agregar un nuevo " + this.elemento);
        Io.escribir("4. Actualizar un " + this.elemento);
        Io.escribir("5. Eliminar un " + this.elemento);
        Io.escribir("0. SALIR");
        return Io.leerEntero();
    }
    
    protected abstract void imprimirElemento(Producto producto);
    public abstract void menuMantenimiento();
}
