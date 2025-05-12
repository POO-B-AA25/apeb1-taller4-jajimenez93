import java.util.Scanner;

public class Problema_1_ProductoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();

        Problema_1_ProductoBase producto = new Problema_1_ProductoBase(precio, cantidad);
        System.out.println("\n--- Resumen de compra ---");
        System.out.println(producto);
    }
}
