/* Nama file : Kendaraan.java
* Deskripsi : berisi atribut dan method dalam class Kendaraan
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 02/03/2026
 */

public class Kendaraan {

    private String noPlat;
    private String jenis;

    public Kendaraan() {
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
