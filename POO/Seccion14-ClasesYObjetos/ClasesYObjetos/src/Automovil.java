public class Automovil implements Comparable<Automovil>{
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Deposito deposito;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private TipoAutomovil tipo;

    /* - Los atributos o métodos estáticos no le pertenecen a la instancia, sino a la clase
     *   por lo tanto es compartido por cualquier objeto de la clase lo que quiere decir que
     *   cuando su valor sea modificado se verá representado en todas sus instancias
     * - Los métodos estáticos solo pueden usar atributos estáticos  */
    private static Color colorPatente = Color.ROJO;
    private static int capacidadDepositoEstatico = 40;
    private static int ultimoId;

    /*    En Java, el modificador "final" se utiliza para indicar que un elemento, como una variable,
    un método o una clase, no puede ser modificado una vez que se ha inicializado o definido.
     */
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 80;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";


    public Automovil() {
        this.setId(++ultimoId);
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Deposito deposito) {
        this(fabricante, modelo, color, motor);
        this.deposito = deposito;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Deposito deposito, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, deposito);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getCapacidadDepositoEstatico() {
        return capacidadDepositoEstatico;
    }

    public static void setCapacidadDepositoEstatico(int capacidadDepositoEstatico) {
        Automovil.capacidadDepositoEstatico = capacidadDepositoEstatico;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        if (deposito == null) {
            this.deposito = new Deposito();
        }
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle() {
        String detalle =
                "auto.id = " + this.getId() +
                        "\nauto.fabricante = " + this.getFabricante() +
                        "\nauto.modelo = " + this.getModelo();

        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getNombre();
        }

        detalle +=
                "\nauto.color = " + this.color.getColor() +
                "\nAutomóvil.colorPatente = " + colorPatente.getColor();

        if (this.getMotor() != null) {
            detalle += "\nauto.cilindraje = " + this.motor.getCilindraje();
        }

        if (this.getConductor() != null) {
            detalle += ("Conductor: " + this.getConductor());
        }

        if (getRuedas() != null) {
            detalle += ("\nRuedas : ");
            for (Rueda rueda : this.getRuedas()
            ) {
                detalle += ("\nFabricante = " + rueda.getFabricante() +
                        ", Diametro: " + rueda.getDiametro() +
                        ", Ancho: " + rueda.getAncho());
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.getFabricante() + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.getFabricante() + " " + this.getModelo() + " frenando";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (this.getDeposito().getCapacidad() * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km / (this.getDeposito().getCapacidad() * (porcentajeGasolina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km / (capacidadDepositoEstatico * (porcentajeGasolina / 100f));
    }

    /*Sobreescribiendo el método 'equals' para adaptarlo a nuestras necesidades */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil automovil)) {
            return false;
        }
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(automovil.getFabricante())
                && this.modelo.equals(automovil.getModelo()));
    }

    @Override
    public String toString() {
        return "Automóvil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + motor.getCilindraje() +
                ", capacidadDeposito=" + getDeposito().getCapacidad() +
                '}';
    }

    @Override
    public int compareTo(Automovil a) {
        return this.modelo.compareTo(a.modelo);
    }
}
