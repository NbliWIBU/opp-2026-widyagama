import java.util.ArrayList;

public class Soal14DPK {
    public static void main(String[] args) {
        ArrayList<Siswa> daftar = new ArrayList<>();
        daftar.add(new Siswa("Andi", 80));
        daftar.add(new Siswa("Budi", 65));
        daftar.add(new Siswa("Cici", 90));

        // 1. Print semua nama + nilai
        System.out.println("=== DAFTAR SISWA ===");
        for (Siswa s : daftar) {
            System.out.println(s.nama + " - " + s.nilai);
        }

        // 2. Print hanya siswa dengan nilai >= 75 (lulus)
        System.out.println("\n=== SISWA LULUS ===");
        for (Siswa s : daftar) {
            if (s.nilai >= 75) {
                System.out.println(s.nama + " - " + s.nilai);
            }
        }

        // 3. Print rata-rata nilai
        double total = 0;
        for (Siswa s : daftar) {
            total += s.nilai;
        }
        double rata = total / daftar.size();
        System.out.println("\nRata-rata nilai: " + String.format("%.2f", rata));
    }
    // BONUS: ArrayList dipakai untuk menyimpan banyak object, ukurannya fleksibel.
    // Kalau pakai array biasa, ukurannya tetap dan tidak bisa nambah.
    // Loop for-each dipakai untuk membaca semua isi ArrayList satu per satu.
}

class Siswa {
    String nama;
    int nilai;
    Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

