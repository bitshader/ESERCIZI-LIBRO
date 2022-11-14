package EsempiLibro;
/*

import prog.io.*;
import prog.utili.*;

public class FigureAreaMax {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
    
        Figura rAreaMax = null;
        boolean continuare;

        do {
            Figura r = leggiFigura(in, out);
        
            if(rAreaMax == null || r.haAreaMaggiore(rAreaMax))
                rAreaMax = r;

            continuare = in.readSiNo("Vuoi inserire i dati di un'altra figura?  (s/n) " );

        } while (continuare);

        out.print("La figura di area maggiore e' un " );
        if(rAreaMax instanceof Cerchio)
            out.print("cerchio : ");
        else if (rAreaMax instanceof Quadrato)
            out.print("quadrato : ");
        else 
            out.print("rettangolo : ");
            out.println();
            out.println(" area = " + rAreaMax.getArea() + " , perimetro = " + rAreaMax.getPerimetro());

        
    }   
    
    private static Figura leggiFigura(ConsoleInputManager in, ConsoleOutputManager out) {

        Figura r = null;

        do {
            out.println("  Scegli la figura da inserire: ");
            out.println();
            out.println(" r inserimento di un rettangolo");
            out.println(" q inserimento di un quadrato");
            out.println(" c inserimento di un cerchio");
            char scelta = in.readChar(" scelta? ");
            out.println("");

            switch (scelta) {
                case 'r':
                    out.println("Inserimento di un rettangolo:");
                    double x = in.readDouble("-base? ");
                    double y = in.readDouble("-altezza? ");
                    if (x < 0 || y < 0)
                        out.println("I dati inseriti non rappresentano un rettangolo!");
                    else 
                        r = x == y ? new Quadrato(x) : new Rettangolo(x, y);
                    break;
                
                case 'q' :
                    out.println("Inserimento di un quadrato:");
                    x = in.readDouble("-lato? ");
                    if(x < 0)
                        out.println("Attenzione il lato del quadrato non puo essere negativo!");
                    else
                        r = new Quadrato(x);
                    break;
                
                case 'c' :
                    out.println("Inserimento di un cerchio:");
                    x = in.readDouble("-raggio? ");
                    if (x < 0)
                        out.println("Attenzione il raggio di un cerchio non puo essere negativo!");
                    else
                        r = new Cerchio(x);
                    break;
                
                default : 
                    out.println("Scelta non valida\n\n");
                    break;
            }    
        } while (r == null);

        out.println(" " + r.toString());
        out.println(" area = " + r.getArea() + ", perimetro = " + r.getPerimetro());
        out.println();

        return r;

    }
}
*/
