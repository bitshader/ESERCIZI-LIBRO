import prog.io.*;

public class Cornice {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //Righe per la costruzione della cornice
        String rigaAsterischi = "******************************************";
        String rigaBianca = "                                              ";
        String frase = in.readLine("Inserisci una frase di max 20 caratteri: ");
        int lunghezza = frase.length();


        //costruzione 
        String rigaCornice = rigaAsterischi.substring(0, lunghezza + 4);
        String spazi = rigaBianca.substring(0, lunghezza + 2);
        String rigaIntermedia = "*" + spazi + "*";
        String rigaTesto = "* " + frase + " *";
        
        //visualizzazione
        out.println(rigaCornice);
        out.println(rigaIntermedia);
        out.println(rigaTesto);
        out.println(rigaIntermedia);
        out.println(rigaCornice);
    }
}
