// Nama File : Titik.java
// Deskripsi : Atribut dan method class titik
// Pembuat : Tara T - 24060122130060
// Tanggal : 18/02/2025

public class Titik{
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;
    // Method
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }
    void geser(double x, double y){
        absis += x;
        ordinat += y;
    }
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if(absis < 0 && ordinat > 0){
            return 2;
        } else if(absis < 0 && ordinat < 0){
            return 3;
        } else if(absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt((absis-T.absis)*(absis-T.absis) + (ordinat-T.ordinat)*(ordinat-T.ordinat));
    }

    void mirrorSbX(){
        ordinat = -ordinat;
    }

    void mirrorSbY(){
        absis = -absis;
    }

    double getMirrorSbX(){
        return -ordinat;
    }

    double getMirrorSbY(){
        return -absis;
    }
} //end class titik