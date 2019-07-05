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
public class FacturacionSoda {

    /**
     * @param args the command line arguments
     */
    static List<Usuario> usuarios = new ArrayList<Usuario>();
    static Usuario usuarioLogueado = new Usuario();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario administrador = new Usuario("administrador", new Rol(Rol.getGerente()));
        usuarios.add(administrador);
        
        if(login()){
            int opcion = 1;
            while(opcion > 0){
                Io.escribir("Que desea hacer?");
                Io.escribir("1. Ver todo el menu");
                Io.escribir("2. Agregar al carrito");
                Io.escribir("3. Eliminar del carrito");
                Io.escribir("4. Pagar");
                Io.escribir("5. Administrar el menu");
                Io.escribir("6. Administrar usuarios");
                Io.escribir("7. Administrar Roles");
                Io.escribir("8. Administrar Sodas");
                Io.escribir("0. SALIR");
                opcion = Io.leerEntero();
                switch(opcion){
                    case 1:
                        verMenuDeSistema();
                        break;
                    case 2:
                        agregarCarrito();
                        break;
                    case 3:
                        eliminarCarrito();
                        break;
                    case 4:
                        pagar();
                        break;
                    case 5:
                        administrarMenu();
                        break;
                    case 6:
                        administrarUsuarios();
                        break;
                    case 7:
                        administrarRoles();
                        break;
                    case 8:
                        administrarSodas();
                        break;
                    case 9:
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    private static boolean login(){
        boolean preguntar = true;
        while(preguntar){
            Io.escribir("Ingrese nombre de usuario (administrador)");
            String nombre = Io.leerString();
            for(Usuario usuario : usuarios){
                if(usuario.getNombre().equals(nombre)){
                    usuarioLogueado = usuario;
                    preguntar = false;
                }
            }
        }
        return !preguntar;
    } 

    private static void verMenuDeSistema() {
        int opcion = 1;
        Mantenimiento mantenimiento;
        while(opcion > 0){
            Io.escribir("1. Para ir al mantenimiento de bebidas");
            Io.escribir("0. Para salir al menú principal");
            opcion = Io.leerEntero();
            switch(opcion){
            case 1:
                mantenimiento = new MantenimientoBebida();
                menuSistema((MantenimientoBebida)mantenimiento);
                break;
            default:
                break;
        }
        }
    }

    private static void agregarCarrito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void eliminarCarrito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void administrarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void administrarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void administrarRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void administrarSodas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void menuSistema(MantenimientoBebida mantenimiento) {
        Bebida bebida = null;
        int codigo = 0;
        int opcion = 1;
        while(opcion > 0){
            opcion = mantenimiento.imprimirMenu();
            switch(opcion){
                case 1: //Ver todos
                    mantenimiento.verProductos();
                    break;
                case 2: //Ver uno especifico
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea consultar");
                    mantenimiento.verProducto(codigo);
                    break;
                case 3: //Agregar uno nuevo
                    bebida = new Bebida();
                    bebida.setId(Io.preguntarEntero("Ingrese el código de la bebida"), usuarioLogueado);
                    bebida.setNombre(Io.preguntarString("Ingrese el nombre de la bebida"), usuarioLogueado);
                    bebida.setTamanio(Io.preguntarString("Ingrese el tamaño de la bebeida"), usuarioLogueado);
                    bebida.setCaducidad(Io.preguntarString("Ingrese la fecha de caducidad de la bebida"), usuarioLogueado);
                    bebida.setPrecio(Io.preguntarDouble("Ingrese el precio de la bebida"), usuarioLogueado);
                    mantenimiento.addProducto(bebida);
                    break;
                case 4: //Actializar uno existente
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea actualizar");
                    mantenimiento.verProducto(codigo);
                    bebida = mantenimiento.getBebida(codigo);
                    bebida.setId(Io.preguntarEntero("Ingrese el código de la bebida"), usuarioLogueado);
                    bebida.setNombre(Io.preguntarString("Ingrese el nombre de la bebida"), usuarioLogueado);
                    bebida.setTamanio(Io.preguntarString("Ingrese el tamaño de la bebeida"), usuarioLogueado);
                    bebida.setCaducidad(Io.preguntarString("Ingrese la fecha de caducidad de la bebida"), usuarioLogueado);
                    bebida.setPrecio(Io.preguntarDouble("Ingrese el precio de la bebida"), usuarioLogueado);
                    String respuesta = Io.preguntarString("Desea agregar ingredientes? S/N");
                    if(respuesta.toLowerCase().equals("s")){
                        //En esta etapa del proyecto no existe manera de agregar ingredientes a los productos.
                    }
                    mantenimiento.updProducto(bebida);
                    break;
                case 5:
                    codigo = Io.preguntarEntero("Ingrese el código de la Bebida que desea eliminar");
                    mantenimiento.verProducto(codigo);
                    bebida = mantenimiento.getBebida(codigo);
                    if(Io.preguntarEntero("Seguro desea eliminar la bebida? 1 = Si, 0 = No")==1)
                        mantenimiento.delProducto(bebida);
                    break;
                default:
                    break;
            }
        }
    }
}
