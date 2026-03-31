/* Nama file : MBangunDatar.java
* Deskripsi :  berisi atribut dan method dalam class Main Mbangundatar
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 09/03/2026
*/

public class MBangunDatar {
    public static void main(String[] args) {

        // membuat objek Persegi
        persegi P1 = new persegi(5, "Merah", "Hitam");

        System.out.println("=== PERSEGI ===");
        P1.printInfo();
        System.out.println("Sisi : " + P1.getSisi());
        System.out.println("Luas : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());
        System.out.println("Diagonal : " + P1.getDiagonal());

        System.out.println();

        //membuat objek Lingkaran
        Lingkaran L1 = new Lingkaran(14, "Biru", "Putih");

        System.out.println("=== LINGKARAN ===");
        L1.printInfo();
        System.out.println("Jari-jari : " + L1.getJari());
        System.out.println("Luas : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());
    }
}