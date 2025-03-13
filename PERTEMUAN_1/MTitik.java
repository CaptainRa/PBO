// Nama File : Titik.java
// Deskripsi : Atribut dan method class titik
// Pembuat : Tara T - 24060122130060
// Tanggal : 18/02/2025

// package pertemuan1;
public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(2, 3);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 4);

        T3.printTitik();
        T4.printTitik();

        // Systems.out.println("Jumlah Objek titik:" + Titik.getCounterTitik());
        // Systems.out.println("Jumlah Objek titik:" + T2.getCounterTitik());
    }
}
