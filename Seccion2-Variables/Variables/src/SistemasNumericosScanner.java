import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal =  scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){ // Podemos remplazar la excepción con "Exception" la cual representa o abarca cualquier tipo de excepción.
            System.out.println("Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        };

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String ResultadoHexadecimal = "numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
;

        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += ResultadoHexadecimal;
        System.out.println(mensaje);
    }
}
