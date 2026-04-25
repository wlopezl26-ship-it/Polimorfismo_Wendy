package ejercicios;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres = 0.05; // 5% de interés 

    public CuentaAhorro(double saldoInicial) {
        super(saldoInicial); 
    }

    @Override
    public void depositar(double monto) {
        double interes = monto * tasaInteres;
        double montoTotal = monto + interes;
        
     
        saldo = saldo + montoTotal;
        
        System.out.println("Depositado (con interés de Q" + interes + "): Q" + montoTotal);
    }
}
