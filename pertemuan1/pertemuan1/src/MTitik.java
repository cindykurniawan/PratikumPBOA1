/* Nama file : Mtitik.java
* Deskripsi :  berisi atribut dan method dalam class main titik
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 19/03/2026
*/


public class Mtitik {
    public static void main (String [] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
    
}
