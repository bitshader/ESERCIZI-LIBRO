

import prog.io.*;
import prog.utili.*;

public class ExSeiPuntoUno {
    
    public static void main(String[] args) {
    
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    
    Figura rAreaMax = null;
    boolean continuare;
    do {
        Figura r = leggiFigura(in, out);
        if (rAreaMax == null || r.haAreaMaggiore(rAreaMax))
        rAreaMax = r;
        continuare = in.readSiNo("Vuoi inserire i dati di un'altra " +  "figura? (s/n) ");
    } while (continuare);

    out.print("La figura di area maggiore `e un ");
    if (rAreaMax instanceof Cerchio)
        out.print("cerchio: ");
    else if (rAreaMax instanceof Quadrato)
        out.print("quadrato: ");
    else if (rAreaMax instanceof Rettangolo)
        out.print("rettangolo: ");
    else 
        out.print("triangolo : ");
    out.println();
    out.println(" " + rAreaMax.toString());
    out.println(" area = " + rAreaMax.getArea() +   ", perimetro = " + rAreaMax.getPerimetro());
}

private static Figura leggiFigura(ConsoleInputManager in, ConsoleOutputManager out) {
    Figura r = null;
    do {

        out.println(" Scegli la figura da inserire: ");
        out.println();
        out.println(" r Inserimento di un rettangolo");
        out.println(" q Inserimento di un quadrato");
        out.println(" c Inserimento di un cerchio");
        out.println(" t Inserimento di un triangolo");
        out.println();
        char scelta = in.readChar(" Scelta? ");
        out.println("");

        switch (scelta) {
        case 'r':
            out.println("Inserimento di un rettangolo:");
            double x = in.readDouble(" - base? ");
            double y = in.readDouble(" - altezza? ");
            if (x < 0 || y < 0)
                out.println("I dati inseriti non rappresentano " + "un rettangolo");
            else
                r = x == y ? new Quadrato(x) : new Rettangolo(x, y);
            break;
        case 'q':
            out.println("Inserimento di un quadrato:");
            x = in.readDouble(" - lato? ");
            if (x < 0)
                out.println("Attenzione: il lato di un quadrato " + "non pu`o essere negativo!");
            else
                r = new Quadrato(x);
            break;
        case 'c':
            out.println("Inserimento di un cerchio");
            x = in.readDouble(" - raggio? ");
            if (x < 0)
                out.println("Attenzione: il raggio di un cerchio " + "non pu`o essere negativo!");
            else
                r = new Cerchio(x);
            break;
        case 't':
            out.println("Inserimento di un triangolo");
            x = in.readDouble(" - base? ");
            y = in.readDouble(" - latoSinistro ? ");
            double z = in.readDouble(" - angoloCompreso? ");
            if(x < 0 || y < 0)
                out.println("I dati inseriti non rappresentano un triangolo!");
            else
                r = new Triangolo(x, y, z);
            break;
        
        default:
            out.println(" Scelta non valida\n\n");
            break;
        }
} while (r == null);
    out.println(" " + r.toString());
    out.println(" area = " + r.getArea() + ", perimetro = " + r.getPerimetro());
    out.println();
    return r;
}
}

