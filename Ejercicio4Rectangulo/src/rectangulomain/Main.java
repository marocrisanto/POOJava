/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package rectangulomain;

import ejercicio4rectangulo.Rectangulo;
import ejercicio4rectangulo.RectanguloService;

public class Main {

    public static void main(String[] args) {
        //Instanciamos la clase Operacion
        Rectangulo mostrarRectangulo = new Rectangulo();//Creamos un objeto vacio
        RectanguloService servicio = new RectanguloService();//Creamos un servicio
        
        //Cargamos el objeto con el servicio y lo imprimimos
        mostrarRectangulo = servicio.crearRectangulo();
        double superficie = mostrarRectangulo.calcularSuperfice();
        System.out.println("La superficie el rectángulo es: "+superficie);
        double perimetro = mostrarRectangulo.calcularPerimetro();
        System.out.println("El perimetro del rectángulo es: "+perimetro);
        System.out.println("Te presento el dibujo del rectángulo");
        mostrarRectangulo.dibujarRectangulo();
    }   
}
