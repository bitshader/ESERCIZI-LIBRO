import prog.io.*;

public class PrelevaCarattere {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        String s = in.readLine("Inserisci una stringa ");
        int indice = in.readInt("Inserisci una posizione ");
        try {
            char x = s.charAt(indice);
            out.println("Il carattere in posizione " + indice + " della stringa " + s + " e' " + x);
        } catch (StringIndexOutOfBoundsException e) {
            out.println("Non esiste alcun carattere in posizione " + indice);
         // out.println(e.toString());
        }
    }
}
