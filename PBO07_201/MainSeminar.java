/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/042026
*/
public class MainSeminar {
    public static void main(String[] args) {

        // Dosen
        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        // Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi", "M001");
        Mahasiswa m2 = new Mahasiswa("Budi", "M002");
        Mahasiswa m3 = new Mahasiswa("Cici", "M003");
        Mahasiswa m4 = new Mahasiswa("Dina", "M004");
        Mahasiswa m5 = new Mahasiswa("Eko", "M005");

        // set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // Seminar
        Seminar s = new Seminar();

        // Registrasi
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // Output
        System.out.println("Total Peserta: " + s.countPeserta());
        s.tampilPeserta();
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());
        System.out.println();

        // tampil data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}