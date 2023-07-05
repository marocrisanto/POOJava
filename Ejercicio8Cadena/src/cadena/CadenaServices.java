
package cadena;

import java.util.Scanner;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras
separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud de manera automática
según la longitud de la frase ingresada. 

Deberá además implementar los siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
       Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
       se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
       frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada
       por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
       por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
       verdadero si la contiene y falso si no.
*/
public class CadenaServices {
    Scanner leer = new Scanner(System.in);
// a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
        public void mostrarVocales(Cadena cadena){
            int contVocales = 0;
            String frase = cadena.getFrase().toLowerCase();
            for (int i = 0; i < frase.length(); i++) {
                //Asignamos el caracter que se encuentra en la posicion i del string frase
                char caracter =  frase.charAt(i);
                if (caracter == 'a'||caracter == 'e'|| caracter == 'i'||caracter == 'o'||caracter == 'u') {
                    contVocales ++;
                }
            }
            System.out.println("La cantidad de vocales es: "+contVocales); 
        }
    
// b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
//    Entrada: "casa blanca", Salida: "acnalb asac".
        public void invertirFrase(Cadena cadena){
            String frase = cadena.getFrase();
            String fraseInvertida = "";
                for (int i = frase.length() - 1; i >= 0; i--) {
                char caracter = frase.charAt(i);
            fraseInvertida = fraseInvertida + caracter;
          }
            System.out.println("La frase invertida es: "+fraseInvertida);
        }
        
        /*
        sino podemos utilizar un StringBuilder
        //StringBuilder: Esta es una clase en Java que se utiliza para crear y manipular cadenas de texto.
        //new StringBuilder(cadena.getFrase()): Esta línea crea un nuevo objeto StringBuilder a partir de la cadena de 
        //texto que contiene la variable "cadena". Usamos cadena.getFrase() para obtener la cadena de texto que 
        //queremos invertir.
        //    StringBuilder invertida = new StringBuilder(cadena.getFrase()).reverse();
        //reverse(): Este método de la clase StringBuilder se utiliza para invertir el orden de los caracteres
        //en el StringBuilder. Lo usamos justo después de crear el nuevo StringBuilder para invertir inmediatamente
        //la cadena de texto.    
        //    return invertida.toString();
        // Después de invertir la cadena de texto, necesitamos convertir el objeto StringBuilder de nuevo a un objeto 
        //String, ya que eso es lo que queremos devolver. Usamos el método toString() para hacer esta conversión. 
        */
        
// c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
//    se repite el carácter en la frase, por ejemplo:
// d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.        
        public void vecesRepetido(Cadena cadena){
            System.out.println("Ingrese un caracter para contar su repeticion en la frase: ");
            char letra = leer.nextLine().charAt(0);
             int contador = 0;
             String frase = cadena.getFrase();
             for (int i = 0; i < frase.length() ; i++) {
                 if (frase.charAt(i)==letra) {
                     contador++;
                 }
             }
             System.out.println("El caracter "+letra+" se repite "+contador+" veces");
         }

// e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
//    frase ingresada por el usuario.
        public void compararLongitud(Cadena cadena){
            System.out.println("Ingrese una frase para comparar su longitud con la primera frase");
            String nuevaFrase = leer.nextLine();
             if(cadena.getLongitud() == nuevaFrase.length()){
            System.out.println("Las frases tienen la misma longitud");
             } else {
            System.out.println("Las frases tienen distinta longitud");
             }
           } 
        
                
// f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada
//    por el usuario y mostrar la frase resultante.
        public void unirFrases(Cadena cadena){
        System.out.println("Ingrese una nueva frase para unirla con la frase original: ");
        String nuevaFrase = leer.nextLine();
        String fraseUnida = cadena.getFrase() + " " + nuevaFrase;
        System.out.println("La frase unida es: " + fraseUnida);
    }
// g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
//    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
        public void reemplazar(Cadena cadena){
        System.out.println("Ingrese la letra que desea reemplazar: ");
        char oldChar = leer.nextLine().charAt(0);
        System.out.println("Ingrese la letra por la cual desea reemplazar: ");
        char newChar = leer.nextLine().charAt(0);
        String primeraFrase = cadena.getFrase();
        String fraseReemplazada = primeraFrase.replace(oldChar, newChar);
        System.out.println("La frase con el reemplazo es: " + fraseReemplazada);
}

// h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
//    verdadero si la contiene y falso si no.
       public void contiene(Cadena cadena){
           Scanner leer = new Scanner(System.in);
           //Solicitamos los datos al usuario y los guardamos
           System.out.println("Ingrese una letra para verificar si la frase contiene la letra: "); 
           char letraBuscada = leer.nextLine().charAt(0);
           if(cadena.getFrase().contains(String.valueOf(letraBuscada))){
            System.out.println("La frase contiene la letra: " + letraBuscada);
           } else {
            System.out.println("La frase no contiene la letra: " + letraBuscada);
        }
    }
}