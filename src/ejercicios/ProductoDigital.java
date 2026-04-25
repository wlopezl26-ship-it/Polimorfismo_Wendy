package ejercicios;

public class ProductoDigital extends Producto {
    private String enlaceDescarga;

    public ProductoDigital(String nombre, double precio, String enlaceDescarga) {
        super(nombre, precio);
        this.enlaceDescarga = enlaceDescarga;
    }

    @Override
    public void mostrarDescripcion() {
        super.mostrarDescripcion(); // Llamamos al método del padre para no repetir código
        System.out.println("Tipo: Digital | Enlace: " + enlaceDescarga);
    }
}