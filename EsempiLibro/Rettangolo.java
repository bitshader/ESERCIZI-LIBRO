package EsempiLibro;
public class Rettangolo extends Figura {
    
    private double base, altezza;

    public Rettangolo(double b, double a) {
        base = b;
        altezza = a;
    }

    public double getPerimetro() {
        return 2 * (base + altezza);
    }

    public double getArea() {
        return base * altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public String toString() {
        return "base = " + base + ", altezza = " + altezza;
    }

    public boolean equals(Rettangolo altro) {
    return altro != null && this.base == altro.base && this.altezza == altro.altezza;
    }

    public boolean equals(Object o) {
        if(o instanceof Rettangolo)
            return equals((Rettangolo) o);
        else
            return false;
    }

    public void cambiaBase(double x) {
        base = x;
    }

    public void cambiaAltezza(double x) {
        altezza = x;
    }
}
