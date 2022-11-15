package EserciziLibro;
import EsempiLibro.Quadrato;
import prog.io.*;

public class ex6_15 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        int[] lati = new int[5];
        for (int i = 0; i < lati.length; i++) {
            lati[i] = in.readInt("inserire lato: ");
        }
        Quadrato[] quadrati = new Quadrato[lati.length];
        for (int i = 0; i < quadrati.length; i++) {
            Quadrato quadrato1 = new Quadrato(lati[i]);
            quadrati[i] = quadrato1;
        }
        for (int i = 0; i < quadrati.length; i++) {
            out.println(quadrati[i].toString());
        }

    }

}
