import prog.io.*;
import prog.utili.Frazione;

public class ExDuePuntoOtto {

    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //Leggere due frazioni
        int num = in.readInt("Il numeratore della prima frazione e': ");
        int den = in.readInt("Il denominatore della prima frazione e': ");
        Frazione f1 = new Frazione(num, den);
        
        num = in.readInt("Il numeratore della seconda frazione e': ");
        den = in.readInt("Il denominatore della seconda frazione e': ");
        Frazione f2 = new Frazione(num, den);

        //Visualizzarne la somma
        Frazione somma = f1.piu(f2);

        //Differenza
        Frazione differenza = f1.meno(f2);

        //Prodotto
        Frazione prodotto = f1.per(f2);

        //quoziente
        Frazione quoziente = f1.diviso(f2);
        
        //visualizzazione
        out.print("La somma di " + f1.toString() + "e " + f2.toString());
        out.println("e': " + somma.toString());
        out.println("La differenza e': " + differenza.toString());
        out.println("Il prodotto e': " + prodotto.toString());
        out.println("Il quoziente e': " + quoziente.toString());


    }
}
