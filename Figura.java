public abstract class Figura {

    public abstract double getArea();

    public abstract double getPerimetro();
    
    public boolean haAreaMaggiore(Figura altra) {
        return this.getArea() > altra.getArea();
    }

    public boolean haPerimetroMaggiore(Figura altra) {
        return this.getPerimetro() > altra.getPerimetro();
    }
}
