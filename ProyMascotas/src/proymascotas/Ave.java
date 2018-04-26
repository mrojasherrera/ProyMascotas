/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas;

/**
 *
 * @author alumno
 */
public class Ave extends Mascota {

    public Ave(String unNombre, float unEnergia, float unaEnergiaIdeal) {
        super(unNombre, unEnergia, unaEnergiaIdeal);
    }
     
    @Override
     public void come(){
        super.come(); /* realiza el comportamiento del padre */
        this.setEnergia((float) (this.getEnergia()+1.0));
     }
        
    @Override
    public void juga(){
        super.juga(); /* realiza el comportamiento del padre */
        this.setEnergia((float) (this.getEnergia()-1.0));              
     }
    
    @Override
    public boolean estagordo(){
        return (this.getEnergia() > this.getEnergiaIdeal() * 1.2);
        }

}
