public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal trigo trigo";

        String palabra = "trigo";
        char letra = 'g';

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i += maxPalabra;
        }
        System.out.println("Encontrado  = " + cantidad + " veces la palabra " + palabra + " en la frase.");
    }
}
