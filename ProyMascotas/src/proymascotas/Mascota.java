
package proymascotas;


/**
 *
 * @author jmaldonado
 */
public class Mascota {
    private String nombre;
    private float energia;
    private float energiaIdeal;

    public Mascota(String unNombre, float unEnergia, float unaEnergiaIdeal) {
        this.nombre = unNombre;
        this.energia = unEnergia;
        this.energiaIdeal = unaEnergiaIdeal;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getEnergiaIdeal() {
        return energiaIdeal;
    }

    public void setEnergiaIdeal(float energiaIdeal) {
        this.energiaIdeal = energiaIdeal;
    }

    
    public void come(){
        this.energia=this.energia+2;
    }
    public void juga(){
        this.energia=this.energia-1;
    }
    
     
    
    public boolean estagordo( ){
        Boolean esta_gordo; 
        esta_gordo = false;
        if (this.energia > this.energiaIdeal*1.3){
            esta_gordo = true;
            }
        return esta_gordo;
    } // fin estagordo()
    
    /*
    Tambien se pudo haber escrito
    public boolean estagordo(){
        return (this.energia > this.energiaIdeal * 1.3);
        }
    */

}