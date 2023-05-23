package co.julianb.proyectomamiferos.mamiferos.caninos;

public class Lobo extends Caninos {
    private int numeroManada;
    private String especie;

    public Lobo(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double longitudColmillo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, longitudColmillo);
    }

    public Lobo(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double longitudColmillo, int numeroManada, String especie) {
        super(habitad, altura, largo, peso, nombreCientifico, color, longitudColmillo);
        this.numeroManada = numeroManada;
        this.especie = especie;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El lobo " + this.especie + ", una especie altamente social, caza en manadas de" +
                this.numeroManada + "  individuos, trabajando " +
                "juntos para acechar y abatir a sus presas en una estrategia de caza coordinada.";
    }

    @Override
    public String dormir() {
        return "La especie de lobo " + this.especie + " duerme en manadas y se acurruca en posición fetal para descansar.";
    }

    @Override
    public String correr() {
        return "El lobo " + this.especie + "en manada o en solitario, es un corredor veloz y resistente, capaz de alcanzar " +
                "velocidades de hasta 60 kilómetros por hora para perseguir y abatir a su presa.";
    }

    @Override
    public String comunicarse() {
        return "Los lobos grises utilizan una variedad de vocalizaciones, como aullidos, ladridos, gruñidos y gemidos, para " +
                "comunicarse entre sí y con otras manadas. También emplean el lenguaje corporal, como posturas y movimientos " +
                "de la cola y las orejas, para transmitir información sobre su estado de ánimo, intenciones y jerarquía dentro " +
                "de la manada.";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumeroManada=" + numeroManada +
                "\nSubespecie='" + especie +
                "\n/**********************************/";
    }
}
