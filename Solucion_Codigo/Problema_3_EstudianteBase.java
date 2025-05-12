public class Problema_3_EstudianteBase {
    private String nombre;
    private String grado;
    private boolean permiso;

    public Problema_3_EstudianteBase(String nombre, String grado, boolean permiso) {
        this.nombre = nombre;
        this.grado = grado;
        this.permiso = permiso;
    }

    public boolean puedeSubir() {
        return permiso;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Grado: " + grado + ", Permiso vigente: " + (permiso ? "Sí" : "No");
    }
}
