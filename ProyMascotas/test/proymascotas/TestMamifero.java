/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proymascotas.Mamiferos;

/**
 *
 * @author jmaldonado
 */
public class TestMamifero {
    private Mamiferos garfield;
    
    public TestMamifero() {
        
    }
    
   
    @Before
    public void setUp() {
        garfield = new Mamiferos("Garfield", 1, 50);
    }//fin before
    @Test
    public void TestComeGarfield(){
        garfield.come();
        assertEquals(1.1, garfield.getEnergia(), 0.5);
    }//fin TestComeGarfield
    @Test
    public void TestJugaGarfield(){
        garfield.juga();
        assertEquals(0.95, garfield.getEnergia(), 0.1);
    }//fin TestComeGarfield
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // 
    // public void hello() {}
}
