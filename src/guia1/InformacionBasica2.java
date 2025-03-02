package guia1;
import javax.swing.JOptionPane;

public class InformacionBasica2 {
    public static void main(String[] args){
        String nombres = "";
        String apellidos = "";
        String carrera = "";
        String edadstr;
        int edad;
        nombres = JOptionPane.showInputDialog("Digite sus nombres");
        apellidos = JOptionPane.showInputDialog("Digite sus apellidos");
        carrera = JOptionPane.showInputDialog("Digite su carrera");
        edadstr = JOptionPane.showInputDialog("Digite su edad");
        edad = Integer.parseInt(edadstr);

        JOptionPane.showMessageDialog(null,
                "Nombres: " + nombres + "\n" +
                        "Apellidos: " + apellidos + "\n" +
                        "Carrera: " + carrera + "\n" +
                        "Edad: " + edad);
    }

}
