
package ejercicio11main;

import ejercicio11clasedate.DateServices;
import ejercicio11clasedate.Dates;

/**
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor
del objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha 
y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Main {

  
    public static void main(String[] args) {
        // Creamos una instancia de FechaService.
        DateServices Service = new DateServices();

        // Creamos una instancia de Dates con una fecha inicial de 0-0-0.
        Dates date = new Dates();

        // Solicita al usuario que ingrese una nueva fecha.
        Service.solicitarDatos(date);

        // Muestra la fecha ingresada.
        Service.mostrarFecha(date);

        // Calcula y muestra cuántos años han pasado desde la fecha ingresada hasta la actualidad.
        Service.calcularDiferencia(date);
    }
    
}
