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
    
    public boolean estaGordo(){
        boolean estaMascotaEstaGorda;
        estaMascotaEstaGorda = this.energia > this.energiaIdeal*1.3;
        return estaMascotaEstaGorda;
    }
    
    
    
}
