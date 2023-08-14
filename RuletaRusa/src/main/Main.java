/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Juego;
import entities.Jugador;
import entities.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de jugadores (entre 1 y 6): ");
        int numJugadores = sc.nextInt();
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverDeAgua revolver = new RevolverDeAgua();
        Juego juego = new Juego(jugadores, revolver);
        
        juego.ronda();

        sc.close();
    }
}