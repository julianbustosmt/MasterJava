package co.julianb.appEmpresa.modelo;

public class Cliente extends Persona{
    private int idCliente;

    private static int id = 0;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int idCliente) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.idCliente = ++id;
    }

    @Override
    public String toString() {
        return super.toString() +
                "*** Cliente ***" +
                "idCliente=" + idCliente;
    }
}
