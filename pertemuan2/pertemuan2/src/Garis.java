/* Nama file : Garis.java
* Deskripsi :  berisi atribut dan method dalam class induk garis
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 23/02/2026
*/

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor default
    public Garis() {
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor parameter
    public Garis(Titik tA, Titik tB) {
        titikAwal = tA;
        titikAkhir = tB;
        counterGaris++;
    }

    // Getter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Setter
    public void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    public void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    // Panjang garis
    public double getPanjang() {

        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    // Gradien
    public double getGradien() {

        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return (y2-y1)/(x2-x1);
    }

    // Titik tengah
    public Titik getTitikTengah() {

        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;

        return new Titik(x,y);
    }

    // Sejajar
    public boolean isSejajar(Garis g) {

        return this.getGradien() == g.getGradien();
    }

    // Tegak lurus
    public boolean isTegakLurus(Garis g) {

        return this.getGradien() * g.getGradien() == -1;
    }

    // Print garis
    public void printGaris() {

        System.out.print("Titik Awal : ");
        titikAwal.printTitik();

        System.out.print("Titik Akhir : ");
        titikAkhir.printTitik();
    }

    // Persamaan garis
    public String getPersamaanGaris() {

        double m = getGradien();
        double x = titikAwal.getAbsis();
        double y = titikAwal.getOrdinat();

        double c = y - (m * x);

        return "y = " + m + "x + " + c;
    }
}