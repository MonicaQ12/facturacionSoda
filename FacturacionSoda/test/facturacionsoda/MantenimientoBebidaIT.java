/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

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
public class MantenimientoBebidaIT {
    
    public MantenimientoBebidaIT() {
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
     * Test of getBebida method, of class MantenimientoBebida.
     */
    @Test
    public void testGetBebida() {
        System.out.println("getBebida");
        int id = 0;
        MantenimientoBebida instance = new MantenimientoBebida();
        Bebida expResult = null;
        Bebida result = instance.getBebida(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verProductos method, of class MantenimientoBebida.
     */
    @Test
    public void testVerProductos() {
        System.out.println("verProductos");
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.verProductos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verProducto method, of class MantenimientoBebida.
     */
    @Test
    public void testVerProducto() {
        System.out.println("verProducto");
        int id = 0;
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.verProducto(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProducto method, of class MantenimientoBebida.
     */
    @Test
    public void testAddProducto() {
        System.out.println("addProducto");
        Producto producto = null;
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.addProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updProducto method, of class MantenimientoBebida.
     */
    @Test
    public void testUpdProducto() {
        System.out.println("updProducto");
        Producto producto = null;
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.updProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delProducto method, of class MantenimientoBebida.
     */
    @Test
    public void testDelProducto() {
        System.out.println("delProducto");
        Producto producto = null;
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.delProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirElemento method, of class MantenimientoBebida.
     */
    @Test
    public void testImprimirElemento() {
        System.out.println("imprimirElemento");
        Producto producto = null;
        MantenimientoBebida instance = new MantenimientoBebida();
        instance.imprimirElemento(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
