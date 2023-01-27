public class Main {
    public static void main(String[] args) {
        System.out.println();
        float [] value = {1, 2, 3, 4};
        float tambah = 0;
        for (float dataTambah : value) {
            tambah += dataTambah;
        }
        System.out.print(tambah/value.length);
    }
}