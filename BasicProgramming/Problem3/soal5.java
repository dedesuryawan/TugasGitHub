import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kata, balik = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kata : ");
        kata = input.nextLine();

        palindrome(kata, balik);

    }

    private static void palindrome(String kata, String balik){
        int length = kata.length();
        for ( int i = length - 1; i >= 0; i-- )
            balik = balik + kata.charAt(i);
        if (kata.equals(balik))
            System.out.println("True.");
        else
            System.out.println("False.");
    }

}