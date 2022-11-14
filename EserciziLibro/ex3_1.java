package EserciziLibro;
import EsempiLibro.Frazione;
import prog.io.*;

public class ex3_1 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Numeratore prima frazione? ");
        int den = in.readInt("Denominatore seconda frazione? ");
        Frazione f1 = new Frazione(num, den);

        num = in.readInt("Numeratore seconda frazione? ");
        den = in.readInt("Denominatore seconda frazione? ");
        Frazione f2 = new Frazione(num, den);

        if(f1.isMinore(f2)){
            out.println(f1 + " , " + f2 );
        }else 
            out.println(f2 + " , " + f1);

        
    }
}
