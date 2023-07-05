
package ejercicio9matematica;

import java.util.Scanner;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
   Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
   Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class MatematicaServices {
    Scanner leer = new Scanner(System.in);
    
    public void solicitarNumeros(Matematica num ){
        System.out.println("Ingrese el primer numero:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double numero2 = leer.nextDouble();
        
        num.setNum1(numero1);
        num.setNum2(numero2);
    }
    // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matematica num){
        if (num.getNum1()  > num.getNum2()) {
            return num.getNum1();    
       }else{
        return num.getNum2();
        }
    }
    // b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
    //      Previamente se deben redondear ambos valores.
    public double calcularPotencia(Matematica num){
        // Obtenemos los dos números del objeto matematica
        double numero1  = num.getNum1();
        double numero2 = num.getNum2();
        // Determinamos el numero mayor usando el metodo anterior devolverMayor()
        double numMayor = devolverMayor(num);
        // Redondeamos el número mayor a un número entero más cercano
        numMayor = Math.round(numMayor);
        // Usamos Math.min() para determinar el número más pequeño
        double numMenor = Math.min(numero2, numero1);
        // Redondeamos el número menor a un número entero más cercano
        numMenor = Math.round(numMenor);
        // Calculamos la potencia del número mayor elevado al número menor
        double potencia = Math.pow(numMayor, numMenor);
        return potencia;
    }
    
    // c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calculaRaiz(Matematica num){
       // Obtenemos los dos números del objeto matematica
       double numero1 = num.getNum1();
       double numero2 = num.getNum2();
       // Usamos Math.min() para determinar el número más pequeño
       double numMenor = Math.min(numero1, numero2);
       // Obtenemos el valor absoluto del número más pequeño
       numMenor = Math.abs(numMenor);
       // Calculamos la raiz cuadrada del numero menor de los dos valores
       double raiz = Math.sqrt(numMenor);
       return raiz;
    }
    
    public void imprimirResultados(Matematica num){
        System.out.println("El numero mayor es: "+devolverMayor(num));
        System.out.println("La potencia del mayor valor de la clase elevado al numero numero es: "+calcularPotencia(num));
        System.out.println("La raiz cuadrada del valor absoluto del menor numero es: "+calculaRaiz(num));
    }
    
    
    
}
