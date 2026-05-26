interface Operasi {
    int hitung(int a, int b);
}

public class LambdaDasar {
    public static void main(String[] args) {

        // Anonymous class
        Operasi diskonBiasa = new Operasi() {
            public int hitung(int harga, int diskon) {
                return harga - diskon;
            }
        };

        // Lambda
        Operasi diskonLebaran = (harga, diskon) -> harga - diskon;

        System.out.println("Diskon biasa: " + diskonBiasa.hitung(100000, 20000));
        System.out.println("Diskon lebaran: " + diskonLebaran.hitung(100000, 20000));
    }
}