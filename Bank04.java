package Jobsheet3;

import java.util.Scanner;

public class Bank04 {
    public static void main(String[] args) {
        double tabunganAwal, tabunganAkhir, bunga, persenBunga;
        int lamaNabung;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Masukkan jumlah tabungan awal: ");
            tabunganAwal = sc.nextDouble();
            System.out.println("Masukkan lama menabung (bulan): ");
            lamaNabung = sc.nextInt();
        }

        persenBunga = 0.0002;
        bunga = persenBunga * lamaNabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("\nTotal Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);
    }
}
