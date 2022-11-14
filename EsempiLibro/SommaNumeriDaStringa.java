package EsempiLibro;
import prog.io.*;
import java.util.*;

public class SommaNumeriDaStringa {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
    String sequenza = in.readLine("Inserire la sequenza di numeri " + "interi separati da spazio: ");
    StringTokenizer stk = new StringTokenizer(sequenza," ");

    int somma = 0;
    while (stk.hasMoreTokens()){
        String token = stk.nextToken();
        somma = somma + Integer.parseInt(token);
        }

        out.println("La somma dei numeri nella sequenza e': " + somma);
    }
}


