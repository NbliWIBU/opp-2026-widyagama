import java.util.ArrayList;

public class soal14dpk {
    public static void main(String[] args) {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        daftarSiswa.add(new Siswa("Andi", 80));
        daftarSiswa.add(new Siswa("Budi", 65));
        daftarSiswa.add(new Siswa("Cici", 90));

        System.out.println("--- Semua Siswa ---");
        for (Siswa s : daftarSiswa) {
            System.out.println(s.nama + ": " + s.nilai);
        }

        System.out.println("\n--- Siswa Lulus (Nilai >= 75) ---");
        for (Siswa s : daftarSiswa) {
            if (s.nilai >= 75) {
                System.out.println(s.nama + " (" + s.nilai + ")");
            }
        }

        int total = 0;
        for (Siswa s : daftarSiswa) {
            total += s.nilai;
        }
        double rataRata = (double) total / daftarSiswa.size();
        System.out.println("\nRata-rata nilai = " + rataRata);
    }
}

class Siswa {
    String nama;
    int nilai;

    public Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}