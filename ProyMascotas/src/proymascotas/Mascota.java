package proymascotas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alumno
 */
public class Mascota {
    public String nombre;
    public float energiaIdeal;
    public float energia;
    
      public Mascota(String nombre, float energiaIdeal, float energia) {
        this.nombre = nombre;
        this.energiaIdeal = energiaIdeal;
        this.energia = energia;
    }
    public Mascota () {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEnergiaIdeal() {
        return energiaIdeal;
    }

    public void setEnergiaIdeal(float energiaIdeal) {
        this.energiaIdeal = energiaIdeal;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
      
    
      public void come( ){
        this.energia = this.energia + 2;
        
    }
    
    public void juga ( ){
        this.energia = this.energia -1;       
    }
    
    public boolean estagordo( ){
        if (this.energia > this.energiaIdeal*1.3){
        return true;
    }


