

import prog.io.*;
import prog.utili.*;

public class ExDUePuntoTredici {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Numeratore frazione? ");
        int den = in.readInt("Denominatore frazione? ");
        Intero Num = new Intero(num);
        Intero Den = new Intero(den);
        String s = Den.toString();

        //Frazione f = new Frazione(num,den);
        out.println(Num.toString() + "/" + s.toUpperCase());

    }    
}
