import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUntilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha (yyyy-MM-dd) : ");
        try {
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2 ");
            }else if (fecha.before(fecha2)){
                System.out.println("Fecha del usuario es antes que fecha 2");
            }else if(fecha.equals(fecha2)){
                System.out.println("Ambas fechas son iguales");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despues que fecha2 ");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha del usuario es antes que fecha 2");
            }else {
                System.out.println("Ambas fechas son iguales");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
