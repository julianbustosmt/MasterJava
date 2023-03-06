public class WrapperInteger {
    public static void main(String[] args) {

        // De int a Integer
        int intPrimitivo = 321456;
        Integer intObjeto = Integer.valueOf(intPrimitivo); // Explicita
        Integer intObjeto2 = intPrimitivo; // Implicita - Autoboxing
        System.out.println("intObjeto2 = " + intObjeto2);

        // De Integer a int
        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("intObjeto = " + intObjeto);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        // Se pierde información, ya que el valor supera el límite de la clase.
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        // No se pierde información, ya que la clase Long tiene mayor rango que Integer.
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
