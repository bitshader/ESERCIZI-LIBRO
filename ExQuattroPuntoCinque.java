

import prog.io.*;

public class ExQuattroPuntoCinque {

    public static void main(String[] args ) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s1 = in.readLine("Prima stringa? ");
        String s2 = in.readLine("Seconda stringa? ");

        out.println(s1.length() + s2.length());
        
        if(s1.length() > s2.length()) {
            out.println(s1);

        } else {
            out.println(s2);
        }
        char c;
        int na = 0;
        int i;
        for (i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            if(c == 'a' || c == 'A')
                na++;
        }
        out.println(na);
    }
}
