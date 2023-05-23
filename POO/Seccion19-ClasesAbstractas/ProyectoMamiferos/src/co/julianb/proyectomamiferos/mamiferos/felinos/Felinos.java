package co.julianb.proyectomamiferos.mamiferos.felinos;

import co.julianb.proyectomamiferos.mamiferos.Mamifero;

abstract public class Felinos extends Mamifero {
    protected double longitudGarras;
    protected int velocidad;

    public Felinos(String habitad, double altura, double largo, double peso, String nombreCientifico, double longitudGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.longitudGarras = longitudGarras;
        this.velocidad = velocidad;
    }

    public double getLongitudGarras() {
        return longitudGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nLongitudGarras=" + longitudGarras +
                "\nvelocidad=" + velocidad;
    }
}
