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
public class MenuIT {
    
    public MenuIT() {
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
     * Test of getProductos method, of class Menu.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        
        Menu instance = this.getLoadedMenu(); 
        
        List<Producto> expResult = this.getProductos();
        
        List<Producto> result = instance.getProductos();
        
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of addProducto method, of class Menu.
     */
    @Test
    public void testAddProducto() {
        System.out.println("addProducto");
        Producto producto = null;
        Menu instance = new Menu();
        instance.addProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delProducto method, of class Menu.
     */
    @Test
    public void testDelProducto() {
        System.out.println("delProducto");
        String nombre = "";
        Menu instance = new Menu();
        instance.delProducto(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private Menu getLoadedMenu() {
        Menu loadedMenu = new Menu();
        
        List<Producto> productos = this.getProductos();
        
        for(int i = 0; i < productos.size(); i++){
            loadedMenu.addProducto(productos.get(i));
        }
        
        return loadedMenu;
    }
    
    private List<Producto> getProductos(){
        List<Producto> productos = new ArrayList<Producto>();
        
        Producto Hamburguesa = new Producto("Hamburguesa");
        Producto HotDog = new Producto("HotDog");
        Producto Nachos = new Producto("Nachos");
        
        productos.add(Nachos);
        productos.add(HotDog);
        productos.add(Hamburguesa);
        
        return productos;
    }

    /**
     * Test of getProductos method, of class Menu.
     */
    @Test
    public void testGetProductos_Usuario() {
        System.out.println("getProductos");
        
        Rol cajero = new Rol("Cajero");
        
        Usuario usuario = new Usuario(cajero);
        
        Menu instance = this.getLoadedMenu();
        
        List<Producto> expResult = this.getProductos();
        
        List<Producto> result = instance.getProductos(usuario);
        
        assertEquals(expResult.size(), result.size());
        
    }
    
    @Test
    public void testGetProductos_Usuario_Null() {
        System.out.println("getProductos");
        
        Rol rolUsuario = new Rol("Cocinera");
        
        Usuario usuario = new Usuario(rolUsuario);
        
        Menu instance = this.getLoadedMenu();
        
        List<Producto> expResult = null;
        
        List<Producto> result = instance.getProductos(usuario);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProductos method, of class Menu.
     */
    @Test
    public void testGetProductos_0args() {
        System.out.println("getProductos");
        Menu instance = new Menu();
        List<Producto> expResult = null;
        List<Producto> result = instance.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
