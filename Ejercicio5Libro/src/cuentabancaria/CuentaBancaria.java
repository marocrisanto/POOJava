
package cuentabancaria;
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
public class CuentaBancaria {
    //Atributos
    private int numeroCuenta;
    private long DniCliente;
    private int saldo;
    
    // a) Metodo constructor sin los atributos pasados por parámetro.
    public CuentaBancaria() {
    }
    
   // a) Método constructor con todos los atributos pasados por parámetro.
    public CuentaBancaria(int numeroCuenta, long DniCliente, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DniCliente = DniCliente;
        this.saldo = saldo;
    }
    
    // b) Métodos get y set.
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(long DniCliente) {
        this.DniCliente = DniCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public void ingresar(double ingreso) {
        this.saldo = (int) (ingreso + saldo);
    }
    
    
    // e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual.
    // Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
    public void retirar(double retiro) {
        if (this.saldo < retiro) {
            this.saldo = 0;
        }else {
            this.saldo -= retiro;
        }
    }
    
    // f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(double cantidad) {
        double cantidadPermitida = this.saldo*0.20;
        if (cantidad > cantidadPermitida ) {
            System.out.println("La cantidad que solicita excede el 20% de su saldo. Operación no permitida");
        }else {
            this.saldo = (int) (saldo - cantidad);
        }
    }
    // g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public double consultarSaldo() {
       return this.saldo;
    }
    // h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("El numero de cuenta es: "+numeroCuenta);
        System.out.println("El DNI del cliente es: "+DniCliente);
        System.out.println("El saldo de la cuenta es: "+saldo);
    }

}
    