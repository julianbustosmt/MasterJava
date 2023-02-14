import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {

        /*Obtener el nombre más largo de tres personas, según los siguientes requerimientos

        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir solo uno de los tres, el de más caracteres en el nombre.)

        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el índice cero accedemos al nombre de la persona.

        Restricción no usar loops en el desarrollo de la tarea.

        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/

        String nombre1 = JOptionPane.showInputDialog("Escriba el nombre 1: ");
        String nombre2 = JOptionPane.showInputDialog("Escriba el nombre 2: ");
        String nombre3 = JOptionPane.showInputDialog("Escriba el nombre 3: ");

        String nombreMasLargo = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length()) ? nombre1 : nombre2;
        nombreMasLargo = nombreMasLargo.split(" ")[0].length() > nombre3.split(" ")[0].length() ? nombreMasLargo : nombre3;

        System.out.println("La persona con el nombre mas largo es: " + nombreMasLargo);

    }
}
