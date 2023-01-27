public class Main {
    public static void main(String[] args) {
       Balok balok = new Balok(3, 6, 10);
       balok.calculate();

       Tabung tabung = new Tabung(7, 10);
       tabung.calculate();

       Kubus kubus = new Kubus(10);
       kubus.calculate();
    }
}