public class Main {
    public static void main(String[] args) {
        int bilangan  = 6;

        for(int i=1;i<=bilangan;i++) {
            if(bilangan%i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        float [] value = {1, 2, 3, 4};
        float tambah = 0;
        for (float dataTambah : value) {
            tambah += dataTambah;
        }
    }
}