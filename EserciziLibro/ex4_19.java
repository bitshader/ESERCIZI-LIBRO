package EserciziLibro;


import prog.io.*;
import prog.utili.*;

public class ex4_19 {
    
    public static void main(String [] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int g = in.readInt("Inserisci il giorno della tua data di nascita ");
        int m = in.readInt("Inserisci il mese della tua data di nascita ");
        int a = in.readInt("Inserisci l'anno della tua data di nascita ");

        Data d = new Data(g, m, a);
        Data oggi = new Data();
        int diff = d.quantoManca(oggi);
        out.println("Data di nascita " + d);
        out.println("Data odierna: " + oggi);
        out.println("Differenza rispetto a oggi: " + diff +" giorni"); 
          
    }
}
