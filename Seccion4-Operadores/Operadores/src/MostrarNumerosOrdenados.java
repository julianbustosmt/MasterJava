import java.util.Scanner;

public class MostrarNumerosOrdenados {

    public static void main(String[] args) {

        // Pedir dos números y mostrarlos ordenados de mayor a menor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double primerNumero = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        /*if (primerNumero > segundoNumero){
            System.out.println(primerNumero + ", " + segundoNumero);
        }else if (primerNumero < segundoNumero){
            System.out.println(segundoNumero + "," + primerNumero);
        }else {
            System.out.println("Ambos numero son iguales");
        }*/

        String resultado = primerNumero > segundoNumero ? primerNumero + ", " + segundoNumero : segundoNumero + ", " + primerNumero;
        System.out.println("El orden es: " + resultado);

    }
}
