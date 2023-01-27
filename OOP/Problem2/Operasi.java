public class Operasi extends Masukan{



    public void tambah(){
        float hasil = this.angka1 + this.angka2;
        System.out.println("Hasil Pertambahan : "  + hasil);
        System.out.println();
    }
    public void kurang(){
        float hasil = this.angka1 - this.angka2;
        System.out.println("Hasil Pengurangan : " + hasil);
        System.out.println();

    }

    public void kali(){
        float hasil = this.angka1 * this.angka2;
        System.out.println("Hasil Perkalian : " + hasil);
        System.out.println();

    }

    public void bagi(){
        float hasil = this.angka1 / this.angka2;
        System.out.println("Hasil Pembagian :  " + hasil);
        System.out.println();
    }



}
