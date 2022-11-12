import prog.io.*;

public class ExCinquePuntoQuattro {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int MAX = 10;
        int[] tabella = new int[MAX];

        int pos = 0;
        int n = in.readInt("Inserire un numero ");
        while (n != 0) {
            tabella[pos] = n;
            pos++;
            if (pos >= MAX) {
                MAX = MAX * 2;
                int[] tabella2 = new int[MAX];
                for (int i = 0; i < tabella.length; i++) {
                    tabella2[i] = tabella[i];
                } 
                tabella = tabella2;
            }
            n = in.readInt("Inserire un altro numero o 0 per fermare ");
        }

        for (int i = 0; i < pos; i++) {
            out.print(tabella[i]+" ");
        }
    }
}