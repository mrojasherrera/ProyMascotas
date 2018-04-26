    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

/**
 *
 * @author jmaldonado
 */
public class Mamiferos extends Mascota{
    
    public Mamiferos(String unNombre, float unEnergia, float unaEnergiaIdeal) {
        super(unNombre, unEnergia, unaEnergiaIdeal);
    }//fin constructor
    
    
    @Override 
    public void come(){
        this.setEnergia((float)(this.getEnergia()*1.10));
    }//fin come
    @Override//cada vez que se suscribe un metodo de clase padre, hay que poner esta anotacion (override=sobrescribir)
    public void juga(){
        this.setEnergia((float)(this.getEnergia()*0.95));
    }//fin juga
    
}//fin mascota
