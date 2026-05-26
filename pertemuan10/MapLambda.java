import java.util.HashMap;
import java.util.Map;

public class MapLambda {
    public static void main(String[] args) {

        // membuat Map NIM -> Nama
        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("22001", "Andi");
        mahasiswa.put("22002", "Budi");
        mahasiswa.put("22003", "Citra");
        mahasiswa.put("22004", "Dina");

        // tampilkan pakai lambda
        System.out.println("Daftar Mahasiswa:");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}