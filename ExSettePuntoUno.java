

import prog.io.*;

public class ExSettePuntoUno {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int dividendo = in.readInt("Dividendo? ");
        int divisore = in.readInt("Divisore? ");
        
        try{
            int quoziente = dividendo/divisore;
            out.println("Il quoziente e' " + quoziente);
        } catch (java.lang.ArithmeticException e) {
            out.println("Inserire un divisore diverso da 0 ");
        }
    }
}        
