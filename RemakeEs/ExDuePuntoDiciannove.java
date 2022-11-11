package RemakeEs;

import prog.io.*;
import prog.utili.*;

public class ExDuePuntoDiciannove {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int importoInLire = in.readInt("Inserire l'importo in lire " );

        
        Importo.fromLire(importoInLire);
        
        out.println("L'importo corrispondente in euro e' " + Importo.fromLire(importoInLire));

        
    }   
}
