package co.julianb.clasesabstractas.form;

import co.julianb.clasesabstractas.form.elementos.*;
import co.julianb.clasesabstractas.form.elementos.select.Opcion;
import co.julianb.clasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new Requerido());

        InputForm password = new InputForm("password", "password");
        password.addValidador(new Requerido())
                .addValidador(new Largo(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new Requerido())
                .addValidador(new Email());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new Numero());


        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("Lenguajes");
        lenguaje.addValidador(new NoNulo());

        ElementoForm saludar = new ElementoForm("Saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "'>";
            }
        };

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        saludar.setValor("Campo deshabilitado");
        username.setValor("julian.b");
        password.setValor("122");
        email.setValor("julian.bcorreo.com");
        edad.setValor("23");
        experiencia.setValor("Sin experiencia ... ");
        //java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password, email, edad,
                lenguaje, experiencia,
                saludar);

        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHTML());
            System.out.println("<br>");
        });

        elementos.forEach(elemento -> {
            if (!elemento.esValido()){
                elemento.getErrores().forEach(System.out::println);
            }
        });
    }

}
