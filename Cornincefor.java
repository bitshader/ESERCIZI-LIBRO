import prog.io.*;
//import prog.utili.*;


public class Cornincefor {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String frase = in.readLine("Inserisci il tuo nome ");
        int lunghezza = frase.length();

        String rigaCornice = "";
        
            for (int i = 0; i < lunghezza + 6; i = i +1)
                rigaCornice = rigaCornice.concat("*");
        
        String spazi = "";
            for (int i = 0; i < lunghezza + 4; i = i + 1)
                spazi = spazi.concat(" ");
        
        String rigaIntermedia = "*" + spazi + "*";
        String rigaTesto = "* " + frase + "   *";

        out.println(rigaCornice);
        out.println(rigaIntermedia);
        out.println(rigaTesto);
        out.println(rigaIntermedia);
        out.println(rigaCornice);




    }    

}
