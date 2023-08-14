/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author maroc
 */
public class Juego {

    private ArrayList<Jugador> jugadores;    
    private RevolverDeAgua revolver;

public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

        public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)) {
                System.out.println(jugador.getNombre() + " se ha mojado!");
                break;
            }
        }
    }
}