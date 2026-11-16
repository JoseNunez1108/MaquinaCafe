/**
 * Máquina dispensadora de café.
 * Coordina los vasos, la cafetera y el azucarero siguiendo
 * el diagrama de secuencia: primero vasos, luego café, luego azúcar.
 */
public class MaquinaDeCafe {

    // Sin modificador (visibilidad de paquete) porque las pruebas
    // acceden directamente a maquinaDeCafe.vasosPequeno, etc.
    Cafetera cafe;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucar;

    public void setCafetera(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Cafetera getCafetera() {
        return cafe;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucar) {
        this.azucar = azucar;
    }

    public Azucarero getAzucarero() {
        return azucar;
    }

    /** Devuelve el tipo de vaso según el texto: "pequeno", "mediano" o "grande". */
    public Vaso getTipoDeVaso(String tipoDeVaso) {
        if ("pequeno".equalsIgnoreCase(tipoDeVaso)) {
            return vasosPequeno;
        } else if ("mediano".equalsIgnoreCase(tipoDeVaso)) {
            return vasosMediano;
        } else if ("grande".equalsIgnoreCase(tipoDeVaso)) {
            return vasosGrande;
        }
        return null;
    }

    /**
     * Prepara el pedido.
     * @param vaso              tipo de vaso elegido
     * @param cantidadDeVasos   cuántos vasos se piden
     * @param cantidadDeAzucar  cucharadas de azúcar
     * @return "No hay Vasos", "No hay Cafe", "No hay Azucar" o "Felicitaciones"
     */
    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        int cafeNecesario = vaso.getContenido() * cantidadDeVasos;

        if (!vaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        if (!cafe.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }
        if (!azucar.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadDeVasos);
        cafe.giveCafe(cafeNecesario);
        azucar.giveAzucar(cantidadDeAzucar);

        return "Felicitaciones";
    }
}
