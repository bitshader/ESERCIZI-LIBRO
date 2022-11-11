import prog.io.*;

public class SeqeunzaInteri {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int MAX = 10;
        int[] tabella = new int[MAX];
        
        int pos = 0;
        int x = in.readInt();
        while (x !=0 ) {
            tabella[pos] = x;
            pos++;
            if(pos<MAX)
                x = in.readInt();
        }

        for(int i = 0; i < pos; pos++)
            out.println(tabella[i]);
    }    
}
