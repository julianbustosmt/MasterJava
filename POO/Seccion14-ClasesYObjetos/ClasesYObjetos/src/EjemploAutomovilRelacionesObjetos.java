public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {


        Persona conductorFerrari = new Persona("El pepe", "Sanchez");

        Automovil ferrari = new Automovil();
        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F250");
        ferrari.setMotor(new Motor(5.0, TipoMotor.GASOLINA));
        ferrari.setTipo(TipoAutomovil.CONVERTIBLE);
        ferrari.setConductor(conductorFerrari);

        Rueda[] ruedasFerrari = new Rueda[6];

        for (int i = 0; i < ruedasFerrari.length; i++) {
            ferrari.addRueda(new Rueda("Yokojama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Etesech", "Rodriguez");

        Automovil mazda = new Automovil("Mazda", "Cx5", Color.GRIS);
        /*mazda.setDeposito(new Deposito());*/
        mazda.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.SEDAN);
        mazda.setConductor(conductorMazda);

        /* Encadenamiento de métodos: Para lograr esto el método addRuda debe retornar su propia instancia. */
        mazda.addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5));


        System.out.println(ferrari.verDetalle());
        System.out.println(mazda.verDetalle());
    }
}
