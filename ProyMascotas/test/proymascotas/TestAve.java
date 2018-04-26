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
 * @author alumno
 */
public class TestAve {
    Ave pepita;
    public TestAve() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    pepita = new Ave("pepita",5,5);  
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    
     @Test
    public void TestPepitaDebeComer(){
        pepita.come();
        assertEquals(8.0 , pepita.getEnergia(), 0.1);
    }
    
    @Test
    public void TestPepitaDebeJugar(){
        pepita.juga();
        assertEquals( 3.0 , pepita.getEnergia(), 0.1);
    }
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
