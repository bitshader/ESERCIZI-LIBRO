import prog.io.*;

public class ExQuattroPuntoCinque {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        String s1 = in.readLine("Inserisci la prima stringa --> ");
        String s2 = in.readLine("Inserisci la seconda stringa --> ");

        int na = 0;
        char c;

        out.println(s1.length() + s2.length());
        
        if(s1.length() > s2.length())
            out.println(s1);
        else {
            out.println(s2);
        }

        for (int i = 0; i < s1.length(); i++ ) {
            c = s1.charAt(i);
            if(c == 'a' || c == 'A')
                na++;  
        }
        out.println(na);


    
    
    
    
    }    
}