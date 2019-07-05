/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import static facturacionsoda.FacturacionSoda.usuarioLogueado;

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
    
    @Override
    public void menuMantenimiento() {
        Bebida bebida = null;
        this.codigo = 0;
        this.opcion = 1;
        while(opcion > 0){
            opcion = this.imprimirMenu();
            switch(opcion){
                case 1: //Ver todos
                    this.verProductos();
                    break;
                case 2: //Ver uno especifico
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea consultar");
                    this.verProducto(codigo);
                    break;
                case 3: //Agregar uno nuevo
                    bebida = new Bebida();
                    bebida.setId(Io.preguntarEntero("Ingrese el código de la bebida"), usuarioLogueado);
                    bebida.setNombre(Io.preguntarString("Ingrese el nombre de la bebida"), usuarioLogueado);
                    bebida.setTamanio(Io.preguntarString("Ingrese el tamaño de la bebeida"), usuarioLogueado);
                    bebida.setCaducidad(Io.preguntarString("Ingrese la fecha de caducidad de la bebida"), usuarioLogueado);
                    bebida.setPrecio(Io.preguntarDouble("Ingrese el precio de la bebida"), usuarioLogueado);
                    this.addProducto(bebida);
                    break;
                case 4: //Actializar uno existente
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea actualizar");
                    this.verProducto(codigo);
                    bebida = this.getBebida(codigo);
                    bebida.setId(Io.preguntarEntero("Ingrese el código de la bebida"), usuarioLogueado);
                    bebida.setNombre(Io.preguntarString("Ingrese el nombre de la bebida"), usuarioLogueado);
                    bebida.setTamanio(Io.preguntarString("Ingrese el tamaño de la bebeida"), usuarioLogueado);
                    bebida.setCaducidad(Io.preguntarString("Ingrese la fecha de caducidad de la bebida"), usuarioLogueado);
                    bebida.setPrecio(Io.preguntarDouble("Ingrese el precio de la bebida"), usuarioLogueado);
                    String respuesta = Io.preguntarString("Desea agregar ingredientes? S/N");
                    if(respuesta.toLowerCase().equals("s")){
                        //En esta etapa del proyecto no existe manera de agregar ingredientes a los productos.
                    }
                    this.updProducto(bebida);
                    break;
                case 5:
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea eliminar");
                    this.verProducto(codigo);
                    bebida = this.getBebida(codigo);
                    if(Io.preguntarEntero("Seguro desea eliminar la bebida? 1 = Si, 0 = No")==1)
                        this.delProducto(bebida);
                    break;
                default:
                    break;
            }
        }
    }
    
}
