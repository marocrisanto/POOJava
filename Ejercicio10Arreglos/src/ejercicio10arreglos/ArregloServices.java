
package ejercicio10arreglos;

import java.util.Scanner;

/**
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class ArregloServices {
    // Método para crear el arreglo A
    public void crearArregloA(Arreglo arreglo){
        int tamaño = 50;
        double[] arregloA = new double[tamaño];
        //Utilizamos un for para llenar el arreglo
        for (int i = 0; i < tamaño; i++) {
            arregloA[i] = Math.random();
        }
        arreglo.setArregloA(arregloA);
    }
    
     // Método para imprimir el arreglo A con bucle for each
    public void imprimirArregloA(Arreglo arreglo){
        double[] arregloA = arreglo.getArregloA();
        System.out.println("Arreglo A:");
        int count = 1;
        for (double i:arregloA) {
            System.out.println(count+ ")"+i);
            count ++;
        }
    }
    // Método para ordenar el arreglo A con ordenamiento por burbuja
    public void ordenarArregloA(Arreglo arreglo){
        double aux;//Variable auxiliar para ordenar
        double[] arrayA = arreglo.getArregloA();
        for (int i = 0; i < arrayA.length-1; i++) {
            for (int j = 0; j < arrayA.length-1; j++) {
                // Si numActual > numSiguiente
                if (arrayA[j] > arrayA[j+1]) {  //El numActual es el arreglaA con el iterador j y numSiguiente es j+1
                    aux = arrayA[j];            //Almacena temporalmente el valor del elemento actual en el ciclo exterior (i).
                    arrayA[j] = arrayA[j+1];    //numActual le agregamos el valor del num siguiente
                    arrayA[j+1] = aux;          //numero siguiente es igual al numActual que esta dentro de aux
                   }
                
                } 
            }
        arreglo.setArregloA(arrayA);
        }
    //Metodo para imprimir el arreglo A ordenado
    public void imprimirArregloAOrdenado(Arreglo arreglo){
        double[] arregloA = arreglo.getArregloA();
        System.out.println("Arreglo A Ordenado:");
        int count = 1;
        for (double i:arregloA) {
            System.out.println(count+ ")"+i);
            count ++;
        }
    }
    
    // Método para crear el arreglo B y copiar los primeros 10 números de A en B
     public void crearArregloB(Arreglo arreglo, Arreglo arregloB) {
        double[] arrayA = arreglo.getArregloA();
        double[] arrayB = new double[20];
         
        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];       // Copia los primeros 10 números de A en B
        }
        for (int i = 10; i < 20; i++) { 
            arrayB[i]  = 0.5;            // Rellena los 10 últimos elementos con el valor 0.5
        }
        arregloB.setArregloB(arrayB);
     }
    
    // Método para imprimir el arreglo B con bucle for each
    public void imprimirArregloB(Arreglo arregloB) {
        double[] arrayB = arregloB.getArregloB();
        System.out.println("Arreglo B Combinado:");
        int count = 1;
        for (double i : arrayB) {
            System.out.println(count+ ")"+i);
            count ++;
        }
    }
}
 