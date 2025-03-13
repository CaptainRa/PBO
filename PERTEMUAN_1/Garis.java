// Nama File: Garis.java
//Deskripsi: Atribut dan method class garis
// Pembuat: Tara T-24060122130060

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Method
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik a, Titik b){
        titikAwal = a;
        titikAkhir = b;
        counterGaris++;
    }

    public void setTAwal(Titik a){
        this.titikAwal = a;
    }

    public void setTAkhir(Titik b){
        this.titikAkhir = b;
    }

    public Titik getTAwal(){
        return this.titikAwal;
    }

    public Titik getTAkhir(){
        return this.titikAkhir;
    }

    public int getCounter(){
        return counterGaris;
    }

    public double hitungPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis()-titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat()-titikAwal.getOrdinat(), 2));
    }
}
