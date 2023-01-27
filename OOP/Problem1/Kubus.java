public class Kubus implements CalculateVolume{
    private int edge;

    public Kubus(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public void calculate() {
        System.out.println("Volume : "+edge * edge * edge);
    }
}
