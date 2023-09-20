package Jobsheet3;

public class ContohTipeData04 {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        short jumlahPenduduk = 1025;
        float suhu = 60.5f;
        double berat = 0.4544;
        long saldo = 1599920932;
        int angkaDesimal = 0x10;
        short jarak = 1000;

        System.out.println("Golongan darah\t: " + (byte)golonganDarah);
        System.out.println("Jarak\t\t: " + jarak);
        System.out.println("jumlah penduduk\t: " + jumlahPenduduk);
        System.out.println("suhu\t: " + suhu);
        System.out.println("berat:\t\t: " + (float)berat);
        System.out.println("saldo\t\t: " + saldo);
        System.out.println("angka desimal\t: " + angkaDesimal);
    }
}
