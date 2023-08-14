/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesentreclases1;

import Service.Perro;
import Service.Persona;

public class RelacionesEntreClases1 {
    public static void main(String[] args) {
        Perro uno = new Perro ("Roxy", "Pastor Belga", 1, "Grande");
        Persona p1 = new Persona("Cindy", "Gil", 29, 4542, uno);
        Perro dos = new Perro ("Jane", "Husky", 8, "Grande");
        Persona p2 = new Persona ("Romina", "Espinoza", 27, 8547, dos);
        System.out.println("La primera persona es: " + p1.toString());
        System.out.println("La segunda persona es: " + p2.toString());
        p1.mostrarPersona();
        p2.mostrarPersona();
        
    }
    
}
