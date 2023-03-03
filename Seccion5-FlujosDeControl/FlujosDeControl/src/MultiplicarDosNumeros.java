import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        /* Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

        Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;
        boolean esNegativo = (numero1 < 0 && numero2 >0) || (numero1 > 0 && numero2 < 0);

        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        for (int i = 0; i < numero2 ; i++){
            resultado += numero1;
        }

        if(esNegativo){
            resultado = -resultado;
        }

        System.out.println("resultado = " + resultado);

    }
}

