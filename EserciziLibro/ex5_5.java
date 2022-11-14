package EserciziLibro;

import prog.io.*;

public class ex5_5 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int MAX = 10;
        int[] sequenza = new int[MAX];

        int pos = 0;
        int n = 0;
        do {
            n = in.readInt("inserisci un numero: ");

            sequenza[pos] = n;
            pos++;
            if (pos >= MAX) {
                MAX = MAX * 2;
                int[] sequenza2 = new int[MAX];
                for (int i = 0; i < sequenza.length; i++) {
                    sequenza2[i] = sequenza[i];
                }
                sequenza = sequenza2;
            }
        } while (n != 0);
        // int[] sequenza = {1,5,7,3,1,5,7};
        // int[] sequenza = new int[];

        for (int i = 0; i < sequenza.length; i++) {
            for (int j = i + 1; j < sequenza.length; j++) {

                if (sequenza[i] > sequenza[j]) {
                    int temp = sequenza[i];
                    sequenza[i] = sequenza[j];
                    sequenza[j] = temp;
                }
            }
        }
        for (int i = 0; i < sequenza.length; i++) {
            out.print(sequenza[i] + " ");
        }

    }
}
