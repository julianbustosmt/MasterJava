public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolena = num1 > num2; //false
        Boolean objetoBoolean = Boolean.valueOf(primBoolena);
        Boolean objetoBoolean2 = Boolean.valueOf("False");
        Boolean objetoBoolean3 = true;

        System.out.println("primBoolena = " + primBoolena);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando 2 objetos boolena = " +(objetoBoolean == objetoBoolean2));
        System.out.println("Comparando 2 objetos boolena = " +(objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando 2 objetos boolena = " +(objetoBoolean.equals(objetoBoolean3)));
        System.out.println("Comparando 2 objetos boolena = " +(objetoBoolean2.equals(objetoBoolean3)));

        boolean primBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
