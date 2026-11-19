import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Siswa {
    private int id;
    private String nama;
    private int nilai;

    public Siswa(int id, String nama, int nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}

class SiswaException extends Exception {
    public SiswaException(String message) {
        super(message);
    }
}

class SiswaManager {
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambah(Siswa s) throws SiswaException {
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getId() == s.getId()) {
                throw new SiswaException("Siswa dengan ID " + s.getId() + " sudah ada!");
            }
        }
        daftarSiswa.add(s);
        System.out.println("Data " + s.getNama() + " berhasil ditambahkan.");
    }

    public void tampilSemua() {
        System.out.println("=== DATA SISWA ===");
        for (Siswa s : daftarSiswa) {
            System.out.println(s.getId() + " - " + s.getNama() + " - " + s.getNilai());
        }
    }

    public Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new SiswaException("Siswa dengan ID " + id + " tidak ditemukan!");
    }

    public void hapus(int id) throws SiswaException {
        Siswa siswaDitemukan = cari(id);
        daftarSiswa.remove(siswaDitemukan);
        System.out.println("Data " + siswaDitemukan.getNama() + " berhasil dihapus.");
    }

    public void simpanKeFile(String namaFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (Siswa s : daftarSiswa) {
                writer.write(s.getId() + "," + s.getNama() + "," + s.getNilai());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}

public class soal20dpk {
    public static void main(String[] args) {
        SiswaManager manager = new SiswaManager();

        try {
            manager.tambah(new Siswa(1, "Andi", 80));
            manager.tambah(new Siswa(2, "Budi", 65));
            manager.tambah(new Siswa(3, "Cici", 90));

            System.out.println();
            manager.tampilSemua();

            System.out.println();
            System.out.println("Tambah siswa baru: id=4, nama=Dodi, nilai=75");
            manager.tambah(new Siswa(4, "Dodi", 75));

            System.out.println();
            System.out.print("Cari id=2: ");
            Siswa siswaCari = manager.cari(2);
            System.out.println(siswaCari.getNama() + " - " + siswaCari.getNilai());

            System.out.println();
            System.out.println("Hapus id=3...");
            manager.hapus(3);

            System.out.println();
            System.out.println("=== DATA SISWA (setelah update) ===");
            manager.tampilSemua();

            manager.simpanKeFile("data_siswa.txt");

        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}