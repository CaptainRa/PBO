// Nama File: Mahasiswa.java
// Deskripsi: Atribut dan method class mahasiswa
// Pembuat: Tara T - 24060122130060
// Tanggal: 27/02/2025

// import java.util.List;
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    String[] MataKuliah;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan){
    //     this.nim = nim;
    //     this.nama = nama;
    //     this.prodi = prodi;
    //     this.listMatkul = new ArrayList<>();
    //     this.dosenWali = dosenWali;
    //     this.kendaraan = kendaraan;
    // }

    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan, ArrayList list  ){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = list;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    void setNim(String nim){
        this.nim = nim;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }

    void setProdi(String prodi){
        this.prodi = prodi;
    }

    void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    String getNim(){
        return nim;
    }

    String getNama(){
        return nama;
    }

    String getProdi(){
        return prodi;
    }

    Dosen getDosenWali(){
        return dosenWali;
    }

    Kendaraan getKendaraan(){
        return kendaraan;
    }

    int getJumlahSKS(){
        int i;
        int totalSKS = 0;
        for (i=0; i<listMatkul.size(); i++){
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    int getJumlahMatkul(){
        return listMatkul.size();
    }

    void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i=0; i<listMatkul.size(); i++){
            System.out.println("Mata Kuliah: " + listMatkul.get(i).getNama());
        }
    }
}