public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {

        String archivo = "Algun_imagen.jpg";

        int index = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(13) = " + archivo.substring(index + 1));


    }
}
