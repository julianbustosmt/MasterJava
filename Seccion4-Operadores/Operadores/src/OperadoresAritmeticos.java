import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i -j = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j;
        System.out.println("division = " + division);
        float div2 = (float)i /  (float)j ;
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("Numero es par");
        }else {
            System.out.println("Numero es impar");
        }
    }
}
