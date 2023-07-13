package co.julianb.interfaces.imprenta.modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    /** Si no deseamos que todas las clases que implementen la interfaz tengan que implementar
     * un método en específico, le agregamos el modificador default y le añadimos un cuerpo.
     */
    default String imprimir() {
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
