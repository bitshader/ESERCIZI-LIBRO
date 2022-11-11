import prog.io.*;

public class PappagalloStanco {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        do{
            String messaggio = in.readLine();
            String risposta = messaggio.toUpperCase();
            out.print(risposta);
            if (messaggio.equals("stanco"))
                break;

        }   while (true);
    }
}
