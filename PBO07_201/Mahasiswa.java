/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/
class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }

    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + nama);
        System.out.println("Wali  : " + (dosenWali != null ? dosenWali.getNama() : "-"));
        System.out.println();
    }
}