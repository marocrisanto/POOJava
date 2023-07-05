    
package movilmain;

import java.util.Scanner;
import movil.Movil;
import movil.MovilService;

/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional. 
Para ello, crearemos un programa donde se pueda almacenar cada producto con su información. 
Crear una entidad Movil con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo. 
El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número correspondiente
al código. A continuación, se implementarán los siguientes métodos:
-Un constructor por defecto.
-Un constructor con todos los atributos como parámetro.
-Métodos getters y setters de cada atributo.
-Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular 
y poder cargarlo en nuestro programa.
-Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. 
Para ello, puede utilizarse un bucle repetitivo
*/

public class movilMain {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de telefonos que desea guardar");
        int cantidad = leer.nextInt();
        
        //Instanciamos la clase MovilService para crear el servicio
        MovilService service = new MovilService();
        
        for (int i = 0; i < cantidad; i++) {
        //Llamamos a los metodos
        Movil movil = service.cargarCelular();
        service.mostrarmovil(movil);    
        }
    }
}
