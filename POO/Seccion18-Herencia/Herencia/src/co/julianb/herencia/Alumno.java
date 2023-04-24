package co.julianb.herencia;

public class Alumno extends Persona {
    private String colegio;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno() {
        //System.out.println("Alumno : Inicializando constructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String colegio) {
        super(nombre, apellido, edad);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String email, String colegio, double notaMatematica,
                  double notaLenguaje, double notaHistoria) {
        super(nombre, apellido, edad, email);
        this.colegio = colegio;
        this.notaMatematica = notaMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar +  " soy un alumno, mi nombre es " + this.getNombre();
    }

    public double calcularPromedio() {
        //System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (this.notaHistoria + this.notaLenguaje + this.notaMatematica)/3;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ncolegio='" + colegio + '\'' +
                ", notaMatematica= " + notaMatematica +
                ", notaLenguaje= " + notaLenguaje +
                ", notaHistoria= " + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
