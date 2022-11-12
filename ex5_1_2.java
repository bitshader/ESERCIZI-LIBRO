

import prog.io.*;

public class ex5_1_2 {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        char[] lettere = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] parola = in.readLine("Inserire una parola:").toCharArray();
        int[] count = new int[26];

        for (int i = 0; i < parola.length; i++) {
            char lettera = parola[i];
            int j = lettera - 'a';
            //count[j] = count[j] + 1 ;
            count[j] ++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                out.print(lettere[i]);
                out.print('=');
                out.println(count[i]);
            }
        }
    }
}