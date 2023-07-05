
package arreglomain;

import ejercicio10arreglos.Arreglo;
import ejercicio10arreglos.ArregloServices;

/**
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class Main {

    public static void main(String[] args) {
   //Instanciamos la clase Arreglo
    Arreglo arregloA = new Arreglo(); //Este objeto es para para almacenar el arreglo A
    Arreglo arregloB = new Arreglo(); //Este objeto es para para almacenar el arreglo A
    
   //Creamos una nueva instancia del objeto ArregloServices. 
   //Esta clase contiene una serie de métodos que se puede usar para manipular los arreglos, como crear, imprimir y ordenar.
    ArregloServices services = new ArregloServices();//Creamos un servicio
        
   //Llamamos a los métodos para crear y mostrar el arregloA
    services.crearArregloA(arregloA);
   //Llama al método imprimir
    services.imprimirArregloA(arregloA);

   //Ordenar el arregloA y mostrarlo    
    services.ordenarArregloA(arregloA);
    services.imprimirArregloAOrdenado(arregloA);
    
   //Crear el arregloB a partir del arregloA y mostrarlo
    services.crearArregloB(arregloA, arregloB);
    services.imprimirArregloB(arregloB);
    }
}
