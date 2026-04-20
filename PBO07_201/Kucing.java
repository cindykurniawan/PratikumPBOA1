/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/

class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " berbunyi: Meong");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}