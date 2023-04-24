package co.julianb.appEmpresa.modelo;

public class Empleado extends Persona {
    private double remuneracion;
    private int idEmpleado;

    private static int id = 0;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.idEmpleado = ++id;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return  super.toString()  +
                "\n*** Empleado ***" +
                "\n\tID Empleado=" + idEmpleado +
                "\n\tRemuneración=" + remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje){
      this.remuneracion += (remuneracion * ((double)porcentaje/100));
    }
}
