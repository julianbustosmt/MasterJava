package co.julianb.app.jardin;

import co.julianb.app.hogar.Persona;
/*import static co.julianb.app.hogar.Persona.saludar;
import static co.julianb.app.hogar.Persona.GENERO_MASCULINO;
import static co.julianb.app.hogar.Persona.GENERO_FEMENINO;*/

/*Al importar un método o atributo estático podemos usar estos como
si fueran propios de la clase actual */
import static co.julianb.app.hogar.Persona.*;
import static co.julianb.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();

        /*No podemos acceder al atributo 'nombre' de la clase Persona, ya que
        * su modificador de acceso es 'default' y la Clase 'EjemploPaquetes se
        * encuentra en diferente paquete que la clase 'Persona' */
        //p.nombre = "El pepe";
        p.setNombre("El pepe");
        p.setColorPelo(COLORIN);
        System.out.println("p.getNombre() = " + p.getNombre());

        /*En este caso si podemos acceder a los atributos de la 'Perro' aun
        cuando estos tienen acceso 'default', ya que ambas clase se
        encuentran en el mismo paquete.
        * */
        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Labrador";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);


        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;

    }
}
