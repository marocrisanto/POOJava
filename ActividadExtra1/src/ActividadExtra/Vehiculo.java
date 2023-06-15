
package ActividadExtra;
/*
Crear una clase "Vehículo" con atributos como "marca","modelo","año" y "tipo" (En tipo, vamos a indicar si es un automóvil, 
una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:

 -Moverse: Es la cantidad de metros que avanzará por segundo.
 -Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará más metros.
Referencias:
 -Un automóvil avanza 3 metros por segundo.
 -Una motocicleta avanza 2 metros por segundo.
 -Una bicicleta avanza 1 metro por segundo.

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.

*/
public class Vehiculo {
    
    //Atributos privados
    private String marca, modelo, tipo;
    private int año;    
    
    //Constructor vacio
    public Vehiculo() {
    }
    
    // Método constructor que inicializa el radio pasado como parametro

    public Vehiculo(String marca, String modelo, String tipo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
    }
    
    // Métodos get y set
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;    
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método constructor Moverse: Es la cantidad de metros que avanzará por segundo.
    public int Moverse(int segundos) {
       switch(tipo.toLowerCase()){
            case "automovil":
                return segundos*3;
            case "motocicleta":
                return segundos*2;
            case "bicicleta":
                return segundos*1;
            default:
                return 0;
        }
    }
    
    // Método constructor Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, 
    //se frenará y no avanzará más metros.
    public int Frenar() {
        switch(tipo.toLowerCase()){
            case "automovil":
            case "motocicleta":
            case "bicicleta":
                return 0;
            default:
                return 0;
        }
    }
    
}