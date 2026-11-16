/**
 * Representa un tipo de vaso (pequeño, mediano o grande).
 * cantidadVasos: cuántos vasos de este tipo quedan en la máquina.
 * contenido: onzas de café que lleva cada vaso.
 */
public class Vaso {

    private int cantidadVasos;
    private int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    /** Verdadero si hay al menos la cantidad de vasos pedida. */
    public boolean hasVasos(int cantidadVasos) {
        return this.cantidadVasos >= cantidadVasos;
    }

    /** Resta la cantidad de vasos entregados. */
    public void giveVasos(int cantidadVasos) {
        this.cantidadVasos -= cantidadVasos;
    }
}
