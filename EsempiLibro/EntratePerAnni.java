
package EsempiLibro;
import prog.io.*;
import prog.utili.*;


public class EntratePerAnni {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int NMESI = MeseDellAnno.values().length;

        int primoAnno, ultimoAnno;
        boolean intervalloScorretto;
        do {
            primoAnno = in.readInt("Primo anno da considerare? ");
            ultimoAnno = in.readInt("Ultimo anno da considerare");
            if(primoAnno > ultimoAnno) {
                intervalloScorretto = true;
                out.println("Attenzione: l'ultimo anno non puo precedere il primo!");
                
            }   else
                intervalloScorretto = false;
            
        }   while(intervalloScorretto);
        final int NANNI = ultimoAnno - primoAnno + 1;

        Importo [] []entrate = new Importo[NANNI] [NMESI];

        for(int anno = primoAnno; anno <= ultimoAnno; anno++)
            for(MeseDellAnno mese : MeseDellAnno.values()) {
                out.println("Entrate di " + mese + " " + anno + ":");
                int euro = in.readInt(" euro? " );
                int cent = in.readInt(" centesimi? ");
                Importo imp = new Importo(euro, cent);

                entrate[anno - primoAnno] [mese.ordinal()] = imp;

            }

        for(int anno = primoAnno; anno <= ultimoAnno; anno++) {
            Importo somma = new Importo(0);
        for(Importo imp : entrate[anno - primoAnno])
            somma = somma.piu(imp);
        Importo media = somma.diviso(NMESI);
        out.print("Entrate medie mensili anno " + anno);
        out.println(": EURO " + media);
        }

        for(MeseDellAnno mese : MeseDellAnno.values()) {
            Importo somma = new Importo(0);
            for(int anno = primoAnno; anno <= ultimoAnno; anno++)
                somma = somma.piu(entrate[anno - primoAnno] [mese.ordinal()]);
            Importo media = somma.diviso(NANNI);
            out.print("Entrate medie nei mesi di " + mese);
            out.println(": EURO " + media);

        }
    }
}
