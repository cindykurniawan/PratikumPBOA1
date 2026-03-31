public class MBangunDatar {
    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar(); ❌ ERROR (abstract tidak bisa dibuat objek)

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");

        BangunDatar L1 = new Lingkaran(14, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(10, "Ungu", "Hitam");

        // PRINT
        System.out.println("=== Persegi ===");
        P1.printInfo();
        System.out.println("Luas : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());

        System.out.println("\n=== Lingkaran ===");
        L1.printInfo();
        System.out.println("Luas : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());

        // UJI METHOD EQUAL
        System.out.println("\nPersegi P1 dan P2 luas sama? " + P1.isEqualLuas(P2));
        System.out.println("Lingkaran L1 dan L2 keliling sama? " + L1.isEqualKeliling(L2));

        // UJI INTERFACE
        System.out.println("\n=== Resize Persegi ===");
        P2.zoomIn();
        System.out.println("Luas setelah zoomIn: " + P2.getLuas());

        System.out.println("\n=== Resize Lingkaran ===");
        L2.zoom(150);
        System.out.println("Luas setelah zoom 150%: " + L2.getLuas());
    }
}
