package co.julianb.proyectomamiferos.mamiferos.felinos;

public class Leon extends Felinos {

    private int numeroManada;
    private double potenciaRugido;

    public Leon(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, longitudGarras, velocidad);
    }

    public Leon(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad, int numeroManada, double potenciaRugido) {
        super(habitad, altura, largo, peso, nombreCientifico, longitudGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public void setPotenciaRugido(double potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public double getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "Los leones son animales carnívoros que cazan en manadas de " + this.numeroManada + " , y se alimentan principalmente de animales como ñus, cebras y antílopes.";
    }

    @Override
    public String dormir() {
        return "Los leones pasan gran parte del día durmiendo y descansando, y suelen ser más activos durante la noche o al amanecer.";
    }

    @Override
    public String correr() {
        return "Los leones son capaces de correr a velocidades de hasta 80 kilómetros por hora durante cortas distancias, aunque prefieren emboscar a sus presas y atacarlas de forma rápida.";
    }

    @Override
    public String comunicarse() {
        return "Los leones utilizan su potente rugido de hasta " + this.potenciaRugido + "db para comunicarse y establecer su territorio, y las manadas suelen estar formadas por un macho dominante, varias hembras y sus crías.";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumero Manada=" + numeroManada +
                "\nPotencia Rugido=" + potenciaRugido +
                "\n/**********************************/";
    }
}
