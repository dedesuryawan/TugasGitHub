public class Main {
    public static void main(String[] args) {

        Operasi operasi = new Operasi();

        System.out.println("Pertambahan");
        operasi.inputAngka();
        operasi.tambah();

        System.out.println("Pengurangan");
        operasi.inputAngka();
        operasi.kurang();

        System.out.println("Perkalian");
        operasi.inputAngka();
        operasi.kali();

        System.out.println("Pembagian");
        operasi.inputAngka();
        operasi.bagi();
    }
}