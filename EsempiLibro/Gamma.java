package EsempiLibro;
import prog.utili.Data;
import prog.io.*;

class Gamma {
    
    public static void main(String[] args) {

        ConsoleOutputManager out = new ConsoleOutputManager();

        Data a = new Data(22, 6, 2004);
        out.println(a.getGiorno()); //--> 22
        
        a = new Beta("Topo"); //--> w = 4; k++ = 5
        out.println(a.getGiorno());//--> getGiorno() = 2 + w = 6
        
        Beta b = new Beta(15); //15 + 2 = 17/5/2004, k++ = 6
        out.println(b.getGiorno());//--> getGiorno() = 17 + 15 = 32;
        
        out.println(Beta.getStatico()); //--> k = 6;
    }
}
