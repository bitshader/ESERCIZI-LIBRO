package EserciziLibro;


import prog.io.*;
import prog.utili.*;

public class ex2_15 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int euro1 = in.readInt("Euro primo prezzo? ");
        int cent1 = in.readInt("Centesimi primo prezzo? ");
        Importo prezzo1 = new Importo(euro1, cent1);

        int euro2 = in.readInt("Euro secondo prezzo? " );
        int cent2 = in.readInt("Centesimi secondo prezzo? ");
        Importo prezzo2 = new Importo(euro2, cent2);

        Importo somma = prezzo1.piu(prezzo2);

        out.println("La somma dei due prezzi e' " + somma.getEuro() + " e " + somma.getCent() +  " euro");
        out.println("e " + somma.toLire() + " lire");

    }    
}
