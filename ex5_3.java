

import prog.io.*;
import prog.utili.Frazione;

import java.util.Arrays;

public class ex5_3 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        int MAX = in.readInt("Quante frazioni vuoi inserire? ");
        Frazione [] frazioni;
        frazioni = new Frazione[MAX];
        for(int i = 0; i < frazioni.length; i ++){
            int num = in.readInt("Numeratore della " + i + " frazione: ");
            int den = in.readInt("Denominatore della " + i + " frazione: ");
            frazioni[i] = new Frazione(num, den);
        }
        Arrays.sort(frazioni);
        out.println("L'array ordinato e': ");
        for(Frazione f : frazioni) {
            out.print(f + " ");
        }
}
}