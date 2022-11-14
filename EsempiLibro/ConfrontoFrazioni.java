
package EsempiLibro;
import prog.io.*;




public class ConfrontoFrazioni {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Inserisci numeratore prima frazione: ");
        int den = in.readInt("Inseriscie denominatore seconda frazione: ");
        Frazione f1 = new Frazione(num, den);

        num = in.readInt("Inseriscie numeratore seconda frazione: ");
        den = in.readInt("Inserisci denominatore seconda frazione: ");
        Frazione f2 = new Frazione(num, den);

        if(f1.equals(f2))
            out.println("Le due frazioni sono uguali");
        else
            out.println("Le due frazioni sono diverse");
        

    }

}
