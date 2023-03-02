public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 4.4f;

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5) {
            System.out.println("Regular, necesitas un poco mas de esfuerzo");
        } else if (promedio >= 4) {
            System.out.println("Insuficiente, necesitas estudiar mas");
        } else {
            System.out.println("Reprobado");
        }
        System.out.println("promedio = " + promedio);
    }
}
