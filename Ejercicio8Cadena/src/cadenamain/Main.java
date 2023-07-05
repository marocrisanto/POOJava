/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenamain;

import cadena.Cadena;
import cadena.CadenaServices;
import java.util.Scanner;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras
separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud de manera automática
según la longitud de la frase ingresada. 

Deberá además implementar los siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
       Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
       se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
       frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada
       por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
       por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
       verdadero si la contiene y falso si no.
*/
public class Main {
 
     public static void main(String[] args) {
//En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o 
//varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud 
//de manera automática según la longitud de la frase ingresada.     
          Scanner leer = new Scanner(System.in);
          // Pedimos al usuario que ingrese una frase
          System.out.println("Ingrese una frase");
          // Guardar la frase ingresada por el usuario en la variable frase
          String frase = leer.nextLine();
          
          //Instanciamos la clase CadenaServices
          CadenaServices service = new CadenaServices();
          
          // Creamos un nuevo objeto Cadena
          Cadena cadena = new Cadena();
          // Establecemos la frase del objeto Cadena en la frase que el usuario ingresó
          cadena.setFrase(frase);
          // Establecemos la longitud de la frase del objeto Cadena en la longitud de la frase que el usuario ingresó
          cadena.setLongitud(frase.length());
          
          //Llamamos a los metodos del objeto CadenaServices pasando el objeto cadena como argumento
          service.mostrarVocales(cadena);
          service.invertirFrase(cadena);
          service.vecesRepetido(cadena);
          service.compararLongitud(cadena);
          service.unirFrases(cadena);
          service.reemplazar(cadena);
          service.contiene(cadena);
          
    }
     
}
