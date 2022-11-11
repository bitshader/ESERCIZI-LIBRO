import prog.io.*;
import prog.utili.Intero;

public class ExDuePuntoUndici {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();


        int a = in.readInt("Primo addendo? ");
        int b = in.readInt("Secondo addendo? ");
        int somma = a + b;

        Intero c = new Intero(a);
        Intero d = new Intero(b);
        Intero s = new Intero(somma);


        out.print(c.intValue());
        out.print(" + ");
        out.print(d.intValue());
        out.print(" = ");
        out.println(s.intValue());
        out.print(c.toString());
        out.print(" + ");
        out.print(d.toString());
        out.print(" = ");
        out.println(s.toString());




    }
}
