package co.julianb.appEmpresa.ejemplo;

import co.julianb.appEmpresa.modelo.*;

public class Ejemplo {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Juan", "Perez", "NF01", "Cll falsa 123", 100, 300);
        System.out.println(gerente1);

        gerente1.aumentarRemuneracion(30);
        System.out.println();
        System.out.println(gerente1.getRemuneracion());
    }
}
