/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maroc
 */
public class Baraja {
    private List<Carta> cartas;
    private int cartaActual;

    public Baraja() {
        this.cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    this.cartas.add(new Carta(i, palo));
                }
            }
        }
        this.cartaActual = 0;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getCartaActual() {
        return cartaActual;
    }

    public void incrementCartaActual() {
        this.cartaActual++;
    }

    public void setCartaActual(int index) {
        this.cartaActual = index;
    }
}