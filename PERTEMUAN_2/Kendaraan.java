// Nama File: Kendaraan.java
// Deskripsi: Atribut dan method class kendaraan
// Pembuat: Tara T - 24060122130060
// Tanggal: 27/02/2025

public class Kendaraan {
    String noPlat;
    String Jenis;

    public Kendaraan(){
        noPlat = "";
        Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    void setJenis(String Jenis){
        this.Jenis = Jenis;
    }

    String getNoPlat(){
        return noPlat;
    }

    String getJenis(){
        return Jenis;
    }
}
