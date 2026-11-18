import java.util.ArrayList;

class Siswa {
    String nama;
    int nilai;

    // Constructor
    Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class soal14dpk {
    public static void main(String[] args) {

        // Membuat ArrayList
        ArrayList<Siswa> daftar = new ArrayList<>();

        // Mengisi 3 siswa
        daftar.add(new Siswa("Andi", 80));
        daftar.add(new Siswa("Budi", 65));
        daftar.add(new Siswa("Cici", 90));

        // Menampilkan semua siswa
        System.out.println("=== DAFTAR SISWA ===");

        int total = 0;

        for (Siswa s : daftar) {
            System.out.println(s.nama + " - " + s.nilai);
            total += s.nilai;
        }

        // Menampilkan siswa yang lulus
        System.out.println("\n=== SISWA LULUS ===");

        for (Siswa s : daftar) {
            if (s.nilai >= 75) {
                System.out.println(s.nama + " - " + s.nilai);
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / daftar.size();

        System.out.printf("\nRata-rata nilai: %.2f\n", rataRata);
    }
}