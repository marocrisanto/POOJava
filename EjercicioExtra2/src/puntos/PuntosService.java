
package puntos;

import java.util.Scanner;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe 
entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte 
el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html 
*/
public class PuntosService {
    Scanner leer = new Scanner(System.in);
    
    //metodo crearPuntos()
    public void crearPuntos(Puntos puntos){
        System.out.println("Ingrese la coordenada de x1: ");
        double x1 = leer.nextDouble();
        puntos.setX1(x1);
     
        System.out.println("Ingrese la coordenada de y1: ");
        double y1 = leer.nextDouble();
        puntos.setY1(y1);
        System.out.println("Ingrese la coordenada de x2: ");
        double x2 = leer.nextDouble();
        puntos.setX2(x2);
        System.out.println("Ingrese la coordenada de y2: ");
        double y2 = leer.nextDouble();
        puntos.setY2(y2);
    }
    
//metodo calcularDistancia()
    public double calcularDistancia(Puntos puntos){
        double xDiff = puntos.getX2()- puntos.getX1();
        double yDiff = puntos.getY2()- puntos.getY1();
        
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        
    }
    
    public void imprimirDistancia(Puntos puntos){
        double distancia = calcularDistancia(puntos);
        System.out.println("La distancia entre los dos puntos es: "+distancia);
    }
 
    
}

    