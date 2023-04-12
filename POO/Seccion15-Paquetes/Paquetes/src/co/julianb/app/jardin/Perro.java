package co.julianb.app.jardin;

import co.julianb.app.hogar.Persona;

public class Perro {

    /*En el caso de los atributos con modificador de acceso 'protected' solo
    se podrían usar si la clase en donde sé instancia está en el mismo paquete
    o hereda de la clase actual "clase hijo".
    * */
    protected String nombre;
    protected String raza;

    /*Debido a que el método 'jugar' tiene acceso 'default' no se puede invocar
    * en clases que no estén dentro del paquete actual. */
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
