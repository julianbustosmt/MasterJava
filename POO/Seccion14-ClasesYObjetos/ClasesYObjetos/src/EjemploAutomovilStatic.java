public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadDepositoEstatico(50);

        Automovil ferrari = new Automovil();
        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F250");
        ferrari.setMotor(new Motor(5.0, TipoMotor.GASOLINA));
        ferrari.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println("ferrari.getColor() = " + ferrari.getColor());

        Automovil.setColorPatente(Color.ROJO);
        Automovil mazda = new Automovil("Mazda", "Cx5", Color.GRIS);
        /*mazda.setDeposito(new Deposito());*/
        mazda.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.SEDAN);

        System.out.println(ferrari.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println(Automovil.getColorPatente().getColor());

        /*Forma de llamar un metodo estático: se debe usar el nombre de la clase y no el de la instancia */
        System.out.println("Kilometros por litro = " + Automovil.calcularConsumoEstatico(300,60));

        System.out.println("Automovil.VELOCIDAD_MAXIMA_CARRETERA = " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);

        TipoAutomovil tipoFerrarri = ferrari.getTipo();
        System.out.println("tipoFerrarri.getNombre() = " + tipoFerrarri.getNombre());
        System.out.println("tipoFerrarri.getDescripcion() = " + tipoFerrarri.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 40));

    }
}
