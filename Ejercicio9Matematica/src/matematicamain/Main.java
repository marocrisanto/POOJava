/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicamain;

import ejercicio9matematica.Matematica;
import ejercicio9matematica.MatematicaServices;

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
public class Main {

   
    public static void main(String[] args) {
    //Instanciamos la clase Matematica
    Matematica num = new Matematica();//Este objeto es para almacenar los dos numeros con los que se realizan operaciones
    
    //Creamos una nueva instancia del objeto MatematicaServices. Este objeto contiene los
    //métodos que realizan las operaciones matemáticas y manipulan el objeto Matematica.
    MatematicaServices services = new MatematicaServices();//Creamos un servicio
        
    //Llamamos al método solicitarNumeros() de la clase MatematicaServices. Este método
    //pide al usuario que introduzca dos números y los guarda en el objeto num.
    services.solicitarNumeros(num);
    //Llama al método imprimirResultados() de la clase MatematicaServices. Este método muestra los resultados por pantalla.
    services.imprimirResultados(num);   
    }
}
