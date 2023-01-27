public class Tabung implements CalculateVolume{
    private final double PHI = 3.14;
    private double r;
    private double t;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    @Override
    public void calculate() {
        System.out.println("Volume : "+(PHI * r * r)* t);
    }
}
