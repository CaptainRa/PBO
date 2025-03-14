// Nama File: BangunDatar.java
// Deskripsi: Program untuk class bangun datar
// Pembuat: 24060122130060 - Tara T
// Tanggal: 13 Maret 2025

public class BangunDatar{
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // protected int jmlSisi;
    // protected String warna;
    // protected String border;
    // protected static int counterBangunDatar = 0;

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public BangunDatar(){
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}