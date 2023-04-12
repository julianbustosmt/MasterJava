package co.julianb.app.hogar;

import java.util.SplittableRandom;

public class Persona {

    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String lanzarPelota(){
        return "Lanzar la pelota al perro";
    }

    /*Metodo estatico*/
    public static String saludar(){
        return "Hola que tal";
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}
