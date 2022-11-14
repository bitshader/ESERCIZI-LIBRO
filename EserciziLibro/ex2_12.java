package EserciziLibro;


import prog.io.*;
import prog.utili.Intero;

public class ex2_12 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s = in.readLine("Stringa: ");
        Intero I1 = new Intero(s.length());
        String s2 = I1.toString();
        

        out.println("La lunghezza della stringa " + "\"" + s + "\"" + " e' " + s.length());
        out.println("La lunghezza della stringa " + "\"" + I1.toString() + "\"" + " e' " + s2.length());
        out.println("La lunghezza della stringa " + "\"" + s.length() + "\"" + " e' " + 1);
        
    }    
}
