public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadDepositoEstatico(50);

        Automovil ferrari = new Automovil();
        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F250");
        ferrari.setMotor(new Motor(5.0, TipoMotor.GASOLINA));
        ferrari.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil.setColorPatente(Color.ROJO);
        Automovil mazda = new Automovil("Mazda", "Cx5", Color.GRIS);
        mazda.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.SEDAN);

        TipoAutomovil tipo = ferrari.getTipo();
        System.out.println("tipoFerrarri.getNombre() = " + tipo.getNombre());
        System.out.println("tipoFerrarri.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil mediano");
            case STATION_WAGON -> System.out.println("Es un automóvil mas grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil tipoAutomovil: tipos
             ) {
            System.out.print(tipoAutomovil + "=> " + tipoAutomovil.name() + ", " +
                    tipoAutomovil.getNombre() + ", " +
                    tipoAutomovil.getDescripcion() + ", " +
                    tipoAutomovil.getNumeroPuertas());
            System.out.println();
        }

    }
}
