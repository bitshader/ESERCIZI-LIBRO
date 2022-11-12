

import prog.io.*;

public class ExDuePuntoDue {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //leggere i due numeri 
        int num1 = in.readInt("Inserire il primo numero: ");
        int num2 = in.readInt("Inserire il secondo numero: ");

        //calcolo della somma
        int somma = num1 + num2;

        //comunicazione
        out.print("La somma di " + num1);
        out.print(" e " + num2);
        out.print(" e' " + somma);
    
    }
}