/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/


class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    public String getNomor() {
        return NIP;
    }

    public String getNIP() {
        return NIP;
    }
}
