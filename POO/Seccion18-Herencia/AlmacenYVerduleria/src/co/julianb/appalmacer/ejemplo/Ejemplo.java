package co.julianb.appalmacer.ejemplo;

import co.julianb.appalmacer.productos.*;

public class Ejemplo {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        productos[0]  = new Lacteo("Leche", 10.2, 6, 12);
        productos[1] = new Lacteo("Queso", 8.2, 2, 15);

        productos[2] = new Fruta("Manzana", 1.2, 12, Color.ROJO);
        productos[3] = new Fruta("Banano", 0.6, 15, Color.AMARILLO);

        productos[4] = new Limpieza("Limpia vidrios", 12.6, "Agua, Quimicos", 1);
        productos[5]  = new Limpieza("Jabón", 6.5, "Quimicos", 1);

        productos[6] = new NoPerecible("Maiz en lata", 6.5, 500, 20);
        productos[7] = new NoPerecible("Arroz", 5, 1000, 50);

        int i = 0;
        for (Producto producto: productos
             ) {
            System.out.println((++i) + "). " + producto);
        }
    }
}
