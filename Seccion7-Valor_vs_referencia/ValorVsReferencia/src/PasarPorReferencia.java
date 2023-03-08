public class PasarPorReferencia {
    public static void main(String[] args) {

        // Los arreglos no son inmutables, por lo tanto cuando modificamos un valor también modificamos el original, ya que hacemos el llamado a su referencia en memoria.
        int[] edades = {10, 11, 12};

        System.out.println("Iniciamos el método main");

        for (int edad : edades
        ) {
            System.out.println("edad = " + edad);
        }

        System.out.println("Antes de llamar al método test");

        test(edades);
        for (int edad : edades
        ) {
            System.out.println("edad = " + edad);
        }

        System.out.println("Finalizamos el método main con los datos del arreglo modificados");
    }

    public static void test(int[] edades) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edades.length; i++) {
            edades[i] += 20;
        }
        System.out.println("Finaliza el método test");
    }
}
