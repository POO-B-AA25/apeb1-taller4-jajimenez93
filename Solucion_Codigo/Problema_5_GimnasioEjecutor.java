import java.util.Scanner;

public class Problema_5_GimnasioEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Problema_5_GimnasioBase gimnasio = new Problema_5_GimnasioBase(10);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el tipo de ejercicio (cardio, fuerza, estiramiento): ");
            String tipoEjercicio = sc.nextLine();

            System.out.print("Ingrese la duración del ejercicio en minutos: ");
            double duracion = sc.nextDouble();

            System.out.print("¿Completó su rutina? (true/false): ");
            boolean completado = sc.nextBoolean();
            sc.nextLine();  

            gimnasio.registrarCliente(nombre, tipoEjercicio, duracion, completado);
        }

        gimnasio.calcularEstadisticas();

        gimnasio.mostrarResumen();
    }
}
