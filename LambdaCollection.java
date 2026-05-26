import java.util.*;

public class LambdaCollection {
    public static void main(String[] args) {

        List<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Citra");

        System.out.println("Pakai lambda:");
        nama.forEach(n -> System.out.println(n));

        List<Integer> angka = new ArrayList<>();
        angka.add(5);
        angka.add(1);
        angka.add(9);
        angka.add(2);

        System.out.println("Sebelum sort:");
        angka.forEach(a -> System.out.println(a));

        angka.sort((a, b) -> a - b);

        System.out.println("Sesudah sort:");
        angka.forEach(a -> System.out.println(a));
    }
}