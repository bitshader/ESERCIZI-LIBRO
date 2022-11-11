import prog.io.*;
import prog.utili.Sequenza;

public class PappagalloConMemoria {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //predisposizione della "memoria"
        Sequenza<String> memo = new Sequenza<String>();

        String s = in.readLine();
        while (!s.equals("")) {
            memo.add(s);
            s = in.readLine();
        }

        for(String x : memo) 
            out.println(x);
    }
}
