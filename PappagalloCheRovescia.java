import prog.io.*;
import java.util.ArrayList;

public class PappagalloCheRovescia {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        ArrayList<String> memo = new ArrayList<String>();

        String s = in.readLine("Inserisci una stringa ");
        while (!s.equals("")) {
            memo.add(s);
            s = in.readLine("Inserisci un'altra stringa ");
        } 

        out.println("Sequenza inserita: ");
        for(String x : memo)
            out.println(x);

        out.println("Sequenza al rovescio: ");
        for(int i = memo.size() - 1; i >= 0; i--)
            out.println(memo.get(i));
    }
} 
