
/* 
NIM  : 24060124140201
Nama : Cindy Kurniawan
Tanggal : 20/04/2026
Deskripsi : program untuk mahasiswa 
*/

class Mahasiswa2 {
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // c. Konstruktor tanpa parameter
    public Mahasiswa2() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // Constructor 
    public Mahasiswa2(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = "Kosong";
    }

    // d. Konstruktor 3 parameter
    public Mahasiswa2(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;

    }

        // e. Konstruktor copy
    public Mahasiswa2(Mahasiswa2 m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    // Getter
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    // Setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // OVERLOADING

    // tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // dengan String
    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    // dengan objek Mahasiswa
    public void setProgramStudi(Mahasiswa2 m) {
        this.ProgramStudi = m.getProgramStudi();
    }


    // method tampil
    public void printInfo() {
        System.out.println("NIM           : " + NIM);
        System.out.println("Nama          : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
        System.out.println();
    }
}
