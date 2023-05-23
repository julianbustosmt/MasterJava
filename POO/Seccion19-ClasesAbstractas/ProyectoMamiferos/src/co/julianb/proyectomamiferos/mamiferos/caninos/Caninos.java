package co.julianb.proyectomamiferos.mamiferos.caninos;

import co.julianb.proyectomamiferos.mamiferos.Mamifero;

abstract public class Caninos extends Mamifero {
    protected String color;
    protected double longitudColmillo;

    public Caninos(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double longitudColmillo) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.longitudColmillo = longitudColmillo;
    }

    public String getColor() {
        return color;
    }

    public double getLongitudColmillo() {
        return longitudColmillo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncolor='" + color +
                "\nlongitudColmillo=" + longitudColmillo;
    }
}
