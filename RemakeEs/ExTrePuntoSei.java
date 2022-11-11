package RemakeEs;

import prog.io.*;
import prog.utili.*;

public class ExTrePuntoSei {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int eur1 = in.readInt("Euro primo importo ");
        int cent1 = in.readInt("Cent primo importo ");
        Importo Num1 = new Importo(eur1, cent1);

        int eur2 = in.readInt("Euro secondo importo ");
        int cent2 = in.readInt("Cent secondo importo ");
        Importo Num2 = new Importo(eur2, cent2);


        
        Importo somma = Num1.piu(Num2);
        Importo media = somma.diviso(2);
        Importo differenza = new Importo(0);

        if(Num1.isMaggiore(Num2)) {
             differenza = Num1.meno(Num2);
        }else {
             differenza = Num2.meno(Num1);
        }
        
        out.println("La Loro somma e' " + somma);
        out.println("La loro media e' " + media);
        out.println("La loro differenza e' " + differenza);
    }
}
