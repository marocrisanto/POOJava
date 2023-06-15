
package LibrosMain;

import Libros.Libro;
import Libros.LibroService;


public class Main {
    
    public static void main(String[]args){
        
        //Instanciamos la clase Libro
        Libro libroaInformar = new Libro();//Creamos u libro vacio
        LibroService servicio = new LibroService();//Creamos un servicio
        
        //Cargamos el libro con el servicio y lo imprimimos
        libroaInformar = servicio.crearLibro();
        servicio.imprimirLibro(libroaInformar);
    }
}
