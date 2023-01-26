import java.util.Locale;

public class Variables {
    public static void main(String[] args) {
        String nombre = "Julian";
        System.out.println("Hola mi nombre es " + nombre);
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        int numero2 = 2;

        boolean valor = true;
        if(valor){
            System.out.println("valor = " + valor);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String variable;
        variable = "El pepe";

        if(numero2 > 10){
            nombre = "Juancho";
        }

        System.out.println(variable);

    }
}
