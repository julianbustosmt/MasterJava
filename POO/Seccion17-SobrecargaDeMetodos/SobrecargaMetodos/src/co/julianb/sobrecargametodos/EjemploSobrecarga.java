package co.julianb.sobrecargametodos;

import static co.julianb.sobrecargametodos.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int :" + sumar(5, 63));
        System.out.println("Sumar float :" + sumar(5.0f, 63f));
        System.out.println("Sumar float - int :" + sumar(5.0f, 63));
        System.out.println("Sumar int - float : " + sumar(5, 63f));
        System.out.println("Sumar double : " + sumar(5.0, 63.0));
        System.out.println("Sumar String : " + sumar("5", "63.0"));
        System.out.println("Sumar multiples int : " + sumar(5, 63, 8, 9, 10));
        System.out.println("Sumar float - n int : " + sumar(5.0f, 63, 8, 9, 10));

        /* Cuando no tenemos un método implementado con el tipo de parámetro necesario,
        se utilizara el que posea un tipo compatible. */
        System.out.println("Sumar tres int : " + sumar(10L, 5L));

        /*El siguiente método no genera error, ya que los caracteres tienen un número asociado */
        System.out.println("Sumar int : " + sumar(10, '@'));
        System.out.println("Sumar float - int : " + sumar(10F, '@'));

    }
}
