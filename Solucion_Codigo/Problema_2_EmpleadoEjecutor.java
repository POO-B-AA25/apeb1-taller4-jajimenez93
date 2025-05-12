import java.util.Scanner;

public class Problema_2_EmpleadoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int n = sc.nextInt();
        sc.nextLine();

        Problema_2_EmpleadoBase[] empleados = new Problema_2_EmpleadoBase[n];
        double sumaSalarios = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            empleados[i] = new Problema_2_EmpleadoBase(nombre, salario, edad);
            sumaSalarios += salario;
        }

        double salarioPromedio = sumaSalarios / n;

        System.out.print("Ingrese porcentaje de aumento para quienes ganan menos del promedio: ");
        double porcentaje = sc.nextDouble();

        System.out.println("\n--- Información de Empleados ---");
        for (int i = 0; i < n; i++) {
            if (empleados[i].getSalario() < salarioPromedio) {
                empleados[i].aplicarAumento(porcentaje);
            }
            System.out.println(empleados[i].mostrarInformacion());
        }

    }
}
