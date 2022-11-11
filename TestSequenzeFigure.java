import prog.io.*;
import prog.utili.Sequenza;
import prog.utili.Quadrato;
import prog.utili.Cerchio;
import prog.utili.Figura;

class TestSequenzeFigure {
    public static void main(String[] args) {
//predisposizione dei canali di comunicazione
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
//scelta del tipo di sequenza da trattare
        out.println("Scelte disponibili:");
        out.println(" c = sequenza di cerchi ");
        out.println(" q = sequenza di quadrati ");
        char scelta = in.readChar("scelta (c|q)? ");
        while (scelta != 'c' && scelta != 'q') {
            out.println("scelta non valida: ripetere l’inserimento");
            scelta = in.readChar("scelta (c|q)? ");
        }
        //riferirsi alla sequenza
        Sequenza<? extends Figura> seq = null;
//lettura della sequenza
        switch (scelta) {
            case 'c':
            Sequenza<Cerchio> sc = new Sequenza<Cerchio>();
            double r;
            while ((r = in.readDouble("Inserire la lunghezza del raggio" +
                                        " (0 per terminare) ")) != 0)
                sc.add(new Cerchio(r));
                seq = sc;
            break;
            case 'q':
            Sequenza<Quadrato> sq = new Sequenza<Quadrato>();
            int l;
            while ((l = in.readInt("Inserire la lunghezza del lato" +
                                        " (0 per terminare) ")) != 0)
                sq.add(new Quadrato(l));
                seq = sq;
            break;
        }
//stampa della sequenza
            for (Figura f : seq)
                out.println(f.getArea());
    }
}

