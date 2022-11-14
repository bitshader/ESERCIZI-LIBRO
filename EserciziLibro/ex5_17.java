package EserciziLibro;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ex5_17 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int MAX = 10;
        int[] sequenza = new int[MAX];
        int pos = 0;
        int n = 0;
        do {
            n = in.readInt("Inserisci un numero: ");
            sequenza[pos] = n;
            pos++;
            if (pos >= MAX) {
                MAX = MAX * 2;
                int[] sequenza2 = new int[MAX];
                for (int i = 0; i < sequenza.length; i++) {
                    sequenza2[i] = sequenza[i];
                }
                sequenza = sequenza2;
            }
        } while (n != 0);

        int somma = 0;
        for (int i = 0; i < sequenza.length; i++) {
            somma = somma + sequenza[i];
        }
        int ntot = 0;
        for (int i = 0; i < sequenza.length; i++) {
            if (sequenza[i] > 0) {
                ntot++;
            }
        }

        float media = (float) somma / ntot;
        out.println("La media e': " + media);

        int nmag = 0;
        int nmin = 0;
        for (int i = 0; i < sequenza.length; i++) {
            if (sequenza[i] > media) {
                nmag++;
            } else if (sequenza[i] < media && sequenza[i] > 0) {
                nmin++;
            }
        }
        out.println("Il numero di numeri maggiori rispetto alla media e':  " + nmag);
        out.println("Il numero di numeri minori rispetto alla media e' : " + nmin);

    }
}
