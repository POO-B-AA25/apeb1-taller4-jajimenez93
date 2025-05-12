public class Problema_5_GimnasioBase {
    private Problema_5_ClienteBase[] clientes;
    private int totalClientes;
    private int clientesCompletaron;
    private double tiempoTotal;

    public Problema_5_GimnasioBase(int cantidadClientes) {
        clientes = new Problema_5_ClienteBase[cantidadClientes];
        totalClientes = 0;
        clientesCompletaron = 0;
        tiempoTotal = 0;
    }

    public void registrarCliente(String nombre, String tipoEjercicio, double duracion, boolean completado) {
        if (totalClientes < clientes.length) {
            clientes[totalClientes] = new Problema_5_ClienteBase(nombre, tipoEjercicio, duracion, completado);
            totalClientes++;
        }
    }

    public void calcularEstadisticas() {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].isCompletado()) {
                clientesCompletaron++;
            }
            tiempoTotal += clientes[i].getDuracion();
        }
    }

    public void mostrarResumen() {
        System.out.println("\n--- Resumen del gimnasio ---");
        System.out.println("Clientes que completaron su rutina: " + clientesCompletaron);
        if (totalClientes > 0) {
            double promedioTiempo = tiempoTotal / totalClientes;
            System.out.println("Tiempo promedio invertido por cliente: " + promedioTiempo + " minutos");
        }
        System.out.println("\n--- Información de Clientes ---");
        for (int i = 0; i < totalClientes; i++) {
            System.out.println(clientes[i]);
        }
    }
}
