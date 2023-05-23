package co.julianb.proyectomamiferos.mamiferos.caninos;

public class Perro extends Caninos{
    private int fuerzaMordida;

    public Perro(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double longitudColmillo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, longitudColmillo);
    }

    public Perro(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double longitudColmillo, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, longitudColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros pueden tener una mordida poderosa, de hasta "+ this.fuerzaMordida + " por lo que es importante " +
                "controlar su alimentación y enseñarles buenos hábitos alimenticios para evitar cualquier comportamiento agresivo o peligroso.";
    }

    @Override
    public String dormir() {
        return "Los perros duermen en diferentes posiciones y necesitan un lugar cómodo y tranquilo para descansar.";
    }

    @Override
    public String correr() {
        return "Los perros son animales activos y corren utilizando sus patas y músculos. Algunas razas de perros tienen una gran resistencia y velocidad.";
    }

    @Override
    public String comunicarse() {
        return "Los perros se comunican mediante ladridos, gruñidos y posturas corporales, y pueden mostrar su afecto y lealtad a sus dueños de muchas maneras diferentes.";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecie " + this.getClass().getSimpleName() +
                "\nFuerzaMordida=" + fuerzaMordida +
                "\n/**********************************/";
    }
}
