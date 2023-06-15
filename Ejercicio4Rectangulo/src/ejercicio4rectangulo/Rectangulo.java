/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4rectangulo;

public class Rectangulo {
    //Atributos
    private double base , altura;
    
    // Metodo constructor sin los atributos pasados por parámetro.
    public Rectangulo() {
    }
    
   // Método constructor con todos los atributos pasados por parámetro.
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos get y set.
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para calcular la superficie del rectángulo 
    // Superficie = base * altura.
    public double calcularSuperfice() {
        return base * altura;
    }
    
    // Método para calcular el perímetro del rectángulo.
    // Perímetro = (base + altura) * 2
    public double calcularPerimetro() {
        return (base + altura)*2;
    }
    
    //Método que dibuja el rectángulo mediante asteriscos usando la base y la altura.
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                    if (i==0 || i==altura-1 || j==0 || j==base-1) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
}

