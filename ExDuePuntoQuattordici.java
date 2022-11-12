

import prog.io.*;
import prog.utili.*;

public class ExDuePuntoQuattordici {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Frazione f = new Frazione(2,1);

        int num = in.readInt("Numeratore prima frazione? ");
        int den = in.readInt("Denominatore prima frazione? ");
        Frazione f1 = new Frazione(num, den);

        num = in.readInt("Numeratore seconda frazione? ");
        den = in.readInt("Denominatore seconda frazione? ");
        Frazione f2 = new Frazione(num, den);

        Frazione media = f1.piu(f2);
        Frazione Media = media.diviso(f);

        int numf = Media.getNumeratore();
        int denf = Media.getDenominatore();
        Intero Num = new Intero(numf);
        Intero Den = new Intero(denf);
        String s = Den.toString();


        out.println("La media delle due frazioni e' " + Media);
        out.println("La media delle due frazioni e' " + Num.toString() + "/" + s.toUpperCase());


        
    }    
}
