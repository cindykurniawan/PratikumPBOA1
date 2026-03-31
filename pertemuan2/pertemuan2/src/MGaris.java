/* Nama file : MGaris.java
* Deskripsi :  berisi atribut dan method dalam class main garis
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 23/02/2026
*/

public class MGaris {

    public static void main(String[] args) {

        Titik t1 = new Titik(1,2);
        Titik t2 = new Titik(5,6);

        Garis g1 = new Garis(t1,t2);

        System.out.println("Jumlah garis : " + Garis.getCounterGaris());

        g1.printGaris();

        System.out.println("Panjang garis : " + g1.getPanjang());

        System.out.println("Gradien garis : " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();

        System.out.print("Titik tengah : ");
        tengah.printTitik();

        System.out.println("Persamaan garis : " + g1.getPersamaanGaris());

        Garis g2 = new Garis(new Titik(2,4), new Titik(6,8));

        System.out.println("Apakah sejajar? " + g1.isSejajar(g2));

        System.out.println("Apakah tegak lurus? " + g1.isTegakLurus(g2));
    }
}