// Nama File: Asersi.java
// Deskripsi: Program unutk menunjukkan asersi
// Pembuat: 24060122130060 - Tara T
// Tanggal: 6 Maret 2025

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}