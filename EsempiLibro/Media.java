package EsempiLibro;
import prog.io.*;

public class Media {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        int x, y, z;
        double media;

        x = in.readInt("Inserire il primo numero: ");
        y = in.readInt("Inserire il secondo numero: ");
        z = in.readInt("Inserire il terzo numero: ");

        media = (x + y + z) / 3;

        out.println("La media e' " + media);

    
    
    
    }

}
