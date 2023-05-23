package co.julianb.proyectomamiferos.mamiferos;

abstract public class Mamifero {

    protected String habitad;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    public Mamifero(String habitad, double altura, double largo, double peso, String nombreCientifico) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

    @Override
    public String toString() {

        return  "/**********************************/" +
                "\nClase : " + this.getClass().getSimpleName() +
                "\nHabitad='" + habitad +
                "\nAltura=" + altura +
                "\nlargo=" + largo +
                "\nPeso=" + peso +
                "\nNombre Científico='" + nombreCientifico;
    }
}
