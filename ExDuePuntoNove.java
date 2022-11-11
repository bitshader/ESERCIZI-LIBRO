import prog.io.*;
import prog.utili.Frazione;

public class ExDuePuntoNove {
    
    public static void main(String[] args){
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Il numeratore e': ");
        int den = in.readInt("Il denominatore e': ");
        Frazione f = new Frazione(num, den);

        Frazione f2 = f.per(f);
        out.println(f2);


    }    
}
