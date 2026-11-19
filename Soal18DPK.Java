import java.util.HashMap;

public class Soal18DPK {
    public static void main(String[] args) {
        HashMap<String, String> bukuTelepon = new HashMap<>();

        // Tambah 3 kontak : nama -> nomor HP
        bukuTelepon.put("Andi", "081234567");
        bukuTelepon.put("Budi", "082345678");
        bukuTelepon.put("Cici", "083456789");

        // Tampilkan semua kontak
        System.out.println("=== DAFTAR KONTAK ===");
        for (String nama : bukuTelepon.keySet()) {
            System.out.println(nama + ": " + bukuTelepon.get(nama));
        }

        // Cari 1 kontak berdasarkan nama
        System.out.println("\nCari \"Budi\": " + bukuTelepon.get("Budi"));

        // Hapus 1 kontak, tampilkan sisa
        System.out.println("\nMenghapus \"Cici\"...");
        bukuTelepon.remove("Cici");

        System.out.println("\nSisa kontak:");
        for (String nama : bukuTelepon.keySet()) {
            System.out.println(nama + ": " + bukuTelepon.get(nama));
        }
    }
    // BONUS: HashMap itu simpan data pakai Key -> Value, jadi nyarinya
    // pakai nama, bukan pakai nomor urut.
    // Kalau ArrayList, nyarinya harus pakai index (0, 1, 2) dan harus loop satu-satu.
    // HashMap lebih cepat kalau mau cari berdasarkan nama.
}