package EsempiLibro;
import prog.io.*;

public class Pappagallo {
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String messaggio = in.readLine("Inserisci un messaggio: " );
        String risposta = messaggio.toUpperCase();

        out.println(risposta);
    }
}
