import java.util.Arrays;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroNombres = 3;

        String[] nombres = new  String[numeroNombres];

        for (int i = 0; i < numeroNombres; i++){
            System.out.println("Ingrese el nombre " + (i+1));
            nombres[i] =  scanner.nextLine();
        }

        System.out.println("nombres = " + Arrays.toString(nombres));

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < nombres.length ; i++) {
            resultado.append(nombres[i].substring(1, 2).toUpperCase()).append(".").append(nombres[i].substring(nombres[i].length() - 2));
            if (i < nombres.length - 1){
                resultado.append("_");
            }
        }

        System.out.println("resultado = " + resultado);

    }
}
