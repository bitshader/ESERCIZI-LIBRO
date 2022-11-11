import prog.io.*;


public class ContaMinuscole {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s = in.readLine("Inserire la stringa da esaminare ");

        int nMinuscole = 0;
        for( int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
            nMinuscole++;
        }

        out.print("La stringa " + s + " contiene ");
        out.println(nMinuscole + " lettere minuscole");
    }    
}
