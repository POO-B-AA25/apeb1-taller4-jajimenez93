import java.util.Scanner;

public class Problema_3_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Problema_3_EstudianteBase[] estudiantes = new Problema_3_EstudianteBase[n];
        int aceptados = 0, rechazados = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Grado: ");
            String grado = sc.nextLine();
            System.out.print("¿Tiene permiso vigente? (true/false): ");
            boolean permiso = sc.nextBoolean();
            sc.nextLine();

            estudiantes[i] = new Problema_3_EstudianteBase(nombre, grado, permiso);
        }

        System.out.println("\n--- Verificación de ingreso ---");
        for (int i = 0; i < n; i++) {
            System.out.println(estudiantes[i]);
            if (estudiantes[i].puedeSubir()) {
                System.out.println("Estado: Puede subir al autobús.\n");
                aceptados++;
            } else {
                System.out.println("Estado: No puede subir al autobús.\n");
                rechazados++;
            }
        }

        System.out.println("Total aceptados: " + aceptados);
        System.out.println("Total rechazados: " + rechazados);

    }
}
