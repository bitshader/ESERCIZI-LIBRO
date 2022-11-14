package EserciziLibro;


import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ex2_6 {
    
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //leggi il primo numero
        int num1 = in.readInt("Inserire il primo numero: ");
        
        //leggi il secondo numero
        int num2 = in.readInt("Inserire il secondo numero: ");

        //somma
        int somma = num1 + num2;

        //sottrazione
        int diff = num1 - num2;

        //moltiplicazion
        int molt = num1 * num2;

        //divisione
        int div = num1 / num2;

        //perc
        int xxx = num1 & num2;

        //comunicazione
        out.println("La somma tra " + num1 + " e " + num2 + " e' " + somma);
        out.println("La differenza tra " + num1 + " e " + num2 + " e' " + diff);
        out.println("Il prodotto tra " + num1 + " e " + num2 + " e' " + molt);
        out.println("Il quoziente tra " + num1 + " e " + num2 + " e' " + div);
        out.println("Il xxx tra " + num1 + " e " + num2 + " e' " + xxx);
    }
}
