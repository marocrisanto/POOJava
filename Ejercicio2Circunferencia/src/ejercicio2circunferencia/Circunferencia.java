/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2circunferencia;
/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

public class Circunferencia {
  
    //Atributo privado
    private double radio;
    
    //Constructor vacio
    public Circunferencia() {
    }
    
    // a) Método constructor que inicializa el radio pasado como parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
     // a) Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // c) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    // d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}