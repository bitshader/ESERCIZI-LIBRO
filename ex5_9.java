import prog.io.*;
import prog.utili.Importo;
import prog.utili.MeseDellAnno;;

public class ex5_9 {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int NMESI = 12;
        Importo[] entrate = new Importo[NMESI];
        Importo[] uscite = new Importo[NMESI];

        for (MeseDellAnno mese : MeseDellAnno.values()) {
            out.println("Entrate di " + mese + ":");
            int euro = in.readInt("euro? ");
            int cent = in.readInt("centesimi? ");
            Importo imp = new Importo(euro, cent);

            entrate[mese.ordinal()] = imp;
        }

        for (MeseDellAnno mese : MeseDellAnno.values()) {
            out.println("Uscite di " + mese + ":");
            int euro = in.readInt("euro? ");
            int cent = in.readInt("centesimi? ");
            Importo imp = new Importo(euro, cent);

            uscite[mese.ordinal()] = imp;
        }

        for (int i = 0; i < entrate.length; i++) {
            // MeseDellAnno mese = MeseDellAnno
            // out.print("il saldo di " + mese + "e':");
            out.println(MeseDellAnno.getMese(i+1) + ": " + entrate[i].meno(uscite[i]));
        }
    }

}
