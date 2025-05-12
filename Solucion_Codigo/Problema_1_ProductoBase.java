public class Problema_1_ProductoBase {
    private double precio;
    private int cantidad;

    public Problema_1_ProductoBase(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return precio * cantidad * 0.10;
        } else if (precio < 1000) {
            return precio * cantidad * 0.05;
        }
        return 0;
    }

    public double calcularPrecioFinal() {
        return (precio * cantidad) - calcularDescuento();
    }

    public String toString() {
        return "Precio unitario: $" + precio +
               "\nCantidad: " + cantidad +
               "\nDescuento aplicado: $" + calcularDescuento() +
               "\nTotal a pagar: $" + calcularPrecioFinal();
    }
}
