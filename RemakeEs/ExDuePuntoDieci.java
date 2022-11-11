package RemakeEs;

import prog.io.*;
import prog.utili.Frazione;

public class ExDuePuntoDieci {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        String s1 = in.readLine("Inserire la prima stringa: ");
        String s2 = in.readLine("Inserire la seconda stringa: ");

        int l1 = s1.length();
        int l2 = s2.length();
        Frazione media = new Frazione(l1, l2);
        
        out.println("La lunghezza della prima stringa e':" + l1 );
        out.println("La lunghezza della seconda stringa e':" + l2 );
        out.println("La media delle due lunghezze e': " + media.toString());
    }
}
