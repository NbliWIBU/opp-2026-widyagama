import java.util.HashMap;

public class BukuTelepon {
    public static void main(String[] args) {

        HashMap<String, String> kontak = new HashMap<>();

        // Menambahkan 3 kontak
        kontak.put("Budi", "081234567890");
        kontak.put("Salsa", "082345678901");
        kontak.put("Andi", "083456789012");

        // Menampilkan semua kontak
        System.out.println("=== DAFTAR KONTAK ===");
        System.out.println(kontak);

        // Mencari kontak berdasarkan nama
        System.out.println("\n=== CARI KONTAK ===");
        String cari = "Salsa";

        if (kontak.containsKey(cari)) {
            System.out.println(cari + " : " + kontak.get(cari));
        } else {
            System.out.println("Kontak tidak ditemukan!");
        }

        // Menghapus 1 kontak
        kontak.remove("Budi");

        // Menampilkan sisa kontak
        System.out.println("\n=== SISA KONTAK ===");
        System.out.println(kontak);
    }
}