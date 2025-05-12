public class Problema_2_EmpleadoBase {
    private String nombre;
    private double salario;
    private int edad;

    public Problema_2_EmpleadoBase(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Salario: $" + salario;
    }
}
