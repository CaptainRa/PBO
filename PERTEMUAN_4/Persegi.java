// Nama File: Persegi.java
// Deskripsi: Program  untuk class persegi
// Pembuat: 24060122130060 - Tara T
// Tanggal: 13 Maret 2025

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * sisi;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }
}