import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorFerrari = new Persona("El pepe", "Sanchez");
        Automovil ferrari = new Automovil();
        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F250");
        ferrari.setMotor(new Motor(5.0, TipoMotor.GASOLINA));
        ferrari.setTipo(TipoAutomovil.CONVERTIBLE);
        ferrari.setConductor(conductorFerrari);

        Persona conductorMazda = new Persona("Etesech", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "Cx5", Color.GRIS);
        mazda.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.SEDAN);
        mazda.setConductor(conductorMazda);

        Persona conductorNissan = new Persona("Juan", "Pachino");
        Motor motorNissan = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil nissan = new Automovil("Nissan", "H2", Color.AMARILLO, motorNissan);
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setConductor(conductorNissan);

        Persona conductorChevy = new Persona("Jose", "Ruiz");
        Automovil chevy = new Automovil("Chevy", "Cx5", Color.GRIS);
        chevy.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        chevy.setTipo(TipoAutomovil.SEDAN);
        chevy.setConductor(conductorChevy);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Paco", "Perez"));
        audi.setMotor(new Motor(5.0, TipoMotor.GASOLINA));

        Automovil[] autos = new Automovil[5];
        autos[0] = ferrari;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = chevy;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}

