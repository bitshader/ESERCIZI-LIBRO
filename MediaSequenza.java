import prog.io.*;


public class MediaSequenza {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Frazione somma = new Frazione(0);
        int contaFrazione = 0;
        boolean continua = in.readSiNo("Vuoi inserire una frazione(s/n) ?");

        while (continua) {
            int num = in.readInt("Numeratore? ");
            int den = in.readInt("Denominatore? ");
            somma = somma.piu(new Frazione(num, den));
            contaFrazione = contaFrazione +1;
            continua = in.readSiNo("Vuoi inserire una frazione(s/n) ?");

        }

        if(contaFrazione == 0)
            out.println("Non e' stata inserita alcuna frazione");
        else {
            Frazione media = somma.diviso(new Frazione(contaFrazione));
            out.println("La somma e' " + somma.toString() + " la media e' " + media.toString());
        }    

    }
}
