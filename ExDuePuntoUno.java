import prog.io.*;
import prog.utili.Frazione;

public class ExDuePuntoUno {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //leggi la prima frazione
        int num = in.readInt("Numeratore prima frazione? ");
        int den = in.readInt("Denominatore prima frazione? ");
        Frazione f1 = new Frazione(num,den);

        //Leggi la seconda frazione
        num = in.readInt("Numeratore seconda frazione? ");
        den = in.readInt("Denominatore seconda frazione? ");
        Frazione f2 = new Frazione(num,den);

        //Calcolo somma
        Frazione somma = f1.piu(f2);

        //comunicazione
        out.print("La somma di " + f1.toString());
        out.print(" e " + f2.toString());
        out.println("e' " + somma.toString());

    }
}