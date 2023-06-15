
package Libros;

//La clase LibroService ofrece servicios para manejar libros

import java.util.Scanner;


public class LibroService {    
    
    //Método para cargar un libro pidiendo los datos del usuario
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos en la variable local
        System.out.println("Ingrese el ISBN del libro");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.nextLine();
        System.out.println("Ingrese el número de paginas del libro");
        int numPaginas = leer.nextInt();
        
       /* Esto es equivalente a usar el constructor vacio
       Libro libro1 = new Libro();
       libro1.setAutor("omar");
       libro1.setISBN("asdasd");
       libro1.setNumPaginas(24);
       libro1.setTitulo("adasas");      
       return libro1;
       */
       //Esta es una manera mas simple de crear y retornar el objeto en una sola linea
       //return new Libro(isbn, titulo, autor, numPaginas); 
       
       /*Aqui estamos creando un nuevo libro y lo retornamos       */
       Libro libro1 = new Libro(isbn, titulo, autor, numPaginas);
       return libro1;
    }
    
    //Metodo para informar los detalles del libro
    public void imprimirLibro(Libro book){
        System.out.println("ISBN: "+book.getISBN());
        System.out.println("Titulo: "+book.getTitulo());
        System.out.println("Autor: "+book.getAutor());
        System.out.println("Paginas: "+book.getNumPaginas());
    }
}

