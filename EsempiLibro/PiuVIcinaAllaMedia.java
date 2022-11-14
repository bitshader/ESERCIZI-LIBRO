package EsempiLibro;
import prog.io.*;
import prog.utili.Frazione;

public class PiuVIcinaAllaMedia {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int MAX = in.readInt("quante frazioni vuoi inserire?");

        if(MAX != 0) {
            Frazione[] frazioni = new Frazione[MAX];
            Frazione somma = new Frazione(0), media;
            
            for(int pos = 0; pos < MAX; pos++) {
                out.println("Lettura della frazione " + (pos + 1));
                int num = in.readInt("Numeratore? ");
                int den = in.readInt("Denominatore? ");
                frazioni[pos] = new Frazione(num, den);
                somma = somma.piu(frazioni[pos]);
            } 
            media = somma.diviso(new Frazione(MAX));

            Frazione piuvicina = null, distanzaPiuVIcina = null, distanzaCorrente;

            for(int pos = 0; pos < frazioni.length; pos++) {
                if(frazioni[pos].isMinore(media))
                    distanzaCorrente = media.meno(frazioni[pos]);
                else 
                    distanzaCorrente = frazioni[pos].meno(media);
                
                if (distanzaPiuVIcina == null || distanzaCorrente.isMinore(distanzaPiuVIcina)) {
                    piuvicina = frazioni[pos];
                    distanzaPiuVIcina = distanzaCorrente;
                }
            }

            out.println("La media e' " + media.toString());
            out.println("La frazione piu vicina alla media e' " + piuvicina);
            out.println("La sua distanza dalla media e' " + distanzaPiuVIcina);

        }
    }   
}
