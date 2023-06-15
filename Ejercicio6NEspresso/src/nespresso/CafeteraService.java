
package nespresso;

import java.util.Scanner;

/* Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café 
que hay en la cafetera). 
Implemente, al menos, los siguientes métodos:
-Constructor predeterminado o vacío
-Constructor con la capacidad máxima y la cantidad actual
-Métodos getters y setters.
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero.
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera 
la cantidad de café indicada.
*/

public class CafeteraService {
    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        System.out.println("Ingrese la capacidad máxima de la cafetera:");
        int capacidadMaxima = leer.nextInt();

        System.out.println("Ingrese la cantidad actual de café en la cafetera:");
        int cantidadActual = leer.nextInt();

        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.llenarCafetera();
    }

    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese el tamaño de la taza:");
        int taza = leer.nextInt();
        cafetera.servirTaza(taza);
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.vaciarCafetera();
    }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de café a agregar:");
        int cafe = leer.nextInt();
        cafetera.agregarCafe(cafe);
    }
}

