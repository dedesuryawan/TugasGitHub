public class Segitiga implements CalculateWideAndAround {
        private double alas;
        private double tinggi;
        public Segitiga(double alas, double tinggi){
            this.alas =alas;
            this.tinggi=tinggi;
        }

    @Override
    public void calculateWide() {
        System.out.println(this.alas*this.tinggi/2);
    }

    @Override
    public void calculateAround() {
        double a=Math.pow(this.alas,2);
        double b=Math.pow(this.alas,2);
        double sisi =Math.sqrt(a+b);
        System.out.println(this.alas+this.tinggi+sisi);
    }
}
