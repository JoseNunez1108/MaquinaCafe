/**
 * Depósito de café de la máquina (en onzas).
 */
public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    /** Verdadero si hay suficiente café para la cantidad pedida. */
    public boolean hasCafe(int cantidadCafe) {
        return this.cantidadCafe >= cantidadCafe;
    }

    /** Resta el café servido. */
    public void giveCafe(int cantidadCafe) {
        this.cantidadCafe -= cantidadCafe;
    }
}
