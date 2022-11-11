import prog.utili.Data;

public class Beta extends Data {

    private int w;
    private static int k = 4;

    public Beta(int x) {
        super(x + 2, 5, 2004);
        w = x;
        k++;
    }    
    
    public Beta(String s) {
        w = s.length();
        k++;    
    }

    public int getGiorno() {
        return super.getGiorno() + w;
    }

    public static int getStatico() {
        return k;
    }
    
    
}
