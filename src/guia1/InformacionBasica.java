package guia1;

import java.util.Scanner;

public class InformacionBasica {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String nombres = "";
        String apellidos = "";
        String carrera = "";
        int edad;
        System.out.print("Ingrese sus nombres: ");
        nombres=reader.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        apellidos=reader.nextLine();
        System.out.print("Ingrese su carrera: ");
        carrera=reader.nextLine();
        System.out.print("Ingrese su edad: ");
        edad=reader.nextInt();
        System.out.println("Nombres: "+nombres);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Carrera: "+carrera);
        System.out.println("Edad: "+edad);
    }
}
