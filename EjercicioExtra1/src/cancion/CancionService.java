
package cancion;

import java.util.Scanner;

/**
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
public class CancionService {
    
    Scanner leer = new Scanner(System.in);
    
    //Este método solicita los datos al usuario
    public Cancion solicitarDatosCancion(Cancion cancion){
            
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor de la cancion: ");
        String autor = leer.nextLine();
        return cancion;
    }
    
    
 
    //Este método imprime la cancion
    public void imprimirCancion(Cancion cancion){
        System.out.println("El titulo de tu cancion es:"+cancion.getTitulo());
        System.out.println("El autor de la cancion es :"+cancion.getAutor());
    }
    
    
    
}
