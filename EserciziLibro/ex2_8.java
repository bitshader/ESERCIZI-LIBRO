package EserciziLibro;


import prog.io.*;
import prog.utili.Frazione;

public class ex2_8 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        //lettura prima frazione
        int num = in.readInt("Numeratore prima frazione: ");
        int den = in.readInt("Denominatore prima frazione: ");
        Frazione f1 = new Frazione(num, den);

        //lettura seconda frazione
        num = in.readInt("Numeratore seconda frazione: ");
        den = in.readInt("Denominatore seconda frazione: ");
        Frazione f2 = new Frazione(num, den);

        //somma,diff,prod,quoz
        Frazione somma = f1.piu(f2);
        Frazione diff = f1.meno(f2);
        Frazione prod = f1.per(f2);
        Frazione quoz = f1.diviso(f2);
        
        //comunicazione
        out.println("La somma tra " + f1.toString() + " e " + f2.toString() + " e' " + somma.toString());
        out.println("La differenza tra " + f1.toString() + " e " + f2.toString() + " e' " + diff.toString());
        out.println("Il prodotto tra " + f1.toString() + " e " + f2.toString() + " e' " + prod.toString());
        out.println("Il quoziente tra " + f1.toString() + " e " + f2.toString() + " e' " + quoz.toString());  
    
    }
}
