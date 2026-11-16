/**
 * Depósito de azúcar de la máquina (en cucharadas).
 */
public class Azucarero {

    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadDeAzucar;
    }

    /** Verdadero si hay suficientes cucharadas de azúcar. */
    public boolean hasAzucar(int cantidadDeAzucar) {
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }

    /** Resta las cucharadas de azúcar servidas. */
    public void giveAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar -= cantidadDeAzucar;
    }
}
