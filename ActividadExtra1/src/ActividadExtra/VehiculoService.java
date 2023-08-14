
package ActividadExtra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

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
public class VehiculoService {
    
    // c) Metodo crear vehiculo
    public Vehiculo crearVehiculo(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos en la variable local
        System.out.println("Ingrese la marca del vehiculo");
        String marca = leer.nextLine();
        
        System.out.println("Ingrese el modelo del vehiculo");
        String modelo = leer.nextLine();
        
        System.out.println("Ingrese el año del vehiculo");
        int año = leer.nextInt();
        leer.nextLine();  // limpiar el buffer
        
        System.out.println("Ingrese el tipo de vehiculo (automovil, motocicleta, bicicleta):");
        String tipo = leer.nextLine();
        return new Vehiculo(marca, modelo, tipo, año);
    }
}

