import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Infrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febreo";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }
        System.out.println(nombreMes);

        int num = 3;
        switch (num) {
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("Numero desconocido");
        }

        String nombre = "Andres";

        switch (nombre) {
            case "Admin":
                System.out.println("Modo Admin");
                break;
            case "El pepe":
                System.out.println("El pepe");
                break;
            case "Etesech":
                System.out.println("Eteeesech");
                break;
            case "Andres":
                System.out.println("Hola Andres");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
