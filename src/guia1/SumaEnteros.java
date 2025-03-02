package guia1;

import javax.swing.JOptionPane;// Paquete de Java

public class SumaEnteros {
    public static void main(String[] args) {
        // TODO code application logic here
        String primernumero;
        String segundonumero;
        int numero1;
        int numero2;
        int suma;
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        if(numero1 < 0 || numero2 < 0){
            JOptionPane.showMessageDialog(null,"No se permiten numeros negativos",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es:" +
                    suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

    }

}
