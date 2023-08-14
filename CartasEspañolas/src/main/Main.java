/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cartaservices.BarajaService;

/**
 *
 * @author maroc
 */
public class Main {
    public static void main(String[] args) {
        BarajaService service = new BarajaService();

        service.barajar();
        System.out.println("Primera carta: " + service.siguienteCarta());
        System.out.println("Cartas disponibles: " + service.cartasDisponibles());
        System.out.println("Dar 5 cartas: " + service.darCartas(5));
        System.out.println("Cartas disponibles: " + service.cartasDisponibles());
        System.out.println("Cartas del montón: " + service.cartasMonton());
        System.out.println("Mostrar baraja:");
        service.mostrarBaraja();
    }
}