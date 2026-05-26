/* Nama file : persegi.java
* Deskripsi :  berisi atribut dan method dalam class persegi
* pembuat : Cindy Kurnawan
* Nim     : 24060124140201
* Tanggal : 09/03/2026
*/

public class persegi extends BangunDatar {

    private double sisi;

    public persegi(){
        setJmlSisi(4);
    }


    public persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    //override
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }
}