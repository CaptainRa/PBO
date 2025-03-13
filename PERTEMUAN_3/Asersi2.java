// Nama File: Asersi2.java
// Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
// Pembuat: 24060122130060 - Tara T
// Tanggal: 6 Maret 2025

// Class asersi
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKel(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = -2;
        assert(jariJari > 0):"Jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kel = l.hitungKel();
        System.out.println("Keliling lingkaran: "+ kel);
    }
}

// Jawaban...