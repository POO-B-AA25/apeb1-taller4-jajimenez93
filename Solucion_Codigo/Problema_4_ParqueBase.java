public class Problema_4_ParqueBase {
    private Problema_4_VisitanteBase[] visitantes;
    private boolean[] acceso;

    public Problema_4_ParqueBase(Problema_4_VisitanteBase[] visitantes) {
        this.visitantes = visitantes;
        this.acceso = new boolean[visitantes.length];
    }

    public void verificarAccesos() {
        for (int i = 0; i < visitantes.length; i++) {
            int edad = visitantes[i].getEdad();
            double altura = visitantes[i].getAltura();
            acceso[i] = (edad >= 12 && altura >= 1.4);
        }
    }

    public String resumen() {
        int totalPermitidos = 0;
        String resultado = "";
        for (int i = 0; i < visitantes.length; i++) {
            resultado += visitantes[i] + "\n";
            resultado += "Acceso a juegos: " + (acceso[i] ? "Permitido" : "No permitido") + "\n\n";
            if (acceso[i]) {
                totalPermitidos++;
            }
        }
        resultado += "Total que cumplen requisitos: " + totalPermitidos;
        return resultado;
    }
}
