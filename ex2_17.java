

import prog.io.*;
import prog.utili.*;

public class ex2_17 {
    
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
        
        out.println("IMPORTO" + "               " + importo);
        out.println("SCONTO " + percentualedisconto + "%" + "              " + scontoefettivo);
        out.println("DA PAGARE" + "        " + "EURO " + prezzoscontato);  
        out.println("               " + "(Lire " + prezzoscontato.toLire() + ")");
    
    
    }    
}
