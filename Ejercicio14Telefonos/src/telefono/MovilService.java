package movil;

import java.util.Scanner;
/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional. 
Para ello, crearemos un programa donde se pueda almacenar cada producto con su información. 
Crear una entidad Movil con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo. 
El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número correspondiente
al código. A continuación, se implementarán los siguientes métodos:
-Un constructor por defecto.
-Un constructor con todos los atributos como parámetro
-Métodos getters y setters de cada atributo.
-Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular 
y poder cargarlo en nuestro programa.
-Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. 
Para ello, puede utilizarse un bucle repetitivo

Nota: Dado que el ejercicio no especifica que haya una impresion y el modo en que se deberia mostrar los datos, 
he optado por modificar el codigo para que se imprima del siguiente modo:

marca:            samsung       xiaomi   motorola
ram:                12            12        8
almacenamiento:     256           256       128
precio:             10000        10000      8000
codigo:            1287878     89182938    565675

de este modo al imprimir se puede verificar que se han guardado los datos y se ve claramente cada producto 
que posee el sistema


*/
public class MovilService {
    Scanner leer = new Scanner(System.in);
    

    //Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular 
    //y poder cargarlo en nuestro programa.
    public Movil cargarCelular(){
            
        System.out.println("Ingrese la marca del telefono: ");  
        String marca = leer.nextLine();
            
        System.out.println("Ingrese el precio del telefono: ");
        double precio = leer.nextDouble();

        System.out.println("Ingrese el modelo del telefono: ");
        String modelo = leer.nextLine();
        leer.nextLine();
            
        System.out.println("Ingrese la memoria Ram del telefono(en gigabytes): ");
        int memoriaRam = leer.nextInt();


        System.out.println("Ingrese el almacenamiento del telefono (en gigabytes): ");
        int almacenamiento = leer.nextInt(); 
            
        int[] codigo = ingresarCodigo();
        
        //Instanciamos la clase Movil y creamos el objeto vacio
        Movil movil = new Movil(marca, modelo, precio, memoriaRam, almacenamiento, codigo);
        
        return movil;
            
}   
   
   //Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. 
   //Para ello, puede utilizarse un bucle repetitivo
    public int[] ingresarCodigo(){
        int[] codigo = new int[7];
        for (int i = 0; i <codigo.length ; i++) {
            System.out.println("Ingrese el codigo del movil de 7 digitos");
            codigo[i] = leer.nextInt();

        }
        return codigo;
    }
       
   public void mostrarmovil(Movil movil){     
       System.out.println("La marca del movil es: "+movil.getMarca());
       System.out.println("El modelo del movil es: "+movil.getModelo());
       System.out.println("El precio del movil es: "+movil.getPrecio());
       System.out.println("La memoria Ram del movil es: "+movil.getMemoriaRam()+"Gigas");
       System.out.println("El almacenamiento del movil es: "+movil.getAlmacenamiento()+"Gigas");
       System.out.println("El codigo del movil es: ");
       for (int i = 0; i < movil.getCodigo().length ; i++) {
           System.out.print(movil.getCodigo()[i]+"");
       }
       System.out.println();
   }
        
}
    