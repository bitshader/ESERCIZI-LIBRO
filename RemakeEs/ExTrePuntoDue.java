package RemakeEs;

import prog.io.*;
//import prog.utili.*;

public class ExTrePuntoDue {
 
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String nome = in.readLine("Inserisci il tuo nome ");
        String cognome = in.readLine("Inserisci il tuo cognome ");

        out.println("**********");
        out.println("*" + "        " + "*");
        out.println("* " + nome + " *");
        out.println("*" + "        " + "*");
        out.println("* " + cognome + " *");
        out.println("**********");

    }   
}
