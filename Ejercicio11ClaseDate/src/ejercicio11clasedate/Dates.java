/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11clasedate;

import java.time.LocalDate;

/**
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Dates. En este ejercicio deberemos instanciar en el main, una fecha usando la clase Dates, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor
del objeto Dates. Una vez creada la fecha de tipo Dates, deberemos mostrarla y mostrar cuantos años hay entre esa fecha 
y la fecha actual, que se puede conseguir instanciando un objeto Dates con constructor vacío. 
Ejemplo fecha: Dates fecha = new Dates(anio, mes, dia);
Ejemplo fecha actual: Dates fechaActual = new Dates();
 */
public class Dates {
    
    //Atributos
    private LocalDate fechas;
        
    // Metodo constructor sin los atributos pasados por parámetro.
    public Dates() {
    }

    
    // Método constructor con todos los atributos pasados por parámetro.
    public Dates(LocalDate fechas, int dia, int mes, int anio) {
        this.fechas = LocalDate.of(anio, mes, dia);
    }

    // Métodos getters y setters de cada atributo.
    public LocalDate getFechas() {
        return fechas;
    }

    public void setFechas(LocalDate fechas) {
        this.fechas = fechas;
    }
   
}

