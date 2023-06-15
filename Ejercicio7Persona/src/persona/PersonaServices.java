package persona;

import java.util.Scanner;

/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. 
Los métodos que se implementarán son:
- Un constructor por defecto.
- Un constructor con todos los atributos como parámetro.
- Métodos getters y setters de cada atributo.
- Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan 
a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor 
mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal,tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, 
para después en el main, calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad 
y cuantos menores
*/
public class PersonaServices {
    private int numeroPersonas;

    public int getNumeroPersonas() {
        return numeroPersonas;
    }
    
    
    
    //Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después 
    //se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    //Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    public Persona[] crearPersona(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos
        String nombre;
        char sexo;
        int edad;
        double peso, altura;
        
        
        System.out.println("Ingrese el numero de personas");
        numeroPersonas = leer.nextInt();
        Persona[] listaPersonas = new Persona[numeroPersonas];
        leer.nextLine(); //Consume el salto de línea que quedó después del nextInt()
        //Utilizamos un bucle para llenar la informacion de las personas
        for (int i = 0; i < numeroPersonas; i++) {
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona( H, M)");
        sexo = leer.next().charAt(0);
        System.out.println("Ingrese el peso de la persona(kg)");
        peso= leer.nextDouble();
        System.out.println("Ingrese la altura de la persona (en metros)");
        altura = leer.nextDouble();
        leer.nextLine(); //Consume el salto de línea que quedó después del nextDouble()
        //Se crean personas y se guardan en la lista
        listaPersonas[i] = new Persona(nombre, sexo, edad, peso, altura);
        }
        //Regresamos la lista de Personas creadas
        return listaPersonas;
    }
    
    public void calcularEImprimirIMC(Persona[] listaPersonas ){
        //Creamos el arreglo de resultado IMC para guardar los resultados
        int[] resultadoIMC = new int[listaPersonas.length];
        boolean[] esMayorDeEdad = new boolean[listaPersonas.length];
        //Creamos un bucle para que recorrar el arreglo y guarde el IMC de cada persona y si es mayor de edad
        for (int i = 0; i < listaPersonas.length; i++) {
          resultadoIMC[i] = listaPersonas[i].calcularIMC();  
          esMayorDeEdad[i] = listaPersonas[i].esMayorDeEdad();
        }
        
        //Creamos 4 contadores para contar cuantas personas estan en su peso
        int pesoBajo  = 0;//inicializados en cero
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int mayorEdad = 0;
        
        //Utilizamos un bucle para recorrer el arreglo comprobando el IMC y aumentar el contador de cada uno
        for (int i = 0; i < resultadoIMC.length; i++) {
            if (resultadoIMC[i] == -1) {
                pesoBajo ++;
            } else if (resultadoIMC[i] == 0) {
                pesoIdeal ++;
            } else {
                sobrePeso ++;
            } if (esMayorDeEdad[i]) {
                mayorEdad++;
            }
        }
        System.out.println("El porcentaje de personas en bajo peso es: "+(pesoBajo/4.0*100+"%"));
        System.out.println("El porcentaje de personas en peso ideal es: "+(pesoIdeal/4.0*100+"%"));
        System.out.println("El porcentaje de personas en sobre peso es: "+(sobrePeso/4.0*100+"%"));
        System.out.println("El porcentaje de personas mayores de edad es: "+(mayorEdad/4.0*100+"%"));
    }  
}
