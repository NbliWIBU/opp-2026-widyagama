import java.util.ArrayList; 

public class soal14 { 

    public static void main(String[] args) {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        
        
        daftarSiswa.add(new Siswa("Andi", 80));
        daftarSiswa.add(new Siswa("Budi", 65));
        daftarSiswa.add(new Siswa("Cici", 90));

        System.out.println("=== DAFTAR SISWA ===");
        for (Siswa s : daftarSiswa) {
            System.out.println(s.nama + " - " + s.nilai);
        }
        
        System.out.println();
        System.out.println("=== SISWA LULUS ===");
        for (Siswa s : daftarSiswa) {
            if (s.nilai >= 75) {
                System.out.println(s.nama + " - " + s.nilai);
            }
        }
        
        System.out.println();
        double totalNilai = 0;
        for (Siswa s : daftarSiswa) {
            totalNilai += s.nilai;
        }
        
        double rataRata = totalNilai / daftarSiswa.size();
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
    }
}


class Siswa {
    String nama;
    int nilai;

    Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}