package co.julianb.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: " );
        sb.append(this.persona)
                .append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n")
                .append("Carrera: ").append(this.carrera)
                .append("\n")
                .append("Experiencia: \n");

        for (String experiencia: experiencias
             ) {
            sb.append("- ").append(experiencia).append("\n");
        }

        return sb.toString();
    }
}
