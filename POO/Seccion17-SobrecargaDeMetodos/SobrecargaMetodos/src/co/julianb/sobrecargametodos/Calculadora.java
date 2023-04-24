package co.julianb.sobrecargametodos;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    //Sintaxis para pasar multiples/N Variable argumentos a un método.
    // Nota: todos deben ser del mismo tipo.
    public static int sumar(int... argumentos) {
        int suma = 0;
        for (int i : argumentos
        ) {
            suma += i;
        }
        return suma;
    }

    public static float sumar(float a, int... argumentos) {
        float suma = a;
        for (int numero : argumentos
        ) {
            suma += numero;
        }
        return suma;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }
}
