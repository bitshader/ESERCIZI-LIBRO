import prog.io.*;

public class Mistero {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int x = in.readInt("Inserire il primo numero: ");
        int y = in.readInt("Inserire il secondo numero: ");
        int z = 100;

        if (x==1) if (y==1) z = x + y; else z = y - x;
        out.println("Il risultato e' " + z);
    }
}    
