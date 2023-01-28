public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for(int i = 0; i < largo ; i++){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        System.out.println("trabalenguassplit(\"a\") = " + trabalenguas.split("a"));

        System.out.println();

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for(int j = 0; j<l; j++){
            System.out.println("arreglo2[" + j + "] = "  + arreglo2[j]);
        };

        System.out.println();

        String archivo = "Alguna.imagen.jpg";
        String[] archivoArr = archivo.split("\\."); // [.]
        int la = archivoArr.length;

        for(int a = 0; a < la ; a++){
            System.out.println("archivoArr[" + a + "] = "  + archivoArr[a]);
        };

        System.out.println("Extension = " + archivoArr[archivoArr.length-1]);

    }
}
