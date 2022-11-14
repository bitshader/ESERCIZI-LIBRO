package EsempiLibro;
import prog.io.*;

public class CalcoloCerchio {
    
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        double raggio, area, circonferenza;
        //final double PI = 3.14;
        raggio = in.readDouble("Inserire la lunghezza del raggio ");

        area = raggio * raggio * Math.PI;
        circonferenza = raggio * Math.PI * 2;
        
        out.println("Area cerchio = " + area);
        out.println("Circonferenza cerchio = " + circonferenza);
    }    
}
