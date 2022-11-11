import prog.io.*;

public class Test {
    
    private static ConsoleInputManager in = new ConsoleInputManager();
    private static  ConsoleOutputManager out = new ConsoleOutputManager();

    public static void main(String[] args) {

        int x = in.readInt("Dividendo? ");
        int y = in.readInt("Divisore? ");
        int z = tentaDivisione(x, y);
        out.println("Il metodo tentaDivisione ha restituito " + z);

    }

    private static int tentaDivisione( int dividendo, int divisore) {
        try{
            out.println("tentaDivisione: inizio esecuzione blocco try");
            return dividendo / divisore;
        } catch (ArithmeticException e ) {
            out.println("Eccezione intercettata: esecuzione blocco catch");
            return 0;
        } finally {
            out.println("tentaDivisione: esecuzione blocco finally");
        }
    }
}
