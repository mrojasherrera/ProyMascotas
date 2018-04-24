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
public class Entrenador {

         
   
    String nombre;
    Mascota mascota;
    int nivel;
     
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
   
      public Entrenador(String nombre, Mascota mascota, int nivel) {
        this.nombre = nombre;
        this.mascota = mascota;
        this.nivel = nivel;
    }
      
       public Entrenador() {
        
    }
       
       public static void entrena (Mascota unaMascota) {
                 unaMascota.juga();  
}
       
       public static void alimenta (Mascota unaMascota) {
           unaMascota.come();                
}
       
           public static void suMascotaEstaGorda (Mascota unaMascota) {
                 unaMascota.estagordo(); 
                 
}
          
}

 