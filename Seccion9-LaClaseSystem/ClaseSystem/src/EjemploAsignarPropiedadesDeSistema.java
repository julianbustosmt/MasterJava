import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties2");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor");

            System.setProperties(p);

            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.texto.ambiente"));

            ps.list(System.out);

        } catch (Exception e){
            System.err.println("No se encontro el archivo de configuracion" + e);
            System.exit(1);
        }
    }
}
