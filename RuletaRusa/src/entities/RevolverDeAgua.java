/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Random;

/**
 *
 * @author maroc
 */
public class RevolverDeAgua {
 private int posicionActual;
 private int posicionAgua;
 
 
 public RevolverDeAgua(){
    llenarRevolver();    
 }
 
 public void llenarRevolver() {
       Random rand = new Random();
       posicionActual = rand.nextInt(6)+1;//Del 1 al 6
       posicionAgua = rand.nextInt(6)+1;
 }

 public boolean mojar(){
     return posicionActual == posicionAgua;
 }
   
 public void siguienteChorro(){
     posicionActual = (posicionActual%6)+1;
 }
 
 @Override
 public String toString(){
     return "Posicion actual: "+ posicionActual+",Posicion del Agua: "+posicionAgua;
 }
      
}
