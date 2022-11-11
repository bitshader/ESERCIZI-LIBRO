import prog.io.*;
import prog.utili.Frazione;

public class ExDuePuntoDieci {
    
    public static void main(String[] args){
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s1 = in.readLine("La prima stringa e': ");
        String s2 = in.readLine("La seconda stringa e': ");
        int num = s1.length() + s2.length();
        int den = 2;
        Frazione m = new Frazione(num, den);

        out.println("La lunghezza di " + s1 + " e': " + s1.length());
        out.println("La lunghezza di " + s2 + " e': " + s2.length());
        out.println("La media delle loro lunghezze e': " + m);
    }
}

