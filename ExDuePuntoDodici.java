import prog.io.*;
import prog.utili.*;


public class ExDuePuntoDodici{

    public static void main(String[] args){
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        String s = in.readLine("Stringa? ");
        Intero uno = new Intero(s.length());
        
        //String s2 = 
        

        out.print("La lunghezza della stringa " + "\"" + s + "\"");
        out.print(" e' " + s.length() );
        out.println(" (" + uno.toString() + ")");

        out.print("La lunghezza della stringa " + "\"" + uno.toString() + "\"");
        //out.print(" e' " + s2.length());
        //out.println(" (" + uno.toString() + ")");

        
    
        
    
    
    
    }   
}
