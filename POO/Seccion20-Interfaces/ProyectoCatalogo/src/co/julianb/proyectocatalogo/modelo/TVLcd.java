package co.julianb.proyectocatalogo.modelo;

public class TVLcd extends Electronico {
    private int pulgadas;

    public TVLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
}
