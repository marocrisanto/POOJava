
package ejercicio13vectores;

import java.util.Scanner;

/**
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, 
cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), 
precioPorHora y alumnos. 
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. 
A continuación, se implementarán los siguientes métodos:
-Un constructor por defecto.
-Un constructor con todos los atributos como parámetro.
-Métodos getters y setters de cada atributo.
-método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.
-Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus
*respectivos atributos para llenar el objeto Curso. En este método invocaremos al método cargarAlumnos() para asignarle 
valor al atributo alumnos
-Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad 
de días a la semana que se repite el encuentro.
 */
public class CursoService {
    Scanner leer = new Scanner(System.in);
    
//-método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
//Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada 
//repetición que se ingrese el nombre de cada alumno.
    
    public void cargarAlumnos(Curso curso){
        //solicitamos el numero de alumnos para el arreglo
        System.out.println("Ingrese el numero de alumnos");
        int numAlumnos = leer.nextInt();
        leer.nextLine();
        String[] alumnos = new String[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");
            alumnos[i] = leer.nextLine();
        }
        curso.setAlumnos(alumnos);
    }
    
//-Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus
//respectivos atributos para llenar el objeto Curso. En este método invocaremos al método cargarAlumnos() para asignarle 
//valor al atributo alumnos
    
    public void crearCurso(Curso curso){
        //Solicitamos al usuario el nombre del curso y lo guardamos
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        curso.setNombreCurso(nombreCurso);
        
        //Solicitamos al usuario la cantidad de horas por dia y lo guardamos
        System.out.println("Ingrese la cantidad de horas por día: ");
        int horasPorDia = leer.nextInt();
        curso.setCantidadHorasPorDia(horasPorDia);
        
        //Solicitamos al usuario la cantidad de dias por semana y lo guardamos
        System.out.println("Ingrese la cantidad de dias por semana: ");
        int diasPorSemana = leer.nextInt();
        curso.setCantidadDiasPorSemana(diasPorSemana);
        
        //Solicitamos al usuario que ingrese el turno y lo guardamos
        System.out.println("Ingrese el turno de su clase (mañana o tarde): ");
        String turno = leer.next();
        curso.setTurno(turno);
        
        //Solicitamos que ingrese el precio por hora de su clase y lo guardamos
        System.out.println("Ingrese el precio por hora de la clase: ");
        double precioPorHora = leer.nextDouble();
        curso.setPrecioPorHora(precioPorHora);
        
        cargarAlumnos(curso);
    }
    
//-Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
//Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad 
//de días a la semana que se repite el encuentro.    
    public double calcularGananciaSemanal(Curso curso){
    return curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*curso.getPrecioPorHora()*curso.getAlumnos().length;
    }
    
    public void mostrarCurso(Curso curso){
        System.out.println("Nombre del curso: "+curso.getNombreCurso());
        System.out.println("Horas por dia: "+curso.getCantidadHorasPorDia());
        System.out.println("Dias por semana: "+curso.getCantidadDiasPorSemana());
        System.out.println("Turno: "+curso.getTurno());
        System.out.println("Precio por hora: "+curso.getPrecioPorHora());
        System.out.println("Alumnos: ");
        for (int i=0; i<curso.getAlumnos().length; i++) {
            System.out.println((i+1)+")"+curso.getAlumnos()[i]);
        }
        System.out.println("Ganancia Semanal: "+calcularGananciaSemanal(curso));
    }
}
