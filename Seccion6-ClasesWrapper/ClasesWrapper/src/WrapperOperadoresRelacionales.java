public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = 127;
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Compara si los 2 objetos corresponden a la misma instancia.
        System.out.println("Son el mismo objeto = " + (num1 == num2));

        // Si el valor es 127 o menor, siempre se compara el valor y no la instancia. (Particularidad de Java)
        num2 = 127;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto = " + (num1 == num2));

        // Compara por el valor del objeto

        System.out.println("Tiene el mismo valor: " + (num1.equals(num2)));
        System.out.println("Tiene el mismo valor: " + (num1.intValue() == num2.intValue()));

        num2 = 100;

        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue(); // Lo mismo que arriba per de forma explícita
        System.out.println("condicion = " + condicion);

    }
}
