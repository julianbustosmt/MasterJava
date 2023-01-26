import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try{
            numeroDecimal =  Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        };

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario  = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de: " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String ResultadoHexadecimal = "numero hexadecimal de: " + numeroBinario + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(ResultadoHexadecimal);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += ResultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
