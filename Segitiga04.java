package Jobsheet3;
import java.util.Scanner;

public class Segitiga04 {
    public static void main(String[] args) {
        int  alas, tinggi;
        float luas;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Masukkan alas: ");
            alas = sc.nextInt(); 
            System.out.println("Masukkan tinggi: ");
            tinggi = sc.nextInt();
        }

        luas = alas * tinggi / 2; 
        System.out.println("Luas segitiga: " + luas);
    }
}
