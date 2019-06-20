/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jheron Chacon
 */
public class ProductoIT {
    
    public ProductoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombreProducto method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("getNombreProducto");
        Producto instance = new Producto();
        
        String nombreProducto = "Hamburguesa con queso";
        
        Usuario usuario = new Usuario("Jhon Doe",new Rol(Rol.getGerente()));
        
        instance.setNombre(nombreProducto, usuario);
        
        String result = Mensaje.EXITO;
        
        assertEquals(instance.getMensaje(), result);
    }
    
    @Test
    public void testSetNombre_Error() {
        System.out.println("getNombreProducto");
        Producto instance = new Producto();
        String nombreProducto = "Hamburguesa con queso";
        Usuario usuario = new Usuario("Jhon Doe",new Rol(Rol.getCajero()));
        instance.setNombre(nombreProducto, usuario);
        String result = Mensaje.ACCESO_DENEGADO;
        assertEquals(instance.getMensaje(), result);
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 1000.0;
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getGerente()));
        Producto instance = new Producto("Papas fritas");
        instance.setPrecio(precio, usuario);
        assertEquals(instance.getMensaje(),Mensaje.EXITO);
    }
    @Test
    public void testSetPrecio_Error() {
        System.out.println("setPrecio");
        double precio = 1000.0;
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getCliente()));
        Producto instance = new Producto("Papas fritas");
        instance.setPrecio(precio, usuario);
        assertEquals(instance.getMensaje(),Mensaje.ACCESO_DENEGADO);
    }

    /**
     * Test of addIngrediente method, of class Producto.
     */
    @Test
    public void testAddIngrediente() {
        System.out.println("addIngrediente");
        Ingrediente ingrediente = new Ingrediente("Tomate");
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getCocinero()));
        Producto instance = new Producto();
        instance.addIngrediente(ingrediente, usuario);
        String mensaje = instance.getMensaje();
        assertEquals(mensaje, Mensaje.EXITO);
    }    
    @Test
    public void testAddIngrediente_Error() {
        System.out.println("addIngrediente");
        Ingrediente ingrediente = new Ingrediente("Tomate");
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getGerente()));
        Producto instance = new Producto();
        instance.addIngrediente(ingrediente, usuario);
        String mensaje = instance.getMensaje();
        assertEquals(mensaje, Mensaje.ACCESO_DENEGADO);
    }  
    
    @Test
    public void testDelIngrediente_Exito(){
        Ingrediente ingrediente = new Ingrediente("Tomate");
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getCocinero()));
        Producto producto = new Producto("Hamburguesa");
        producto.addIngrediente(ingrediente, usuario);
        producto.delIngrediente(ingrediente, usuario);
        String mensaje = producto.getMensaje();
        assertEquals(mensaje,Mensaje.EXITO);
    }
    
    @Test
    public void testDelIngrediente_Error_denegado(){
        Ingrediente ingrediente = new Ingrediente("Tomate");
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getCajero()));
        Producto producto = new Producto("Hamburguesa");
        producto.addIngrediente(ingrediente, usuario);
        producto.delIngrediente(ingrediente, usuario);
        String mensaje = producto.getMensaje();
        assertEquals(mensaje,Mensaje.ACCESO_DENEGADO);
    }
    
    @Test
    public void testDelIngrediente_Error_No_Encontrado(){
        Ingrediente ingrediente = new Ingrediente("Tomate");
        Usuario usuario = new Usuario("Jhon Doe", new Rol(Rol.getCocinero()));
        Producto producto = new Producto("Hamburguesa");
        producto.addIngrediente(ingrediente, usuario);
        
        Ingrediente ingrediente2 = new Ingrediente("Queso");
        producto.delIngrediente(ingrediente2, usuario);
        
        String mensaje = producto.getMensaje();
        assertEquals(mensaje,Mensaje.NO_ENCONTRADO);
    }
    
}
