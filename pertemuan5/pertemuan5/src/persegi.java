/* Nama file : persegi.java
* Deskripsi :  berisi atribut dan method dalam class persegi
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 18/03/2026
*/

public class persegi extends BangunDatar implements IResize {

    private double sisi;

    public persegi(){
        setJmlSisi(4);
    }

    public persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    // IMPLEMENT INTERFACE
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent / 100.0;
    }
}