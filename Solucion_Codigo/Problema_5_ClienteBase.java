public class Problema_5_ClienteBase {
    private String nombre;
    private String tipoEjercicio;
    private double duracion;
    private boolean completado;

    public Problema_5_ClienteBase(String nombre, String tipoEjercicio, double duracion, boolean completado) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.completado = completado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public double getDuracion() {
        return duracion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public String toString() {
        return "Nombre: " + nombre +
               "\nTipo de ejercicio: " + tipoEjercicio +
               "\nDuración: " + duracion + " minutos" +
               "\nCumplió con la rutina: " + (completado ? "Sí" : "No");
    }
}
