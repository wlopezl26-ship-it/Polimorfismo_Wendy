package ejercicios;

public class Cuenta {
    protected double saldo; // se usa protected para que la clase hija pueda modificar el saldo

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Depositado: Q" + monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}
