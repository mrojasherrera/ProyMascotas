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
    JSONObject obj; 
    //ascota unaMascotaDao;
    
public DAOJsonA(Mascota unaMascota) throws JSONException {
    inicializarJSonObject(unaMascota);
}   
public void inicializarJSonObject(Mascota unaMascota) throws JSONException{
    obj = new JSONObject();
String nombre = unaMascota.getNombre();
float energia = unaMascota.getEnergia();
float energiaIdeal = unaMascota.getEnergiaIdeal();
obj.put ("nombre", nombre);
obj.put ("energia", energia);
obj.put ("energiaIdeal", energiaIdeal);
}
public void grabarAJson(){
    try (FileWriter file = new FileWriter("mascotita.json"))
{
	file.write(obj.toString());
	file.flush();
}
catch (IOException e)
{
//e.printStackTrace();
}
}//fin grabarAJson
    
}
    
    

