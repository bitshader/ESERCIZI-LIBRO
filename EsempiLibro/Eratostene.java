package EsempiLibro;
import prog.io.*;

public class Eratostene {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        boolean[] primi;

        out.println("*** Calcolo numeri primi ***");
        out.println();
        int nMax = in.readInt("Massimo numero da considerare? ");

        primi = new boolean[nMax + 1];
        for (int x = 2; x < nMax; x++)
            primi[x] = true;

        for (int numero = 2; numero <= nMax; numero++)
            if (primi[numero])
                for (int multiplo = numero * 2; multiplo <= nMax; multiplo += numero)
                    primi[multiplo] = false;
        
        out.println("I numeri primi fino a " + nMax + " sono: ");
        for (int numero = 2; numero <= nMax; numero++)
            if (primi[numero])
                out.println(numero);
    
    }    
}
