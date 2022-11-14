package EsempiLibro;
import prog.io.*;


public class SequenzaFrazioni {
        
    public static void main (String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int MAX = 10;
        Frazione[] frazioni = new Frazione[MAX];

        for(int pos = 0; pos < MAX; pos++) {
            out.println("Lettura della frazione " + (pos + 1));
            int num = in.readInt("Numeratore? ");
            int den = in.readInt("Denomintore? ");
            frazioni[pos] = new Frazione(num, den);

        }
        for(int pos = 0; pos < frazioni.length; pos++) {
            out.println(frazioni[pos].toString());
        }
    }
}
