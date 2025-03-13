// Nama File: MataKuliah.java
// Deskripsi: Atribut dan method class mata kuliah
// Pembuat: Tara T - 24060122130060
// Tanggal: 27/02/2025

class MataKuliah {
    String idMatkul;
    String nama;
    int sks;
    
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setSks(int sks){
        this.sks = sks;
    }

    String getIdMatkul(){
        return idMatkul;
    }

    String getNama(){
        return nama;
    }

    int getSks(){
        return sks;
    }
}