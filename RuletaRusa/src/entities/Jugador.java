/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author maroc
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador "+ id;
        this.mojado = false;
    }
  
   public boolean disparo(RevolverDeAgua revolver){
       boolean mojar = revolver.mojar();
       if (mojar) {
          mojado = true;   
       }
       revolver.siguienteChorro();
       return mojar;
   } 
    
   public String getNombre(){
       return nombre;
   }
}
