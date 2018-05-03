/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

 

/**
 *
 * @author Nina
 */
public class DAOJsonA {
 
public DAOJsonA(Mascota unaMascota) throws JSONException {
    
JSONObject obj = new JSONObject();
String nombre = unaMascota.getNombre();
float energia = unaMascota.getEnergia();
float energiaIdeal = unaMascota.getEnergiaIdeal();
obj.put("nombre", nombre);
obj.put ("energia", energia);
obj.put ("energiaIdeal", energiaIdeal);

try (FileWriter file = new FileWriter("mascotita.json"))
{
	file.write(obj.toString());
	file.flush();
}
catch (IOException e)
{
//e.printStackTrace();
}
}
    
}
    
    

