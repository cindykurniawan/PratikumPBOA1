/* 
NIM  : 24060124140201
Nama : Cindy Kurniawan
Tanggal : 20/04/2026
Deskripsi : Program Polimorfisme Ad Hoc Coercion
*/

public class CoercionDemo {
    public static void main(String[] args) {

        int angka = 65;

        // sebagai integer
        System.out.println("Integer: " + angka);

        // sebagai char
        System.out.println("Char: " + (char) angka);

        // sebagai double
        System.out.println("Double: " + (double) angka);

        int a = 10;
        double b = a; // int ke double
        int c = (int) b; // double ke int

        System.out.println("Nilai c: " + c);

        String X = "1234";
        String Y = "5678";

        // konkatenasi
        String S = X + Y;

        // penjumlahan
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S: " + S);
        System.out.println("Z: " + Z);

        String P = "12.34";
        String Q = "56.78";

        // konkatenasi
       String R = P + Q;

       // penjumlahan
       double D = Double.parseDouble(P) + Double.parseDouble(Q);

       System.out.println("R: " + R);
       System.out.println("D: " + D);


        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        String T = A.toString();
        System.out.println("T: " + T);

    }


}

