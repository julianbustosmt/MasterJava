import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        /*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.

        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.*/
        Scanner scanner = new Scanner(System.in);

        double sumaTotal = 0;
        double notasMayoresA5 = 0;
        int numNotasMayoresA5 = 0;
        double notasMenoresA4 = 0;
        int numNotasMenoresA4 = 0;
        double cantidadNotas1 = 0;


        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese la nota " + (i+1) + ": ");
            double nota = scanner.nextDouble();

            if (nota <= 0){
                System.out.println("No se pueden ingresar notas menores o iguales a 0");
                main(args);
                System.exit(0);
            }else if(nota > 7){
                System.out.println("No se pueden ingresar notas mayores a 7");
                i--;
                continue;

            }

            if(nota == 1){
                cantidadNotas1 ++;
            }else if (nota >= 5){
                notasMayoresA5 += nota;
                numNotasMayoresA5 ++;
            }else if(nota <= 4){
                notasMenoresA4 += nota;
                numNotasMenoresA4 ++;
            }

            sumaTotal += nota;
        }

        if(numNotasMayoresA5 <= 0){
            System.out.println("No se encontraron notas mayores a 5");
        }else {
            double promedioNotasMayoresA5 = notasMayoresA5 / numNotasMayoresA5;
            System.out.println("Promedio Notas Mayores a 5 = " + promedioNotasMayoresA5);
        }

        if(numNotasMenoresA4 <= 0){
            System.out.println("No se encontraron notas inferiores a 4");
        }else {
            double promedioNotasMenoresA4 = notasMenoresA4 / numNotasMenoresA4;
            System.out.println("Promedio Notas Menores a 4 = " + promedioNotasMenoresA4);
        }

        System.out.println("Cantidad Notas = 1: " + cantidadNotas1);
        double promedioTotal = sumaTotal / 20;
        System.out.println("Promedio Total = " + promedioTotal);


    }
}
