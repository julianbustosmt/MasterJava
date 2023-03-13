import java.io.IOException;
import java.util.Properties;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;


        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = rt.exec("notepad");
            }else{
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
    }
}

