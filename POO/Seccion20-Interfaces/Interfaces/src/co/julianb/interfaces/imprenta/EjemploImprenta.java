package co.julianb.interfaces.imprenta;

import co.julianb.interfaces.imprenta.modelo.*;
import static co.julianb.interfaces.imprenta.modelo.Genero.*;
import static co.julianb.interfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("El pepe"), "Desarrollador web", "Contratenme.jpg");
        cv.addExperiencia("Java")
                .addExperiencia("JavaScript")
                .addExperiencia("HTML")
                .addExperiencia("CSS");

        Informe informe = new Informe(new Persona("Etesech"),
                new Persona("El pepe"),
                "Estudio sobre microservicios");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseño: Elem. Reusables POO",
                PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        // Implementacion de la interfaz sin instanciarla.
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo un objeto genérico de una clase anónima";
            }
        });
    }


}
