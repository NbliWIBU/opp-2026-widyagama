import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

class SiswaException extends Exception {
    public SiswaException(String message) {
        super(message);
    }
}

class Siswa {
    private int id;
    private String nama;
    private int nilai;

    public Siswa(int id, String nama, int nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getNilai() { return nilai; }
    public void setNilai(int nilai) { this.nilai = nilai; }

    @Override
    public String toString() {
        return id + " - " + nama + " - " + nilai;
    }
}

class SiswaManager {
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambah(Siswa s) throws SiswaException {
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getId() == s.getId()) {
                throw new SiswaException("ID " + s.getId() + " sudah ada!");
            }
        }
        daftarSiswa.add(s);
    }

    public void tampilSemua() {
        for (Siswa s : daftarSiswa) {
            System.out.println(s.toString());
        }
    }

    public Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new SiswaException("Siswa dengan ID " + id + " tidak ditemukan.");
    }

    public void hapus(int id) throws SiswaException {
        Siswa siswaDihapus = cari(id);
        daftarSiswa.remove(siswaDihapus);
    }

    public void simpanKeFile(String namaFile) {
        try (FileWriter writer = new FileWriter(namaFile)) {
            for (Siswa s : daftarSiswa) {
                writer.write(s.getId() + "," + s.getNama() + "," + s.getNilai() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file: " + e.getMessage());
        }
    }
}

public class soal20DPK {
    public static void main(String[] args) {
        SiswaManager manager = new SiswaManager();

        try {
            manager.tambah(new Siswa(1, "Andi", 80));
            manager.tambah(new Siswa(2, "Budi", 65));
            manager.tambah(new Siswa(3, "Cici", 90));

            System.out.println("=== DATA SISWA ===");
            manager.tampilSemua();

            System.out.println("\nTambah siswa baru: id=4, nama=Dodi, nilai=75");
            manager.tambah(new Siswa(4, "Dodi", 75));
            System.out.println("Data Dodi berhasil ditambahkan.");

            System.out.println("\nCari id=2:");
            Siswa ditemukan = manager.cari(2);
            System.out.println(ditemukan.toString());

            System.out.println("\nHapus id=3...");
            manager.hapus(3);
            System.out.println("Data Cici berhasil dihapus.");

            System.out.println("\n=== DATA SISWA (setelah update) ===");
            manager.tampilSemua();

            manager.simpanKeFile("data_siswa.txt");
            System.out.println("\n(Data juga telah disimpan ke data_siswa.txt)");

        } catch (SiswaException e) {
            System.out.println("Terjadi Error: " + e.getMessage());
        }
    }
}