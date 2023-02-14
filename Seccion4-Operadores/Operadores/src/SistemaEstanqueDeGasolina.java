import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {

        /* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero también puede ser del tipo int.

                Si la capacidad actual es 70 litros: imprimir Estanque lleno

                Si está entre 60 y menor a 70: imprimir Estanque casi lleno

                Si está entre 40 y menor a 60: imprimir Estanque  3/4

                Si está entre 35 y menor a 40: imprimir Medio Estanque

                Si está entre 20 y menor a 35: imprimir Suficiente

                Si está entre 1 y menor a 20: imprimir Insuficiente */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida actual en litros del estanque de gasolina: ");
        double gasolinaActual = scanner.nextDouble();

        if (gasolinaActual == 70) {
            imprimir("Estanque lleno");
        } else if (gasolinaActual >= 60 && gasolinaActual < 70) {
            imprimir("Estanque casi lleno");
        } else if (gasolinaActual >= 40 && gasolinaActual < 60) {
            imprimir("Estanque 3/4");
        } else if (gasolinaActual >= 35 && gasolinaActual < 40) {
            imprimir("Medio estanque");
        } else if (gasolinaActual >= 20 && gasolinaActual < 35) {
            imprimir("Suficiente");
        } else if (gasolinaActual >= 1 && gasolinaActual < 20) {
            imprimir("Insuficiente");
        } else {
            imprimir("Dato invalido, intente de nuevo");
            main(args);
        }


    }

    public static void imprimir(String valor) {
        System.out.println(valor);
    }
}
