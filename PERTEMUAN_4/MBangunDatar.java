// Nama File: Persegi.java
// Deskripsi: Program  untuk main class BangunDatar dan subclass Persegi dan Lingkaran
// Pembuat: 24060122130060 - Tara T
// Tanggal: 13 Maret 2025

// Buatlah sebuah main class dan main method dalam kelas tersebut. Dalam main method tersebut buatlah beberapa contoh objek dari class Persegi dan Lingkaran

public class MBangunDatar{
    public static void main(String[] args){
        Persegi P1 = new Persegi(5, "Merah", "Hitam");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());

        Lingkaran L1 = new Lingkaran(10, "Biru", "Putih");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
    }
}