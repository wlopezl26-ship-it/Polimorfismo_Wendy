package ejercicios;

public class Main {

	public static void main(String[] args)	{
		Animal mascota = new Perro();
		mascota.hacerSonido();
	}
		
	
	Figura miFigura = new Rectangulo(10.5, 5.0);{
    System.out.println("El área calculada es: " + miFigura.area());

}	
	
	Empleado miEmpleado = new Vendedor("Wendy", 1500.50);{
    miEmpleado.resumen();
}

	Cuenta miCuenta = new CuentaAhorro(1000.0);{
    
    miCuenta.depositar(100.0);
    miCuenta.mostrarSaldo();
}
	
	Transporte miVehiculo = new Avion();{
    miVehiculo.moverse();
}
	Persona alguien = new Estudiante("Wendy", "2024-001", "Ingeniería en Sistemas");{
    alguien.presentarse();
}

	Vehiculo miMoto = new Motocicleta();{
    miMoto.encender();
}

	
	
}




