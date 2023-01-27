public class PersegiPanjang implements CalculateWideAndAround{
    private int length;
    private int wide;

    public PersegiPanjang(int length, int wide) {
        this.length = length;
        this.wide = wide;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public void calculateWide() {
        System.out.println("Hasil    : "+wide * length);
    }

    @Override
    public void calculateAround() {
        System.out.println("Hasil : "+2*(wide + length));
    }
}
