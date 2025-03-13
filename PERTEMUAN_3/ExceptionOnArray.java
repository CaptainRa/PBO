// Nama File: ExceptionOnArray.java
// Deskripsi: program penggunaan eksepsi menggunakan class library java
// Pembuat: 24060122130060 - Tara T
// Tanggal: 6 Maret 2025

public class ExceptionOnArray {
    public static void main(String[] args){
        // Instansiasi array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
