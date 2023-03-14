public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n " + i + ": " + args[i]);
        }

        /*
        * - Compilar nuestro programa por terminal (Generar el byteCode):
        * 1. Abrimos el terminal en la carpeta raiz del programa
        * 2. Nos movemos al directorio "src" `cd src'
        * 3. Ejecutamos el comando 'javac nombreDelArchivo.java'
        *
        * - Ejecutar programa
        * 1. Estando en el directorio src ejecutamos `java nombreArchivo`
        *
        * - Compilar programa para que acepte carateres especiales
        * 1. 'javac .nombreDelArchivo.java -encoding utf8
        * */
    }
}
