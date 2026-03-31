/* Nama file : MMahasiswa.java
* Deskripsi : berisi atribut dan method dalam class main MMahasiswa
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 02/03/2026
 */

public class MMahasiswa {

    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah mk2 = new MataKuliah("MBD","Manajemen Basis Data",3);
        MataKuliah mk3 = new MataKuliah("ALG","Algoritma",2);

        Dosen d1 = new Dosen("111","Andi","Informatika");
        Dosen d2 = new Dosen("222","Budi","Sistem Informasi");

        Kendaraan k1 = new Kendaraan("H1234AB","Motor");
        Kendaraan k2 = new Kendaraan("H5678CD","Mobil");

        Mahasiswa m1 = new Mahasiswa("231001","Citra","Informatika");
        Mahasiswa m2 = new Mahasiswa("231002","Rina","Sistem Informasi");

        m1.setDosenWali(d1);
        m1.setKendaraan(k1);
        m1.addMatKul(mk1);
        m1.addMatKul(mk2);

        m2.setDosenWali(d2);
        m2.setKendaraan(k2);
        m2.addMatKul(mk2);
        m2.addMatKul(mk3);

        System.out.println("Data Mahasiswa 1");
        m1.printDetailMhs();
        System.out.println("Jumlah MK : " + m1.getJumlahMatKul());
        System.out.println("Total SKS : " + m1.getJumlahSKS());

        System.out.println();

        System.out.println("Data Mahasiswa 2");
        m2.printDetailMhs();
        System.out.println("Jumlah MK : " + m2.getJumlahMatKul());
        System.out.println("Total SKS : " + m2.getJumlahSKS());
    }
}
