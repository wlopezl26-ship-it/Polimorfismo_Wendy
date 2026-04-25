package ejercicios;

public class Empleado {
	protected String nombre; // Se usa protected para que la clase hijo pueda verlo

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void resumen() {
        System.out.println("Empleado: " + nombre);
    }
}

