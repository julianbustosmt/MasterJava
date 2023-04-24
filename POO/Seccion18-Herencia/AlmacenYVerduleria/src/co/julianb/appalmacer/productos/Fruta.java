package co.julianb.appalmacer.productos;

public class Fruta extends Producto{
    private double peso;
    private Color color;

    public Fruta(String nombre, double precio, double peso, Color color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tTipo : Fruta" +
                "\n\t{peso=" + peso +
                ", color='" + color + '\'' +
                '}';
    }
}
