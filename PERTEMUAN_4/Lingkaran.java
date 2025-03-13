// Nama File: Lingkaran.java
// Deskripsi: Program untuk class Lingkaran
// Pembuat: 24060122130060 - Tara T
// Tanggal: 6 Maret 2025

public class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jariJari = diameter / 2;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(0);
    }

    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jariJari;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jariJari);
    }
}