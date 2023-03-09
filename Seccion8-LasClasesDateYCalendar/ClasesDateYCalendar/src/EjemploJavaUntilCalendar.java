import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUntilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, Calendar.JANUARY, 25, 19,20,11);
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.MAY);
        calendario.set(Calendar.DAY_OF_MONTH, 16);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 9);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 54);
        calendario.set(Calendar.SECOND, 15);
        calendario.set(Calendar.MILLISECOND, 50);

        Date fecha = calendario.getTime();

        System.out.println("Fecha Sin Formato = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");

        String fechaConFormato = sf.format(fecha);
        System.out.println("Fecha Con Formato = " + fechaConFormato);
    }
}
