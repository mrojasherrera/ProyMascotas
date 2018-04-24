package proymascotas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class TestJuga {
    Mascota unaMascota;
    
    public TestJuga() {
    }
    
    @Before
    public void mascotaIncial() {
        unaMascota = new Mascota("pepe",5,5);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    // TODO add test methods here.
    @Test
    public void testJuga(){
        float valorReal;
        unaMascota.juga();
        valorReal = unaMascota.getEnergia();
        assertEquals(4, valorReal, 0.01);
    }
    
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

