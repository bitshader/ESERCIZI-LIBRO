package EsempiLibro;
/*import java.util.ArrayList;

import prog.io.*;
import prog.utili.Frazione;

public class comparaSequenze {

    public static void main (String[] args) {
        
    ConsoleInputManager in =new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();

    double d;
    Frazione f;
    int k;

    ArrayList<Double> A  = new ArrayList<Double>();
    ArrayList<Frazione> B = new ArrayList<Frazione>();
    out.println("Inserire una lista di numeri: ");
       
    while((d = in.readDouble()) != 0)
        A.add(d);
    out.println("Inserisci le frazioni: ");
    do {
        f = new Frazione(in.readInt("Numeratore: "), in.readInt("Denominatore: "));
        if(!isMinore(new Frazione(0)))
        B.add(f);
    } while (!f.isMinore(new Frazione(0)));

    if(A.size() > 0 && B.size() > 0) {
        for(Frazione f : B) {
            k = 0;
            for(double d : A)
                if((double) f.getNumeratore()/f.getDenominatore() > d)
                k++;
            if(k> A.size()/2)
                out.println(f);
        }
    }
    else 
        out.println("almeno una delle due sequenza e vuota");
}

    private static boolean isMinore(Frazione frazione) {
        return false;
    }
}*/