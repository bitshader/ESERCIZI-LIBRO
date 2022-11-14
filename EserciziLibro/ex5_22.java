package EserciziLibro;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.*;

public class ex5_22 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int n = in.readInt("Inserire un numero ");
        SequenzaOrdinata<String> sequenzaOrdinata = new SequenzaOrdinata<String>();

        int numero = 1;
        
        while(numero <= n) {
            Intero i = new Intero(numero);
            sequenzaOrdinata.add(i.toString());
            numero++;
        }

        out.println(sequenzaOrdinata);


    }
}
