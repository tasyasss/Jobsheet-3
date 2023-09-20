package Jobsheet3;

public class ContohVariabel04 {
    public static void main(String[] args) {
        String hobiku = "video game";
        boolean pandaikah = true;
        char jenisKelamin = 'P';
        byte umurSekarang = 20;
        double $ipk = 3.75, tinggi = 1.5;

        System.out.println(hobiku);
        System.out.println("apa aku pandai? " + pandaikah);
        System.out.println("jenis kelaminku apa? " + jenisKelamin);
        System.out.println("IPK: " + $ipk);
        System.out.println(String.format(
            "Saya berumur %s dengan tinggi badan %s",
            umurSekarang, tinggi));
    }
}
