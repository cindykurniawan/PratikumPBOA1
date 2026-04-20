/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/

class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " berbunyi: Guk-guk");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}