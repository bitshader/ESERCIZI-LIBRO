import prog.io.*;
import prog.utili.Rettangolo;

class ProvaRettangolo {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        double b, a;
        out.println("Inserisci i dati del rettangolo:");
        
        while ((b= in.readDouble("base?")) < 0);
            out.println("Attenzione: la base di un rettangolo non puo' essere negativa!");
           
        while ((a = in.readDouble("altezza? ")) < 0);
            out.println("Attenzione: l'altezza di un rettangolo non puo' essere negativa!");

        Rettangolo r = new Rettangolo(b,a);

        out.print("Rettangolo letto: ");
        out.println(r.toString());
        out.println("L'area e' " + r.getArea());
        out.println("Il perimetro e' " + r.getPerimetro());
    }
}