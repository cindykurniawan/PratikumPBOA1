/* Nama file : Titik.java
* Deskripsi :  berisi atribut dan method dalam class induk java
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 19/03/2026
*/



public class Titik {
    double absis;
    double ordinat;
    
    Titik(){
        absis = 0;
        ordinat = 0;
    }
    
    double getAbsis(){
        return absis;
    }
    
    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;

    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;

    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ") ");

    }

    
}
