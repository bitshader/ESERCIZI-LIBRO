import prog.io.*;
import prog.utili.SequenzaOrdinata;

public class PappagalloOrdinato {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        SequenzaOrdinata<String> memo = new SequenzaOrdinata<String>();

        String s = in.readLine("Inserire una stringa ");
        while (!s.equals(""));
            memo.add(s);
            s = in.readLine("Inserire un'altra stringa ");
    
        for(String x : memo)
            out.println(x);
    }
}
