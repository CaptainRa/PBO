// Nama File: AngkaSialException.java
// Deskripsi: Program untuk menangani eksepsi angka sial
// Pembuat: 24060122130060 - Tara T
// Tanggal: 6 Maret 2025 

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}

class AnakAngkaSialException extends AngkaSialException{
    public AnakAngkaSialException(){
        super();
    }
}
