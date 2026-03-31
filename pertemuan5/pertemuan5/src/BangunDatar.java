/* Nama file : BangunDatar.java
* Deskripsi :  berisi atribut dan method dalam class induk bangun datar
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 16/03/2026
*/

public abstract class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar(){}

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    // abstract method
    public abstract double getLuas();
    public abstract double getKeliling();

    // tambahan no 4
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}