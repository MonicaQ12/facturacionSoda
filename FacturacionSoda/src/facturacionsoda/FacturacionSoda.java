/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import Mensajeria.Mensaje;
import java.util.List;

/**
 *
 * @author Jheron Chacon
 */
public class FacturacionSoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu miMenu = new Menu();
        List<Producto> productos = miMenu.getProductos();
        for(int i = 0; i < productos.size(); i++){
            System.out.println(productos.get(i).getNombre());
        }
        System.out.println(getMensaje());
    }
    
    private static String getMensaje(){
        String mensaje = Mensaje.getMensaje();
        return mensaje;       
    }
    
}
