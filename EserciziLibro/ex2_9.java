package EserciziLibro;


import prog.io.*;
import prog.utili.Frazione;

public class ex2_9 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Numeratore frazione: ");
        int den = in.readInt("Denominatore frazione: ");
        Frazione f = new Frazione(num, den);

        Frazione quadrato = f.per(f);

        out.println("Il quadrato di " + f.toString() + " e' " + quadrato.toString()); 

    }
}
