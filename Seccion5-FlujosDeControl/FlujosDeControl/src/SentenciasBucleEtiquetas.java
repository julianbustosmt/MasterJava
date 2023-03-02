public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle3:
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i  +" : Descanso fin de semana.");
                    continue bucle3;
                }
                System.out.println("Dia " + i  + ": trabajando " + j + "hrs.");
            }
        }

        System.out.println("\n\n------------------------------------------------------------------------------");

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j  = " + j + "]");
            }
        }

        System.out.println("\n\n------------------------------------------------------------------------------");

        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j  = " + j + "]");
            }
        }

    }
}
