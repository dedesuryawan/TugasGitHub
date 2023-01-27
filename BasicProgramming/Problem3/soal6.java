import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();
        box(angka);
    }

    private static void box(int angka){
        int posisi = 1;
        for (int e=0; e<angka; e++){
            for (int d=0; d<angka; d++) {
                System.out.print(isi(posisi));
                posisi++;
            }
            System.out.println();
        }
    }
    private static char isi(int posisi) {
        char result;
        if (posisi % 3 == 0){
            result = 'A';
        } else if (posisi % 2 == 0) {
            result = 'B';
        } else {
            result = 'C';
        }
        return result;
    }

}