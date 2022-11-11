import prog.io.*;
//import prog.utili.*;

public class StringaMinima {

    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String minima = null;

        String s = in.readLine("Prossima stringa? ");
        while (!s.equals("")) {
            if (minima == null || s.compareTo(minima) < 0)
            minima = s;

            s = in.readLine("Prossima stringa? ");
        }

        if (minima == null)
            out.println("Non e' staata inserita alcuna stringa! ");
        else{
            out.println("La stringa minima in ordine lessicografico e' " + minima.toString());
        }
    }    

    
}
