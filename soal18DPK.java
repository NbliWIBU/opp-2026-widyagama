import java.util.HashMap;
import java.util.Map;

public class soal18DPK {
    public static void main(String[] args) {
        HashMap<String, String> bukuTelepon = new HashMap<>();
        
        bukuTelepon.put("Andi", "081234567");
        bukuTelepon.put("Budi", "082345678");
        bukuTelepon.put("Cici", "083456789");

        System.out.println("=== DAFTAR KONTAK ===");
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nCari \"Budi\": " + bukuTelepon.get("Budi"));

        System.out.println("\nMenghapus \"Cici\"...");
        bukuTelepon.remove("Cici");

        System.out.println("\nSisa kontak:");
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//Pertanyaan
//ArrayList menyimpan data secara berurutan berdasarkan indeks (0, 1, 2...) dan mengizinkan data duplikat. Sedangkan HashMap menyimpan data dalam pasangan Key-Value (Kunci-Nilai). Di HashMap, key harus unik, dan pencarian data (berdasarkan key) jauh lebih cepat dibandingkan mencari data di dalam ArrayList.