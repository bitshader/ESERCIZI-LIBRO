package EserciziLibro;


import prog.io.*;
import java.util.Arrays;

public class ex5_2 {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int MAX = in.readInt("Quanti numeri vuoi inserire? ");
        int [] numeri;
        numeri = new int[MAX];
        for(int i = 0; i < numeri.length; i++) {
            numeri[i] = in.readInt("Inserire il numero ");
        }

        Arrays.sort(numeri);
        out.println("L'array ordinato e': ");
        for (int num : numeri) {
            out.print(num + " ");
        }

    }
}
