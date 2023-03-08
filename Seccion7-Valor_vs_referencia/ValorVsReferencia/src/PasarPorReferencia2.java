class Persona {
    private String nombre;

    public void modificarNombre (String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre (){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        // Las clases propias no son inmutables, por lo tanto cuando modificamos un valor también modificamos el original, ya que hacemos el llamado a su referencia en memoria.
        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Despues de llamar el método test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finalizamos el método main con los datos del arreglo modificados");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
