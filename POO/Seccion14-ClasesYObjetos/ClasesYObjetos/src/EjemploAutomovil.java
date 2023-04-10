import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorFerrari = new Motor(5.0, TipoMotor.GASOLINA);
        Automovil ferrari = new Automovil();
        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F250");
        ferrari.setDeposito(new Deposito());
        ferrari.setMotor(motorFerrari);

        System.out.println("ferrari.getColor() = " + ferrari.getColor());
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "Cx5", Color.GRIS, motorMazda);
        mazda.setDeposito(new Deposito(45));

        Automovil nissan = new Automovil("Nissan", "HKM", Color.VERDE,  new Motor(3.0, TipoMotor.GASOLINA), new Deposito(50));
        Automovil nissan2 = new Automovil("Nissan", "HKM", Color.AZUL,  new Motor(3.0, TipoMotor.GASOLINA), new Deposito(35));

        Date fecha = new Date();
        Automovil auto = new Automovil();

        System.out.println("Comparando Objetos con equals: " + nissan.equals(nissan2));
        System.out.println("Comparando Objetos con == : " + (nissan == nissan2));
        System.out.println(auto.equals(nissan));
        System.out.println(auto.equals(fecha));

        System.out.println(nissan);

        System.out.println(ferrari.verDetalle());
        System.out.println(ferrari.acelerarFrenar(5500));
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3500));
        System.out.println(mazda.frenar());

        System.out.println("Kilómetros por litro: " + ferrari.calcularConsumo(300,0.75f));
        System.out.println("Kilómetros por litro: " + ferrari.calcularConsumo(300,75));

    }
}
