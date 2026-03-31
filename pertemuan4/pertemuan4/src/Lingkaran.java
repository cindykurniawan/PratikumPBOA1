/* 
Nama File : Lingkaran.java
Pembuat : Cindy Kurniawan
Deskripsi : Membuat atribut dan method untuk class Lingkaran
Nim     : 24060124140201
Tanggal : 09/03/2026 
*/

public class Lingkaran extends BangunDatar {
    /* ATRIBUT */
    private double jari;
    private String warna;
    private String border;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    /*KONSTRUKTOR */
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

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    //override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari: " + jari);
    }
}