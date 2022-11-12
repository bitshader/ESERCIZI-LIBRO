

import prog.io.*;
//import prog.utili.*;

public class ExTrePuntoQuattro {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s1 = in.readLine("Inserire la prima stringa: ");
        String s2 = in.readLine("Inserire la seconda stringa: ");
        int comp = s1.compareTo(s2);
        

        if (s1.equals(s2)) {
            out.println("Le due stringhe sono uguali");
        }else { 
            out.println("Ordine alfabetico: ");
            if(comp < 0){
                out.println(s1);
                out.println(s2);
            }else {
                out.println(s2);
                out.println(s1);
            }out.println("Ordine di lunghezza");
            if(s1.length() < s2.length()){
                out.println(s1);
                out.println(s2);
            }if(s1.length() > s2.length()) {
                out.println(s2);
                out.println(s1);

            }else {
                out.println("Le due stringhe hanno la stessa lunghezza");
            }

        }
    }    
}
