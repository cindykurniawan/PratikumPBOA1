
/* 
Nama : Cindy Kurniawan
NIM  : 24060124140201
Tanggal : 20/04/2026
Deskripsi : Main untuk uji Mahasiswa
*/

public class MainMahasiswa2 {
    public static void main(String[] args) {
         
         // tanpa parameter
        Mahasiswa2 m1 = new Mahasiswa2();
        m1.printInfo();

        // constructor 2 parameter
        Mahasiswa2 m2 = new Mahasiswa2("123", "Cindy");
        m2.printInfo();

        // constructor 3 parameter
        Mahasiswa2 m3 = new Mahasiswa2("456", "Budi", "Informatika");
        m3.printInfo();

        // copy constructor
        Mahasiswa2 m4 = new Mahasiswa2(m3);
        m4.printInfo();

        // uji overloading
        m1.setProgramStudi();
        m1.printInfo();

        m1.setProgramStudi("Sistem Informasi");
        m1.printInfo();

        m1.setProgramStudi(m3);
        m1.printInfo();
       

    }

}