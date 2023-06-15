/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4rectangulo;

//Clase de servicio para manipular objetos de la clase Operacion.

import java.util.Scanner;

public class RectanguloService {
    
    // Método para crearRectangulo(): que le pide al usuario los datos y los guarda en los atributos del objeto.
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos en la variable local
        System.out.println("Ingrese la base del rectángulo");
        double base = leer.nextDouble();
         System.out.println("Ingrese la altura del rectángulo");
        double altura = leer.nextDouble();
        return new Rectangulo(base, altura);
    } 
}
