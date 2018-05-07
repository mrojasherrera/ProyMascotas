/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
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
public class TestDAOJsonMamifero {
    private Mamiferos odie;
    private DAOJsonA unDaoJson;
    public TestDAOJsonMamifero() {
        
    }
        
    @Before
    public void setUp() throws JSONException{
        odie = new Mamiferos("odie", 1, 10);
        unDaoJson= new DAOJsonA(odie);
        
    }//fin Before
    @Test
    public void TestMamiferoADAOJsonMamifero() throws IOException, JSONException{
        unDaoJson.grabarAJson();
        
}
    }//fin TestMamiferoADAOJsonMamifero

