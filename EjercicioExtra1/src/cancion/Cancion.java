
package cancion;

/**
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
public class Cancion {
    
    //Atributos
    private String titulo, autor;
    
    //Constructor vacio
    public Cancion() {
    }
    
    
    //Constructor con todos los atributos pasados como parametro
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
