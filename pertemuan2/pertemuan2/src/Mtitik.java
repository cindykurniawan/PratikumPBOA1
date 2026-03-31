/* Nama file : Mtitik.java
* Deskripsi :  berisi atribut dan method dalam class main titik
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 23/02/2026
*/

public class Mtitik {

    public static void main(String[] args) {

        Titik t1 = new Titik();
        Titik t2 = new Titik(3,4);

        System.out.println("Jumlah objek titik: " + Titik.getCounterTitik());

        System.out.print("Titik t1 : ");
        t1.printTitik();

        System.out.print("Titik t2 : ");
        t2.printTitik();

        // Setter
        t1.setAbsis(5);
        t1.setOrdinat(6);

        System.out.print("Titik t1 setelah diubah: ");
        t1.printTitik();

        // Geser titik
        t1.geser(2,3);

        System.out.print("Titik t1 setelah digeser: ");
        t1.printTitik();

        // Refleksi
        t1.refleksiX();

        System.out.print("Titik t1 setelah refleksi X: ");
        t1.printTitik();

        Titik t3 = t2.getRefleksiY();

        System.out.print("Refleksi Y dari t2: ");
        t3.printTitik();

        System.out.println("Jumlah objek titik sekarang: " + Titik.getCounterTitik());
    }
}

