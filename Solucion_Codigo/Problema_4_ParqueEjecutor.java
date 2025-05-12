import java.util.Scanner;

public class Problema_4_ParqueEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de visitantes: ");
        int n = sc.nextInt();
        sc.nextLine();

        Problema_4_VisitanteBase[] visitantes = new Problema_4_VisitanteBase[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Visitante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            visitantes[i] = new Problema_4_VisitanteBase(nombre, edad, altura);
        }

        Problema_4_ParqueBase parque = new Problema_4_ParqueBase(visitantes);
        parque.verificarAccesos();

        System.out.println("\n--- Resultados ---");
        System.out.println(parque.resumen());

        sc.close();
    }
}
