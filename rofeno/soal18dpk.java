import java.util.HashMap;

public class soal18dpk {
    public static void main(String[] args) {
        HashMap<String, String> bukuTelepon = new HashMap<>();

        bukuTelepon.put("Andi", "081234567");
        bukuTelepon.put("Budi", "082345678");
        bukuTelepon.put("Cici", "083456789");

        System.out.println("=== DAFTAR KONTAK ===");
        for (String nama : bukuTelepon.keySet()) {
            System.out.println(nama + ": " + bukuTelepon.get(nama));
        }

        System.out.println();
        System.out.println("Cari \"Budi\": " + bukuTelepon.get("Budi"));

        System.out.println();
        System.out.println("Menghapus \"Cici\"...");
        bukuTelepon.remove("Cici");

        System.out.println();
        System.out.println("Sisa kontak:");
        for (String nama : bukuTelepon.keySet()) {
            System.out.println(nama + ": " + bukuTelepon.get(nama));
        }
    }
}

/*
PERTANYAAN BONUS:
Apa bedanya HashMap dengan ArrayList?

JAWABAN:
1. Cara Menyimpan Data:
   - HashMap menyimpan data dalam format Key-Value (berpasangan). Setiap data memiliki kunci (key) unik yang digunakan untuk mengakses nilainya (value). Urutan data tidak dijamin (tidak berurutan).
   - ArrayList menyimpan data sebagai elemen tunggal di dalam sebuah list/urutan. Data diakses berdasarkan indeks (angka 0, 1, 2, dst) dan urutannya tetap sesuai saat dimasukkan.

2. Kegunaan Utama:
   - HashMap cocok digunakan jika kita ingin mencari data berdasarkan "identitas" tertentu dengan cepat, seperti mencari nomor HP berdasarkan nama (seperti pada soal Buku Telepon).
   - ArrayList cocok digunakan jika kita hanya butuh menyimpan sekumpulan data secara berurutan dan sering mengaksesnya menggunakan perulangan (looping).

3. Performa Pencarian:
   - HashMap memiliki waktu pencarian yang sangat cepat (O(1)) karena langsung menuju ke key-nya.
   - ArrayList memerlukan waktu pencarian yang lebih lama (O(n)) karena harus mengecek satu per satu dari awal jika mencari nilai tertentu.
*/