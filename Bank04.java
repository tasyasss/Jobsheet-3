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

/* Algoritma Bank04

Deklarasi:
1. lamaNabung: int
2. persenBunga = 0.0002, bunga, tabunganAwal, tabunganAkhir: double

Deskripsi:
1. print “Masukkan jumlah tabungan awal:”
2. read tabunganAwal
3. print “Masukkan lama menabung (bulan):”
4. read lamaNabung
5. bunga = persenBunga * lamaNabung * tabunganAwal
6. tabunganAkhir = tabunganAwal + bunga
7. print bunga (Total bunga)
8. print tabunganAkhir (Total tabungan) */

/*Algoritma: LingkaranNoAbsen 

Deklarasi: 
1. r: int 
2. keliling, luas: double 

Deskripsi: 
1. print “masukkan jari-jari lingkaran!” 
2. read r 
3. keliling = 2 * 3.14 * r 
4. luas = 3.14 * r * r 
5. print keliling 
6. print luas
 */