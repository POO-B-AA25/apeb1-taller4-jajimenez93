public class Problema_4_VisitanteBase {
    private String nombre;
    private int edad;
    private double altura;

    public Problema_4_VisitanteBase(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura + " m";
    }
}
