package co.julianb.proyectomamiferos.mamiferos.felinos;

public class Tigre extends Felinos{
    private String especie;

    public Tigre(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, longitudGarras, velocidad);
    }

    public Tigre(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad, String especie) {
        super(habitad, altura, largo, peso, nombreCientifico, longitudGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "Los tigres " + this.especie + "son animales carnívoros y se alimentan principalmente de presas como ciervos, jabalíes y búfalos de agua.";
    }

    @Override
    public String dormir() {
        return "Los tigres pasan gran parte del día durmiendo y descansando, y suelen ser más activos durante la noche.";
    }

    @Override
    public String correr() {
        return "Los tigres son animales rápidos y ágiles, capaces de correr a velocidades de hasta 60 kilómetros por hora en cortas distancias.";
    }

    @Override
    public String comunicarse() {
        return "Los tigres utilizan una variedad de sonidos para comunicarse, como gruñidos, maullidos y rugidos, y también utilizan el lenguaje " +
                "corporal para expresar su estado de ánimo y establecer su territorio.";
    }

    @Override
    public String toString() {
        return  "Especie='" + especie +
                "\n/**********************************/";
    }
}
