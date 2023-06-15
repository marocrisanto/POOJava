
package ejercicio2circunferencia;

//Clase de servicio para manipular objetos de la clase Circunferencia.

import java.util.Scanner;

public class CircunferenciaService {
    
    // c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos en la variable local
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    //Método para mostrar el area de una circunferencia
    public void mostrarArea(Circunferencia circunferencia) {
        double area = circunferencia.area();
        System.out.println("El area de la circunferencia es: "+area);
    }
    
     //Método para mostrar el perimetro de una circunferencia
    public void mostrarPerimetro(Circunferencia circunferencia) {
        double perimetro = circunferencia.perimetro();
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }       
    
}
