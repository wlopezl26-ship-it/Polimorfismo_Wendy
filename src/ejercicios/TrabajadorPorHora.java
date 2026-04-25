package ejercicios;

public class TrabajadorPorHora extends Trabajador {
    private int horasTrabajadas;
    private double pagoPorHora;

    public TrabajadorPorHora(int horas, double pago) {
        this.horasTrabajadas = horas;
        this.pagoPorHora = pago;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }
}