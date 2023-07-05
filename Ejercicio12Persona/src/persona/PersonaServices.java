/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento(Tipo Date), 
constructor vacío, constructor parametrizado, get y set. 
Y los siguientes métodos:

-Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de 
nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

-Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer la edad 
de la persona también se debe conocer la fecha actual.

-Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el 
receptor tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.

-Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

 */
public class PersonaServices {
 
    // Método crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de 
    // nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda 
    //en el objeto.
    public void crearPersona(Persona persona){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (Formato: 17 jun 1992 en minusculas)");
        //esta es una llamada estática al método ofPattern de DateTimeFormatter que crea un nuevo formateador de fecha 
        //y hora utilizando el patrón de formato de fecha dado y el Locale. Los patrones de formato de fecha son cadenas 
        //como "d MMM yyy" que describen cómo se debe interpretar una fecha.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyy", new Locale("es", "ES"));
        //este es el patrón de formato de fecha. En este caso, d es para el día del mes, MMM es para el nombre del mes en letra y yyy es para el año.
        //Aquí, se está creando un nuevo objeto Locale para español de España ("es" es el código de idioma para español 
        //y "ES" es el código de país para España). Este Locale se utiliza para localizar el formato de la fecha 
        //(es decir, los nombres de los meses se representarán en español).
        String fechaString = leer.nextLine();
        LocalDate fecha = LocalDate.parse(fechaString, formatter);
        persona.setFechaNacimiento(fecha);
    }
    //método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer 
    //la edad de la persona también se debe conocer la fecha actual.
    public int calcularEdad(Persona persona){
        Period periodo = Period.between(persona.getFechaNacimiento(), LocalDate.now());
        return periodo.getYears();
    }
    
    //método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga 
    //menor edad que la persona que se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(Persona persona, int edad){
        //calculamos la edad de la persona
        int edadPersona = calcularEdad(persona);
        //comparamos esta edad con la edad proporcionada
        boolean esMenor = edadPersona < edad;
        //Retornamos el resultado
        return esMenor;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNacimiento());
        System.out.println("Edad: "+calcularEdad(persona));
    }
    
}
