import java.util.Scanner;

public class Masukan {

    float angka1;

    float angka2;

    public void setAngka1(float angka1){
        this.angka1= angka1;
    }
    public void setAngka2(float angka2){
        this.angka2= angka2;
    }
    public void inputAngka(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama : ");
        this.angka1 = input.nextFloat();
        System.out.print("Masukan Angka Kedua :  ");
        this.angka2 = input.nextFloat();
    }
}
