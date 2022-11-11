package RemakeEs;

import prog.io.*;
import prog.utili.*;

public class ExTrePuntoCinque {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        int num = in.readInt("Inserire il numero ");
        Intero Num = new Intero(num);
        String LsI = Num.toString();
        
        if(LsI.length() == (num/2)){
            out.println("La lunghezza della parola " + LsI + " e' " + LsI.length() + ", ugalue alla meta' di " + num );
        } else {
            out.println("La lunghezza della parola " + LsI + " e' " + LsI.length() + ", mentre la meta' di " + num + " e' " + num/2);
        }
    
    }
}
