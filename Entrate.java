import prog.io.*;
import prog.utili.Importo;
import prog.utili.MeseDellAnno;

public class Entrate {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int NMESI = MeseDellAnno.values().length;
        final int NGIORNI = 365;
        Importo[] entrate = new Importo[NMESI];
        
        for(MeseDellAnno mese : MeseDellAnno.values()) {
            out.println("Entrate di " + mese + ":");
            int euro = in.readInt("euro?");
            int cent = in.readInt("centesimi?");
            Importo imp = new Importo(euro,cent);
            
            entrate[mese.ordinal()] = imp;

        }

        Importo somma = new Importo(0);
        for(Importo imp : entrate)
            somma = somma.piu(imp);

        Importo mediaMensile = somma.diviso(NMESI);
        Importo mediaGiornaliera = somma.diviso(NGIORNI);

        out.println("Entrate medie mensili: EURO " + mediaMensile);
        out.println("Entrate medie giornaliere: EURO " + mediaGiornaliera);
        out.println();

        out.println("Entrate medie giornaliere per ciascun mese: ");
        for(MeseDellAnno mese : MeseDellAnno.values()) {
            Importo entrataMese = entrate[mese.ordinal()];
            int giorniMese = mese.numeroGiorni();
            Importo mediaGiornalieraMese = entrataMese.diviso(giorniMese);
            out.println(mese + ":EURO " );
            out.println(mediaGiornalieraMese);

        }

    }
}
