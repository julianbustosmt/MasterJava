import java.util.Arrays;
import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {

        /*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
        Calcular el menor número e imprimir el valor.

        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir "el número menor es igual o mayor que 10!".*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea registrar: ");
        int cantidad = scanner.nextInt();

        int numeroMenor = Integer.MAX_VALUE;
        int[] numeros = new int[cantidad];


        if (cantidad < 10) {
            System.out.println("La cantidad minima de numeros es 10");
            main(args);
            System.exit(0);

        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el " + (i + 1) + "° numero: ");
                int numero = scanner.nextInt();
                numeroMenor = (numero < numeroMenor) ? numero : numeroMenor;
                numeros[i] = numero;
            }
        }

        System.out.println("Numeros ingresados: " + Arrays.toString(numeros));
        if(numeroMenor < 10){
            System.out.println("\nEl número menor es menor que 10!");
        }else {
            System.out.println("El numero menor es igual o mayor que 10!.");
        }
        System.out.println("El numero menor es: " + numeroMenor);

    }
}
