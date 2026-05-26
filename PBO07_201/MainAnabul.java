/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/
public class MainAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Kitty");
        Anabul a2 = new Anjing("Doggy");
        Anabul a3 = new Burung("Tweety");

        a1.bunyi();
        a1.gerak();

        a2.bunyi();
        a2.gerak();

        a3.bunyi();
        a3.gerak();
    }
}