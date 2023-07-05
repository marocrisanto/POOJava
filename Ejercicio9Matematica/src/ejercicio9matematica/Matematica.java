/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9matematica;
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
public class Matematica {
    
    //Atributos
    private double num1;
    private double num2;
    // Metodo constructor sin los atributos pasados por parámetro.
    public Matematica() {
    }
    
    // Método constructor con todos los atributos pasados por parámetro.
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    // Métodos getters y setters de cada atributo.
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
 
    
    
}
