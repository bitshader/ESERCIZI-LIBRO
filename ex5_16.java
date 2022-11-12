

import prog.io.*;
import prog.utili.*;

public class ex5_16 {
    
    public static void main(String[] args){

        ConsoleInputManager in =new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Sequenza<Integer> numeri = new Sequenza<Integer>();

        int num = in.readInt("Inserisci un numero ");
        while(num != 0) {
            numeri.add(num);
            num = in.readInt("Inserisci il numero seguente: ");
        }
        for(int x : numeri) 
            out.println(x);
    }
}
