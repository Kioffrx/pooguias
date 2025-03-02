package guia1;

public class LecturaParametros {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("Error: Debe haber al menos dos parámetros");
            return;
        }
        System.out.print("Parametro 1: " + args[0]);
        System.out.print("Parametro 1: " + args[1]);
    }
}
