package co.julianb.proyectocatalogo.modelo;

import co.julianb.proyectocatalogo.interfaces.IProducto;

public class IPhone extends Electronico{

    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }


}
