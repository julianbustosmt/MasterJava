package co.julianb.ejemplo;

import co.julianb.herencia.Alumno;
import co.julianb.herencia.AlumnoInternacional;
import co.julianb.herencia.Persona;
import co.julianb.herencia.Profesor;

public class EjemploHerenciaToString {
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
        System.out.println(persona);
    }
}
