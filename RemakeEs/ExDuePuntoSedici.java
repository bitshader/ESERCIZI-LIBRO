package RemakeEs;

import prog.io.*;
import prog.utili.*;

public class ExDuePuntoSedici {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int euro = in.readInt("Prezzo : euro? ");
        int cent = in.readInt("cent? ");
        int percentualedisconto = in.readInt("Sconto percentuale? ");
        
        Importo importo = new Importo(euro, cent);

        Importo scontocento = importo.per(percentualedisconto) ;
        Importo scontoefettivo = scontocento.diviso(100);
        Importo prezzoscontato = importo.meno(scontoefettivo);
        
        out.println("Prezzo: EURO " + importo);
        out.println("Sconto: EURO " + scontoefettivo);
        out.println("Prezzo scontato: EURO " + prezzoscontato + " (Lire " + prezzoscontato.toLire() + ")");
    
    
    }    
}