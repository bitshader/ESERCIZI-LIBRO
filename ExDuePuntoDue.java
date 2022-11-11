import prog.io.*;

public class ExDuePuntoDue {
    
    public static void main(String[] args){
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();

        //leggi i due numeri
        int num1 = in.readInt("Primo numero? ");
        int num2 = in.readInt("Secondo numero? ");

        //Calcolo della somma
        int somma = num1 + num2;

        //comunicazione
        out.print("La somma di " + num1);
        out.print(" e " + num2);
        out.print(" e' " + somma);
    
    }    
}
