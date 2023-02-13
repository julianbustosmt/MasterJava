import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        // variable = condición ? si es verdadero: si es falso

        String varible = 7 == 7 ? "Si señor" : "No señor";
        System.out.println(varible);

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas (1-10): ");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias (1-10): ");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia (1-10): ");
        historia = scanner.nextDouble();

        double promedio = (matematicas + ciencias + historia) / 3;

        String estado = promedio >= 6 ? "Aprobado" : "Rechazado";;
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}
