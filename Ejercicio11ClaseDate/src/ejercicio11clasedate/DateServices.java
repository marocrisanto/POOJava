/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11clasedate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor
del objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha 
y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class DateServices {
    
    Scanner leer = new Scanner(System.in);
    
    public void solicitarDatos(Dates date){
        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        
        //Establecemos la fecha de la instancia Dates con la fecha ingresada por el usuario
        date.setFechas(LocalDate.of(anio, mes, dia));
    }
    // Método para mostrar la fecha en que se encuentra en la instancia Dates
    public void mostrarFecha(Dates date){
        System.out.println("La fecha ingresada es: " + date.getFechas());
    }
    
    // Método que calcula la diferencia en años entre la fecha actual y la fecha en la instancia de Dates.
    public void calcularDiferencia(Dates date){
        
        //Obtiene la fecha actual
        LocalDate ahora = LocalDate.now();
        
        //Calcular el periodo entre la fecha en la instancia Dates y la fecha actual
        Period periodo = Period.between(date.getFechas(), ahora);
        
        //Muestra la diferencia en años
        System.out.println("Han pasado " + periodo.getYears()+ "años desde "+date.getFechas());
    }
    
}
