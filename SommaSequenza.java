import prog.io.*;


public class SommaSequenza {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();


        Frazione somma = new Frazione(0);
        boolean continua;

        do{
            int num = in.readInt("Numeratore? ");
            int den = in.readInt("Denominatore? ");
            somma = somma.piu(new Frazione(num, den));
            continua = in.readSiNo("vuoi inserire un' altra frazione(s/n)? ");
        }   while (continua);

        out.println("La somma e' " + somma.toString());
    }    
}
