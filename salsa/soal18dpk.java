import java.util.HashMap;
import java.util.Map;
public class soal18dpk {
    public static void main(String[] args) {
        HashMap<String, String> kontak =
                new HashMap<>();
        kontak.put("Andi", "081234567");
        kontak.put("Budi", "082345678");
        kontak.put("Cici", "083456789");        System.out.println("=== DAFTAR KONTAK ===");
        for (Map.Entry<String, String> data
                : kontak.entrySet()) {
            System.out.println(
                data.getKey() + ": " + data.getValue()
            );
        }
        System.out.println();        System.out.println("Cari Budi: "
                + kontak.get("Budi"));
        System.out.println();        System.out.println("Menghapus Cici...");        kontak.remove("Cici");        System.out.println("\nSisa kontak:");
        for (Map.Entry<String, String> data
                : kontak.entrySet()) {
            System.out.println(
                data.getKey() + ": " + data.getValue()
            );
        }
    }
}