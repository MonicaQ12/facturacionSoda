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
public class MantenimientoBebida extends Mantenimiento {
    
    public MantenimientoBebida(){
        super(new Bebida());
    }
    
    public Bebida getBebida(int id){
        for(Producto producto : this.productos){
            if(producto.getId()==id){
                return (Bebida)producto;
            }
        }
        return null;
    }

    @Override
    public void verProductos() {
        for(Producto producto : this.productos){
            if(producto instanceof Bebida){
                this.imprimirElemento(producto);
            }
        }
    }

    @Override
    public void verProducto(int id) {
        for(Producto producto : this.productos){
            if(producto instanceof Bebida){
                if(producto.getId()==id){
                    this.imprimirElemento(producto);
                }
            }
        }
    }

    @Override
    public void addProducto(Producto producto) {
        if(producto instanceof Bebida){
            Bebida bebida = (Bebida)producto;
            this.productos.add(bebida);
        }
    }

    @Override
    public void updProducto(Producto producto) {
        if(producto instanceof Bebida){
            for(Producto buscado : this.productos){
                if(buscado.getId()==producto.getId()){
                    buscado = producto;
                    break;
                }
            }
        }
    }

    @Override
    public void delProducto(Producto producto) {
        if(producto instanceof Bebida){
            this.productos.remove(producto);
        }
    }

    @Override
    protected void imprimirElemento(Producto producto) {
        Bebida bebida = (Bebida)producto;
        String bebidaInfo = Integer.toString(bebida.getId()) + ", " + 
                bebida.getNombre() + ", " + 
                bebida.getTamanio() + ", " + 
                bebida.getCaducidad();
        Io.escribir(bebidaInfo);
    }
    
}
