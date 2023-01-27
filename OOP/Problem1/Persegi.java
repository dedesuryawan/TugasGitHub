public class Persegi implements CalculateWideAndAround{
    private int edge;

    public Persegi(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public void calculateWide() {
        System.out.println("Hasil : "+edge * edge);
    }

    @Override
    public void calculateAround() {
        System.out.println("Hasil : "+4 * edge);
    }
}
