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
public class EnsaladaIT {
    
    public EnsaladaIT() {
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

    @Test
    public void testEnsladaConCrotones() {
        // TODO review the generated test code and remove the default call to fail.
        Ensalada cesar = new Ensalada("Ensalada cesar");
        cesar.aderezo = Ensalada.BALSAMICO;
        cesar.crotones = true;
        String expectedValue = "Ensalada cesar con vinagre balsámico y crotones";
        String recievedValue = cesar.getNombre() + 
                " con " + 
                cesar.aderezo + 
                (cesar.crotones ? " y crotones" : "");
        assertEquals(expectedValue, recievedValue);
    }
    
    @Test
    public void testEnsladaSinCrotones() {
        // TODO review the generated test code and remove the default call to fail.
        Ensalada cesar = new Ensalada("Ensalada cesar");
        cesar.aderezo = Ensalada.BALSAMICO;
        cesar.crotones = false;
        String expectedValue = "Ensalada cesar con vinagre balsámico";
        String recievedValue = cesar.getNombre() + 
                " con " + 
                cesar.aderezo + 
                (cesar.crotones ? " y crotones" : "");
        assertEquals(expectedValue, recievedValue);
    }
    
}
