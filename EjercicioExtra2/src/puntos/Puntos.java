
package puntos;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe 
entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte 
el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html 

Nota: la fórmula para calcular la distancia entre dos puntos (x1, y1) y (x2, y2) 
es la raíz cuadrada de ((x2-x1)² + (y2-y1)²), que es básicamente el teorema de Pitágoras.
*/
public class Puntos {
    //Atributos
    private double x1, y1, x2, y2;
    
    //Constructor vacio
    public Puntos() {
    }
    
    //Constructor con todos los atributos pasados por parametro
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Metodos getters y setters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
    
    
}
