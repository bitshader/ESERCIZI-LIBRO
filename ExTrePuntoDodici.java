
import prog.io.*;
//import prog.utili.*;

public class ExTrePuntoDodici {

    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String pariminima = null;
        
        String s = in.readLine("Prossima stringa? ");
        int r = s.length()/2;
        while (!s.equals("") && (r != 0 )) {
            if (pariminima == null || s.compareTo(pariminima) < 0)
            pariminima = s;

            s = in.readLine("Prossima stringa? ");
        }

        if (pariminima == null)
            out.println("Non e' staata inserita alcuna stringa! ");
        else{
            out.println("La stringa minima in ordine lessicografico e' " + pariminima.toString());
        }
    }    

    
}


