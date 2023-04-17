package co.julianb.appfacturas;

import co.julianb.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNit("dadd-55");
        cliente.setNombre("Juan");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la descipcion de la factura: ");
        String descripcion = scanner.nextLine();

        Factura factura = new Factura(descripcion, cliente);

        Producto producto;

        System.out.println("Cuantos productos desea registrar (1-10)");
        int cantidadProductos = scanner.nextInt();

        for (int i = 0; i < cantidadProductos; i++){
            producto = new Producto();
            System.out.print("Ingrese producto " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.next());

            System.out.print("Ingrese precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));
            System.out.println();
            scanner.nextLine();
        };

        System.out.println(factura);

    }
}
