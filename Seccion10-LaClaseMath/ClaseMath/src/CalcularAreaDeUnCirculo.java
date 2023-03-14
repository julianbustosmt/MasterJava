import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularAreaDeUnCirculo {
    public static void main(String[] args) {
        /*  Pedir el radio de un círculo y calcular su área.

         Utilizar la formula:

         area = PI*r² (Constante PI multiplicado por el radio al cuadrado).*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo para calcular su area:  ");

        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("#.####");

        String areaFormat = df.format(area);

        System.out.println("Radio = " + radio);
        System.out.println("Area del circulo = " + areaFormat);

    }
}
