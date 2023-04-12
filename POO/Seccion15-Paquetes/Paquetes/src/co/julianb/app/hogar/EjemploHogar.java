package co.julianb.app.hogar;

import co.julianb.app.jardin.Perro;
import static co.julianb.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();
    }
}
