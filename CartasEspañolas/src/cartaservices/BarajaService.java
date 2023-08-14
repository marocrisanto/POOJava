/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaservices;

import entities.Baraja;
import entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maroc
 */
public class BarajaService {
    private Baraja baraja;

    public BarajaService() {
        this.baraja = new Baraja();
    }

    public void barajar() {
        Collections.shuffle(baraja.getCartas());
        baraja.setCartaActual(0);
    }

    public Carta siguienteCarta() {
        if (baraja.getCartaActual() < baraja.getCartas().size()) {
            return baraja.getCartas().get(baraja.getCartaActual());
        } else {
            System.out.println("No hay más cartas.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return baraja.getCartas().size() - baraja.getCartaActual();
    }

    public List<Carta> darCartas(int num) {
        if (cartasDisponibles() < num) {
            System.out.println("No hay suficientes cartas para dar.");
            return null;
        } else {
            List<Carta> cartasDadas = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                cartasDadas.add(siguienteCarta());
                baraja.incrementCartaActual();
            }
            return cartasDadas;
        }
    }

    public List<Carta> cartasMonton() {
        return baraja.getCartas().subList(0, baraja.getCartaActual());
    }

    public void mostrarBaraja() {
        for (int i = baraja.getCartaActual(); i < baraja.getCartas().size(); i++) {
            System.out.println(baraja.getCartas().get(i));
        }
    }
}
