public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 4);
        segitiga.calculateAround();
        segitiga.calculateWide();

        Persegi persegi = new Persegi(4);
        persegi.calculateAround();
        persegi.calculateWide();

        PersegiPanjang persegiPanjang = new PersegiPanjang(7, 8);
        persegiPanjang.calculateAround();
        persegiPanjang.calculateWide();

    }
}