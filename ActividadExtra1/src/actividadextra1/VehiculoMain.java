
package actividadextra1;

import ActividadExtra.Vehiculo;
import ActividadExtra.VehiculoService;

/*
Crear una clase "Vehículo" con atributos como "marca","modelo","año" y "tipo" (En tipo, vamos a indicar si es un automóvil, 
una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:

 -Moverse: Es la cantidad de metros que avanzará por segundo.
 -Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará más metros.
Referencias:
 -Un automóvil avanza 3 metros por segundo.
 -Una motocicleta avanza 2 metros por segundo.
 -Una bicicleta avanza 1 metro por segundo.

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.

*/
public class VehiculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Instanciamos la clase Libro
        VehiculoService servicio = new VehiculoService();//Creamos un servicio

        Vehiculo vehiculo1 = servicio.crearVehiculo();
        Vehiculo vehiculo2 = servicio.crearVehiculo();
        Vehiculo vehiculo3 = servicio.crearVehiculo();

        System.out.println("El vehículo 1 avanzó " + vehiculo1.Moverse(5) + " metros en 5 segundos.");
        System.out.println("El vehículo 2 avanzó " + vehiculo2.Moverse(10) + " metros en 10 segundos.");
        System.out.println("El vehículo 3 avanzó " + vehiculo3.Moverse(60) + " metros en 1 minuto.");

        //calculamos cuántos metros avanzaría cada vehículo en 5 minutos (5*60 segundos) si se mueven y luego frenan.
        int distancia1 = vehiculo1.Moverse(5*60) - vehiculo1.Frenar();  
        int distancia2 = vehiculo2.Moverse(5*60) - vehiculo2.Frenar();
        int distancia3 = vehiculo3.Moverse(5*60) - vehiculo3.Frenar();

        if (distancia1 > distancia2 && distancia1 > distancia3) {
            System.out.println("El vehículo 1 llegó más lejos después de frenar, avanzando " + distancia1 + " metros.");
        } else if (distancia2 > distancia1 && distancia2 > distancia3) {
            System.out.println("El vehículo 2 llegó más lejos después de frenar, avanzando " + distancia2 + " metros.");
        } else {
            System.out.println("El vehículo 3 llegó más lejos después de frenar, avanzando " + distancia3 + " metros.");
        }
    }
}

