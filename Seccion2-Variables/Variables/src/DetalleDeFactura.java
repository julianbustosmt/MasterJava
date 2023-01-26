import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 1: ");
        float precio1 = 0;

        try {
            precio1 = scanner.nextFloat();
        }catch (Exception e){
            System.out.println("Precio invalido, intente de nuevo.");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese el precio del producto 2: ");
        float precio2 = 0;

        try {
            precio2 = scanner.nextFloat();
        }catch (Exception e){
            System.out.println("Precio invalido, intente de nuevo.");
            main(args);
            System.exit(0);
        }

        double precioTotal = precio1 + precio2;
        double impuestos = precioTotal * 0.19;
        double precioConImpuestos = precioTotal + impuestos;

        System.out.println("La factura \"" + nombreFactura + "\" tiene un total bruto de " + precioTotal + ", con un impuesto de " + impuestos + " y el monto después de impuesto es de " + precioConImpuestos);
    }
}
