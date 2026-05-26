/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/
class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " berbunyi: Cuit");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Terbang");
    }
}