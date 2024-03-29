package co.julianb.herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor() {
        //System.out.println("Profesor : Inicializando constructor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String saludar(){
        return "Hola soy el profesor de " + this.getAsignatura() + ", mi nombre es " + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura=" + asignatura;
    }
}
