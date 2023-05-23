package co.julianb.proyectomamiferos.mamiferos.felinos;

public class Gepardo extends Felinos{

    public Gepardo(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, longitudGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los guepardos son animales carnívoros y se alimentan principalmente de presas como antílopes y cebras, cazando en solitario o en pareja.";
    }

    @Override
    public String dormir() {
        return "Los guepardos pasan gran parte del día durmiendo y descansando, ya que suelen cazar durante la noche o al amanecer.";
    }

    @Override
    public String correr() {
        return " Los guepardos son los animales terrestres más rápidos del mundo, capaces de correr a velocidades superiores a los 100 kilómetros por hora en cortas distancias.";
    }

    @Override
    public String comunicarse() {
        return "Los guepardos utilizan una variedad de sonidos para comunicarse, como gruñidos y maullidos, y también utilizan el lenguaje corporal para expresar su estado de ánimo y establecer jerarquías sociales.";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLongitudGarras=" + longitudGarras +
                "\nVelocidad=" + velocidad +
                "\n/**********************************/";
    }
}
