public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 15};

        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Pepa"};

        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
