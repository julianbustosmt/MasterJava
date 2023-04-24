package co.julianb.ejemplo;

import co.julianb.herencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=================== Creando la instancia de la clase Alumno ===================");
        Alumno alumno = new Alumno("Pepe", "Hernandez", 20, "Nacional");
        alumno.setNotaHistoria(5.5);
        alumno.setNotaLenguaje(6.3);
        alumno.setNotaMatematica(6.8);
        alumno.setEmail("alumno@email.com");

        System.out.println("=================== Creando la instancia de la clase AlumnoInternacional ===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Paco", "Utsusuki", "Peru");
        alumnoInt.setColegio("Nacional");
        alumnoInt.setNotaHistoria(3.5);
        alumnoInt.setNotaLenguaje(6.5);
        alumnoInt.setNotaMatematica(8.8);
        alumnoInt.setNotaIdiomas(8.4);
        alumnoInt.setEmail("alumnoInt@email.com");

        System.out.println("=================== Creando la instancia de la clase Profesor ===================");
        Profesor profesor = new Profesor("Paco", "Pastor", "Matematicas");
        profesor.setEmail("profesor@email.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo los datos de tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() +
                ", edad:  " + persona.getEdad() + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos de tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno) persona).getColegio());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos de tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("===============================Sobreescribir calcularPromedio=================================");
            System.out.println(((Alumno) persona).calcularPromedio());
            System.out.println("================================================================");
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos de tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("===============================Sobreescribir saludar=================================");
        System.out.println(persona.saludar());
        System.out.println("================================================================");

/*        System.out.println("Profesor " + persona.getAsignatura() + ": " +
                persona.getNombre() + " " + persona.getApellido());*/
    }
}
