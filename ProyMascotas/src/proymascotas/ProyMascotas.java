/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

import org.json.JSONException;

/**
 *
 * @author jmaldonado
 */
public class ProyMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
        Mamiferos odie = new Mamiferos("odie", 1, 10);
        Mamiferos garfield = new Mamiferos("gargield", 1, 50);
        DAOJsonA unDaoJson1= new DAOJsonA(odie);
        DAOJsonA unDaoJson2= new DAOJsonA(garfield);
    }
    
}
