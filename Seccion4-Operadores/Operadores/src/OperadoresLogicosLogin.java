import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "El pepe";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "0000";

        usernames[2] = "otroUser";
        passwords[2] = "1000";*/

        String[] usernames = {"El pepe", "admin", "otroUser"};
        String[] passwords = {"12345", "0000", "1000"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String u = scanner.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            /*if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado; // Otra forma de validar información usando el operador ternario
        }

        /*if (esAutenticado){
            System.out.println("Ingreso exitoso, bienvenido " + u);
        }else {
            System.out.println("Usuario o contraseña incorrecto");
            main(args);
        }*/

        String mensaje = esAutenticado ? "Ingreso exitoso, bienvenido " + u :  "Usuario o contraseña incorrecto";  // Otra forma de validar información usando el operador ternario
        System.out.println(mensaje);
    }
}
