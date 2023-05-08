package co.julianb.clasesabstractas.form.elementos;

import co.julianb.clasesabstractas.form.validador.Validador;
import co.julianb.clasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;


/*Una clase abstracta es una clase que no puede ser instanciada directamente, es decir, no se puede crear un objeto a partir de ella.
*  Su propósito es proporcionar una plantilla base para otras clases que la extiendan y definir un conjunto de métodos y/o propiedades que deben ser implementados en esas clases hijas.*/
abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esValido() {
        for (Validador validador : this.validadores
        ) {
            if (!validador.esValido(this.valor)) {
                if (validador instanceof MensajeFormateable) {
                    this.errores.add(((MensajeFormateable) validador).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(validador.getMensaje(), this.nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHTML();
}
