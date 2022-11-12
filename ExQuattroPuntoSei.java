

import prog.io.*;

public class ExQuattroPuntoSei {

    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s = in.readLine("Stringa? ");

        out.println(s.toUpperCase());
        int i;
        for(i = 0; i <= s.length(); i++){
            out.print("-");
        }
        out.println();
        char c;
        int nm = 0;
        for(i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(Character.isLowerCase(c)){
                nm++;
        }
        }
        out.println(nm);
    }
}
