package EsempiLibro;
public class Frazione {
    
    private int num, den;
    //COSTRUTTORI
    public Frazione(int x, int y) {
        if(y == 0) 
            throw new ArithmeticException("Frazione non valida : denominatore 0");
        else {
            boolean negativo = (x < 0 && y > 0) || (x > 0 && y < 0);
            if ( x < 0)
            x = -x;
            if ( y < 0)
            y = -y;

            int m = mcd(x, y);
            if(negativo)
                num = -x / m;
            else 
                num = x / m;
            den = y / m; 
        }
    }
    
    public Frazione(int x) {
        this(x, 1);
    }

    //METODI
    public Frazione piu(Frazione f) {
        int n = this.num * f.den + this.den * f.num;
        int d = this.den * f.den;
        return new Frazione(n, d);
    }

    public Frazione meno(Frazione f) {
        int n = this.num *f.den - this.den * f.num;
        int d = this.den * f.den;
        return new Frazione(n, d);
    }

    public Frazione per(Frazione f) {
        int n = this.num * f.num;
        int d = this.den * f.den;
        return new Frazione(n, d);
    }

    public Frazione diviso(Frazione f) {
        int n = this.num * f.den;
        int d = this.den * f.num;
        return new Frazione(n ,d);
    }

    public boolean equals(Frazione f) {
        return this.num == f.num && this.den == f.den;
    }

    public boolean isMinore(Frazione f) {
        Frazione g = this.meno(f);
        return g.num < 0;
    }

    public boolean isMaggiore(Frazione f) {
        Frazione g = this.meno(f);
        return g.num > 0;
    }

    public String toString() {
        if ( den == 1) 
            return String.valueOf(num);
        else
            return num + "/" + den;
    }

    public int getNumeratore() {
        return num;
    } 

    public int getDenominatore() {
        return den;
    }

    public Frazione inversa() {
        return new Frazione(den, num);
    }

    public Frazione quadrato() {
        int x = num * num;
        int y = den * den;
        return new Frazione(x, y);
    }
    //METODI STATICI
    private static int mcd(int a, int b) {
        int resto;
        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);
        return a;
    }

    public Frazione potenza(int k) {
        if (k == 0) 
            return new Frazione(1);
        else if (k > 0) {
            Frazione f = this.potenza(k - 1);
            return this.per(f);
        }
        else {
            Frazione uno = new Frazione(1);
            Frazione inversa = uno.diviso(this);
            return inversa.potenza(-k);
        }
    }
}


