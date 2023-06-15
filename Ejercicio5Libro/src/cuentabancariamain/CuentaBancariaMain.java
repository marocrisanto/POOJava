
package cuentabancariamain;

import cuentabancaria.CuentaBancaria;
import cuentabancaria.CuentaBancariaService;
import java.util.Scanner;

/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
public class CuentaBancariaMain {

    public static void main(String[] args) {
        //Instanciamos la clase Operacion
        CuentaBancaria mostrarCuentaBancaria = new CuentaBancaria();//Creamos un objeto vacio
        CuentaBancariaService servicio = new CuentaBancariaService();//Creamos un servicio
        
        Scanner leer = new Scanner(System.in);
        
        //Cargamos el objeto con el servicio y lo imprimimos
        mostrarCuentaBancaria = servicio.crearCuentaBancaria();
        
        System.out.println("Ingrese la cantidad que desea ingresar: ");
        double cantidadIngreso = leer.nextDouble();
        mostrarCuentaBancaria.ingresar(cantidadIngreso);
        System.out.println("El saldo de su cuenta es: "+mostrarCuentaBancaria.consultarSaldo());

        System.out.println("Ingrese la cantidad que desea retirar: ");
        double cantidadRetiro = leer.nextDouble();
        mostrarCuentaBancaria.retirar(cantidadRetiro);
        System.out.println("El saldo de su cuenta es: "+mostrarCuentaBancaria.consultarSaldo());

        System.out.println("Ingrese la cantidad que desea retirar en la extracción rápida: ");
        double cantidadExtraccionRapida = leer.nextDouble();
        mostrarCuentaBancaria.extraccionRapida(cantidadExtraccionRapida);

        System.out.println("Datos de la cuenta: ");
        mostrarCuentaBancaria.consultarDatos();
    }
}
