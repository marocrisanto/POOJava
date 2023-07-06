
package cancionmain;

import cancion.Cancion;
import cancion.CancionService;

/**
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
public class CancionMain {
    
    public static void main(String[] args) {
        
        //Instanciamos la clase Cancion
        Cancion cancion = new Cancion("Fly to the moon","Frank sinatra");
        
        //Instanciamos la clase CancionService para crear el servicio
        CancionService service = new CancionService();
          
        //Invocamos el metodo 
        service.solicitarDatosCancion(cancion);
        service.imprimirCancion(cancion);   
    }
    
}
