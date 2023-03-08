public class PasarPorValor {
    public static void main(String[] args) {

        // Las clases Wrapper son inmutables, por lo tanto cuando modificamos un valor creamos otra instancia y el valor original se conserva.
        int i = 10;

        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finalizamos el método main con i = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
