import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Pepa"};

        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].equalsIgnoreCase("pepa")
            ){
                continue;
            }
            System.out.println(i + " = " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, "Nombre " + buscar + " fue encontrado.");
        }else {
            JOptionPane.showMessageDialog(null, "Nombre " + buscar + " no existe en el sistema.");
        }
    }
}
