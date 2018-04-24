/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

import proymascotas.Mascota;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmaldonado
 */
public class TestCome {
    private Mascota pepo;
    
    public TestCome() {
        
    }
    
    @Test
    public void TestPepoDebeComer(){
        pepo.come();
        assertEquals(2, pepo.getEnergia(), 0.1);
        
        
    }
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pepo = new Mascota("pepita", 0, 4);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
