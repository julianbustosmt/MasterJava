import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        /*Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.*/

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        System.out.println("Ingrese la fecha de su nacimiento (MM-dd-yyyy): ");

        try {
            Date fechaNacimiento  = format.parse(scanner.next());
            String fechaNacimientoFormato = format.format(fechaNacimiento);

            Date fechaActual = new Date();
            String fechaActualFormato = format.format(fechaActual);

            long tiempo1 = fechaNacimiento.getTime();
            long tiempo2 = fechaActual.getTime();

            double edad = Math.floor((tiempo2 - tiempo1) * 3.1709791983765E-11);
            int edad2 = (205 - 156) / 10000;

            System.out.println("Fecha de Nacimiento = " + fechaNacimientoFormato);
            System.out.println("Fecha Actual = " + fechaActualFormato);

            System.out.println("Edad = " + edad);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
