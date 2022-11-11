import prog.io.*;

public class Uguali {
    
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        int n, d;

        out.println("Inserire i dati della prima frazione");
        n = in.readInt("Numeratore? ");
        d = in.readInt("Denominatore? ");
        Frazione f1 = new Frazione(n, d);

        out.println("Inserire i dati della seconda frazione");
        n = in.readInt("Numeratore? ");
        d = in.readInt("Denominatore? ");
        Frazione f2 = new Frazione(n ,d);

        if(f1.equals(f2))
            out.println("Le due frazioni sono uguali");
        else
            out.println("Le due frazioni sono diverse");
    
    
    
    }

}
