// Nama File: Titik.java
// Deskripsi: Atribut dan method class titik
// Pembuat: Tara T - 24060122130060
// Tanggal: 27/02/2025

public class Titik{
    //Atribut
    private double absis;
    private double ordinat;

    private static int counterTitik = 0;

    // Method
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik ++;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public double getAbsis(){
        return absis;
    }
    
    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        this.absis = x;
    }

    public void setOrdinat(double y){
        this.ordinat = y;
    }

    public void geser(double x, double y){
        this.absis += x;
        this.ordinat += y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public int getKuadran(){
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

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik t){
        return Math.sqrt((absis - t.absis)*(absis - t.absis) + (ordinat - t.ordinat)*(ordinat - t.ordinat));
    }

    public void mirrorSbX(){
        ordinat = -ordinat;
    }

    public void mirrorSbY(){
        absis = -absis;
    }

    public double getMirrorSbX(){
        return -ordinat;
    }

    public double getMirrorSbY(){
        return -absis;
    }
}