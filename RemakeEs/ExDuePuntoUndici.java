package RemakeEs;

import prog.io.*;
import prog.utili.Intero;

public class ExDuePuntoUndici {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num1 = in.readInt("Primo addendo: ");
        Intero add1 = new Intero(num1);

        int num2 = in.readInt("Secondo addendo: ");
        Intero add2 = new Intero(num2);

        int som = num1 + num2;
        Intero somma = new Intero(som);

        out.println(num1 + " + " + num2 + " = " + som );
        out.println(add1.toString() + " + " + add2.toString() + " = " + somma.toString());

    }    
}
