import co.julianb.proyectomamiferos.mamiferos.Mamifero;
import co.julianb.proyectomamiferos.mamiferos.caninos.Lobo;
import co.julianb.proyectomamiferos.mamiferos.caninos.Perro;
import co.julianb.proyectomamiferos.mamiferos.felinos.Gepardo;
import co.julianb.proyectomamiferos.mamiferos.felinos.Leon;
import co.julianb.proyectomamiferos.mamiferos.felinos.Tigre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo {

    public static void main(String[] args) {
        Gepardo gepardo = new Gepardo(" Sabanas y áreas abiertas de África", 0.8, 1.5, 65,"Acinonyx jubatus.",5, 110 );
        Leon leon = new Leon("Sabanas y praderas de África", 1.3, 2.5, 250, "Panthera leo", 5, 80, 15, 114);
        Tigre tigre = new Tigre(" Bosques y selvas de Asia", 1, 3.5, 310, "Panthera tigris", 8, 65, "blanco");

        Perro perro = new Perro("Los perros son animales domésticos que viven en todo el mundo.", 0.3, 1.5, 90, "Canis lupus familiaris","gris",3.8,238 );
        Lobo lobo = new Lobo(" Bosques y tundras de Europa, Asia y América del Norte.", 0.8, 1.5, 80, "Canis lupus", "negro", 5,10,"Ibérico");

        List<Mamifero> mamiferos = Arrays.asList(gepardo,leon,tigre,perro,lobo);

        for (Mamifero animales:mamiferos
             ) {
            System.out.println(animales);
            System.out.println(animales.comer());
            System.out.println(animales.dormir());
            System.out.println(animales.comunicarse());
        }
    }

}
