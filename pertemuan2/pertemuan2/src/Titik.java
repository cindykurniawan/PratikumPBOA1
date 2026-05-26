/* Nama file : Titik.java
* Deskripsi :  berisi atribut dan method dalam class induk titik
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 23/02/2026
*/

public class Titik {

    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Konstruktor default
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter
    public Titik(double a, double o) {
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // Setter
    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    // Method menampilkan titik
    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }

    // Geser titik
    public void geser(double dx, double dy) {
        absis = absis + dx;
        ordinat = ordinat + dy;
    }

    // Refleksi sumbu X (ubah langsung)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    // Menghasilkan titik baru refleksi X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Menghasilkan titik baru refleksi Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}

    

