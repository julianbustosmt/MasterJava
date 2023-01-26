public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);

        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (decimal == caracter));

        char espacio = '\u0020'; // ' '
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; // similar al \n , depende del SO


        System.out.println("char corresponde en byte =" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en \bbites = " + retroceso + Character.SIZE);
        System.out.println("Valor maximo de un \tchar = " + tabulador + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char = \r\n" + Character.MIN_VALUE);

    }
}
