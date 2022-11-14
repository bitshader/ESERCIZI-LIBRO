package EsempiLibro;
public class Quadrato extends Rettangolo{
    
    public Quadrato (double x) {
        super(x, x);
    }
    //METODI
    public double getLato() {
        return getBase();
    }

    public String toString() {
        return "lato = " + getLato();
    }

    public void cambiaAltezza(double x) {
        cambiaLato(x);
    }

    public void cambiaBase(double x) {
        cambiaLato(x);
    }

    public void cambiaLato(double x) {
        super.cambiaAltezza(x);
        super.cambiaBase(x);
        
    }
}
