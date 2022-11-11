import prog.io.*;
import prog.utili.Rettangolo;

public class RettangoloAreaMax {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        Rettangolo rAreaMax = null;
        boolean continuare;

        do {
            Rettangolo r = leggiRettangolo(in, out);

            if(rAreaMax == null || r.haAreaMaggiore(rAreaMax))
                rAreaMax = r;

            continuare = in.readSiNo("Vuoi inserire i dati di un altro rettangolo? (s/n)");
        }   while (continuare);

        out.println("Rettangolo di area maggiore: ");
        out.println(" " + rAreaMax.toString());
        out.println(" area = " + rAreaMax.getArea() + ", perimetro = " + rAreaMax.getPerimetro());
        
    }

    private static Rettangolo leggiRettangolo(ConsoleInputManager in, ConsoleOutputManager out) {

        out.println("Inserisci i dati di un rettangolo: ");
        double x = in.readDouble("-base? ");
        double y = in.readDouble("-altezza? ");
        while(x < 0 || y < 0) {
            out.println("I dati inseriti non rappresentano un rettangolo:");
            out.println("Inserisci i fati di un rettangolo: ");
            x = in.readDouble("-base? ");
            y = in.readDouble("-altezza? ");
        }
        Rettangolo r = new Rettangolo(x, y);
        out.println("Rettangolo: ");
        out.println(" " + r.toString());
        out.println(" area = " + r.getArea() + ", perimetro = " + r.getPerimetro());
        out.println();
        return r;
    }
}
