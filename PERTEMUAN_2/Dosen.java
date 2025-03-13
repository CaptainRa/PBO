// Nama File: Dosen.java
// Deskripsi: Atribut dan method class dosen
// Pembuat: Tara T - 24060122130060
// Tanggal: 27/02/2025

public class Dosen {
    String nip;
    String nama;
    String prodi;

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // public Dosen(String n, String na, String p ){
    //     nip = n;
    //     nama = na;
    //     prodi = p;
    // }

    void setNip(String nip){
        this.nip = nip;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setProdi(String prodi){
        this.prodi = prodi;
    }

    String getNip(){
        return nip;
    }

    String getNama(){
        return nama;
    }

    String getProdi(){
        return prodi;
    }
}
