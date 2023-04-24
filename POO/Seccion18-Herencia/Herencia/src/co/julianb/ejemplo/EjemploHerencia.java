package co.julianb.ejemplo;

import co.julianb.herencia.Alumno;
import co.julianb.herencia.AlumnoInternacional;
import co.julianb.herencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=================== Creando la instancia de la clase Alumno ===================");
        Alumno alumno = new Alumno();
        alumno.setNombre("Pepe");
        alumno.setApellido("Hernandez");
        alumno.setColegio("Nacional");
        alumno.setNotaHistoria(5.5);
        alumno.setNotaLenguaje(6.3);
        alumno.setNotaMatematica(6.8);

        System.out.println("=================== Creando la instancia de la clase AlumnoInternacional ===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Paco");
        alumnoInt.setApellido("Utsusuki");
        alumnoInt.setPais("Peru");
        alumnoInt.setColegio("Nacional");
        alumnoInt.setNotaHistoria(3.5);
        alumnoInt.setNotaLenguaje(6.5);
        alumnoInt.setNotaMatematica(8.8);
        alumnoInt.setNotaIdiomas(8.4);

        System.out.println("=================== Creando la instancia de la clase Profesor ===================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Etesech");
        profesor.setApellido("Gonzales");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " +
                alumno.getNombre() + " " + alumno.getApellido() +
                " " + alumno.getColegio());

        System.out.println("Alumno internacional (" + alumnoInt.getPais() + ") : "
                + alumnoInt.getNombre() + " " + alumnoInt.getApellido());

        System.out.println("Profesor " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();

        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println("Clase hija : " + hija
                    + "\nClase padre: " + padre);

            clase = clase.getSuperclass();
        }
    }
}
