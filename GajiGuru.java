package Jobsheet3;
import java.util.Scanner;

public class GajiGuru {
    public static void main(String[] args) {
        double gajiJam, gajiMengajar, gajiKosong, gajiDinas, akumulasi;
        int jamMengajar, jamKosong, jamDinas;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nPenghitungan Gaji Guru");
            System.out.print("Masukkan jam mengajar       : ");
            jamMengajar = sc.nextInt();
            System.out.print("Masukkan jam tidak mengajar : ");
            jamKosong   = sc.nextInt();
            System.out.print("Masukkan jam dinas luar     : ");
            jamDinas    = sc.nextInt();
        }

        gajiJam      = 75000;
        gajiMengajar = gajiJam * jamMengajar;
        gajiKosong   = (int)gajiJam / 2 * jamKosong;
        gajiDinas    = (int)gajiJam * 0.75 * jamDinas;
        akumulasi    = gajiMengajar + gajiKosong + gajiDinas;

        System.out.println(String.format(
            "Total gaji Anda adalah %s dengan perhitungan  gaji %s per jam,\r\ndan keterangan %s jam mengajar, %s jam tidak kehadiran, dan %s jam dinas luar.\r\n\r\nKeterangan gaji:\r\nGaji Mengajar: %s,\r\nGaji Kosong: %s,\r\nGaji Dinas: %s",
            akumulasi, gajiJam, jamMengajar, jamKosong, jamDinas, gajiMengajar, gajiKosong, gajiDinas));
    }
}
