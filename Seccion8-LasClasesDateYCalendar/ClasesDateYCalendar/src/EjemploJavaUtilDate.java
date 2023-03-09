import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");

        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (long i = 0; i < 1000000000L; i++){
            j += i;
        }
        
        Date fecha2 = new Date();
        
        long tiempoFinal = (fecha2.getTime() - fecha.getTime());

        System.out.println("j = " + j);
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
    }
}
