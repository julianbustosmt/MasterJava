package co.julianb.proyectocatalogo.modelo;

import co.julianb.proyectocatalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String tirulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = tirulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
}
