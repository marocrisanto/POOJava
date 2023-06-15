

package circunferenciamain;

import ejercicio2circunferencia.Circunferencia;
import ejercicio2circunferencia.CircunferenciaService;




public class Main {
    public static void main(String[]args){
        
        //Instanciamos la clase Libro
        Circunferencia mostrarCircunferencia = new Circunferencia();//Creamos un objeto vacio
        CircunferenciaService servicio = new CircunferenciaService();//Creamos un servicio
        
        //Cargamos el objeto con el servicio y lo imprimimos
        mostrarCircunferencia = servicio.crearCircunferencia();
        servicio.mostrarArea(mostrarCircunferencia);
        servicio.mostrarPerimetro(mostrarCircunferencia);
    }
}