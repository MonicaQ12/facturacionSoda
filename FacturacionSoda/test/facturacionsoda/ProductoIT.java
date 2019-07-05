/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import Mensajeria.Mensaje;
import Seguridad.Rol;
import Seguridad.Usuario;
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

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto();
        double expResult = 10.0;
        instance.setPrecio(10.0, new Usuario("Patata", new Rol(Rol.getGerente())));
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of delIngrediente method, of class Producto.
     */
    @Test
    public void testDelIngrediente() {
        System.out.println("delIngrediente");
        Ingrediente ingrediente = null;
        Usuario usuario = null;
        Producto instance = new Producto();
        instance.delIngrediente(ingrediente, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredientes method, of class Producto.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Producto instance = new Producto();
        List<Ingrediente> expResult = null;
        List<Ingrediente> result = instance.getIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngrediente method, of class Producto.
     */
    @Test
    public void testGetIngrediente() {
        System.out.println("getIngrediente");
        String nombre = "";
        Producto instance = new Producto();
        Ingrediente expResult = null;
        Ingrediente result = instance.getIngrediente(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Producto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Usuario usuario = null;
        Producto instance = new Producto();
        instance.setId(id, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class Producto.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rolPermitido method, of class Producto.
     */
    @Test
    public void testRolPermitido() {
        System.out.println("rolPermitido");
        String rolEsperado = "";
        Usuario usuario = null;
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.rolPermitido(rolEsperado, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
