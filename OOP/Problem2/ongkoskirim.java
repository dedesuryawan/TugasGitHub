public class ongkoskirim extends inherit {
    final double hargaDefault = 5000;
    double berat;
    void setPanjang (double number) {
        panjang=number;
    } void setLebar (double number) {
        double lebar = number;
    } void setTinggi (double number) {
        tinggi = number;
    }
    public int hargaOngkosKirim() {
        double volumeDimensi = volume();
        if (volumeDimensi <= 50) {
            return  (int) hargaDefault;
        } else {
            return (int) berat * 5000;
        }
    }
}

