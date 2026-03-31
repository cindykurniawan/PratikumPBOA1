/* 
Nama File : Lingkaran.java
Pembuat : Cindy Kurniawan
Deskripsi : Membuat atribut dan method untuk class Lingkaran
Nim     : 24060124140201
Tanggal : 16/03/2026
*/

public class Lingkaran extends BangunDatar implements IResize {

    private double jari;

    public Lingkaran(){}

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari : " + jari);
    }

    // IMPLEMENT INTERFACE
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent / 100.0;
    }
}