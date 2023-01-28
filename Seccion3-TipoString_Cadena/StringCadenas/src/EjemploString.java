public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        System.out.println("curso = " + curso);
        String curso2 = new String("Programación java"); // Creando String por argumento en el constructor
        System.out.println("curso2 = " + curso2);

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 (objeto/ referencia en memoria) : " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso == curso2 (valor) : " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); // Ignora la escritura (mayúsculas, minusculas);
        System.out.println("curso == curso2 (ignoreCase) : " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3; // Si se crean 2 objetos tipo String con el mismo valor, se asigna la misma referencia en memoria a ambos objetos.
        System.out.println("curso == curso3  " + esIgual);

    }
}
