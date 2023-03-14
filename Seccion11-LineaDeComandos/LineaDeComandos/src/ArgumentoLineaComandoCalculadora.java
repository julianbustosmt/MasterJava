public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        try {
            if (args.length != 3){
                System.out.println("Ingrese una operacion (suma, resta, mult, div) " +
                        "y dos enteros");
                System.exit(-1);
            }
            String operacion = args[0];
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);

            double resultado = 0;

            switch (operacion) {
                case "suma":
                    resultado = a + b;
                    break;
                case "resta":
                    resultado = a - b;
                case "multi":
                    resultado = a * b;
                case "div":
                    if (b == 0) {
                        System.out.println("No se puede dividir por 0");
                        System.exit(-1);
                    }
                    resultado = (double) (a / b);
                    break;
            }
            System.out.println("resultado = " + resultado);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
