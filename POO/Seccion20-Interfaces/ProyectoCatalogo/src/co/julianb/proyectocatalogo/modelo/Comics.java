package co.julianb.proyectocatalogo.modelo;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, String autor, String tirulo, String editorial, String personaje) {
        super(precio, autor, tirulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
