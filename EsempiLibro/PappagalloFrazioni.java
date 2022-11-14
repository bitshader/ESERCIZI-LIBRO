package EsempiLibro;
import prog.io.*;
import prog.utili.Frazione;
import prog.utili.Sequenza;

public class PappagalloFrazioni {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Sequenza<Frazione> frazioni = new Sequenza<Frazione>();

        do {
            out.println("Inserisci la frazione: ");
            int num = in.readInt("Numeratore? ");
            int den = in.readInt("Demominatore? ");
            Frazione f = new Frazione(num,den);
            
            frazioni.add(f);
        }   while(in.readSiNo("Vuoi inserire altre funzioni? (s/n) "));
    
        out.println("Sono state inserite le seguenti frazioni");
        for(Frazione f : frazioni)
            out.println(f);
    }

}