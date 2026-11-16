import java.util.Scanner;

/**
 * Versión funcional por consola de la máquina de café.
 */
public class Main {

    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(new Cafetera(50));
        maquina.setVasosPequeno(new Vaso(5, 3));  // 3 Oz
        maquina.setVasosMediano(new Vaso(5, 5));  // 5 Oz
        maquina.setVasosGrande(new Vaso(5, 7));   // 7 Oz
        maquina.setAzucarero(new Azucarero(20));

        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println();
            System.out.println("===== MAQUINA DE CAFE =====");
            System.out.println("Cafe: " + maquina.getCafetera().getCantidadCafe() + " Oz | "
                    + "Azucar: " + maquina.getAzucarero().getCantidadAzucar() + " cdas | "
                    + "Vasos P/M/G: " + maquina.getVasosPequeno().getCantidadVasos() + "/"
                    + maquina.getVasosMediano().getCantidadVasos() + "/"
                    + maquina.getVasosGrande().getCantidadVasos());
            System.out.println("1) Pequeno (3 Oz)");
            System.out.println("2) Mediano (5 Oz)");
            System.out.println("3) Grande  (7 Oz)");
            System.out.println("0) Salir");
            System.out.print("Seleccione el tamano del vaso: ");

            String opcion = sc.nextLine().trim();
            String tipo;
            switch (opcion) {
                case "1": tipo = "pequeno"; break;
                case "2": tipo = "mediano"; break;
                case "3": tipo = "grande"; break;
                case "0": seguir = false; continue;
                default:
                    System.out.println("Opcion no valida.");
                    continue;
            }

            System.out.print("Cucharadas de azucar: ");
            int azucar;
            try {
                azucar = Integer.parseInt(sc.nextLine().trim());
                if (azucar < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Cantidad no valida.");
                continue;
            }

            Vaso vaso = maquina.getTipoDeVaso(tipo);
            String resultado = maquina.getVasoDeCafe(vaso, 1, azucar);
            System.out.println(">> " + resultado);
            if ("Felicitaciones".equals(resultado)) {
                System.out.println(">> Recoja su vaso de cafe.");
            }
        }

        System.out.println("Gracias por usar la maquina de cafe.");
    }
}
