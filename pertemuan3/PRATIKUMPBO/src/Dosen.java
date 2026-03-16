/* Nama file : Dosen.java
* Deskripsi : berisi atribut dan method dalam class Dosen
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 02/03/2026
 */


public class Dosen {

    private String nip;
    private String nama;
    private String prodi;

    // konstruktor kosong
    public Dosen() {
    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // getter
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}