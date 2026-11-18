import java.util.ArrayList;

class Siswa {
    private int id;
    private String nama;
    private int nilai;

    Siswa(int id, String nama, int nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    int getId() { return id; }
    void setId(int id) { this.id = id; }
    String getNama() { return nama; }
    void setNama(String nama) { this.nama = nama; }
    int getNilai() { return nilai; }
    void setNilai(int nilai) { this.nilai = nilai; }
}

class SiswaException extends Exception {
    SiswaException(String pesan) {
        super(pesan);
    }
}

class SiswaManager {
    private ArrayList<Siswa> daftar = new ArrayList<>();

    void tambah(Siswa s) throws SiswaException {
        for (Siswa x : daftar) {
            if (x.getId() == s.getId()) {
                throw new SiswaException("ID " + s.getId() + " sudah ada!");
            }
        }
        daftar.add(s);
    }

    void tampilSemua() {
        for (Siswa s : daftar) {
            System.out.println(s.getId() + " - " + s.getNama() + " - " + s.getNilai());
        }
    }

    Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftar) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new SiswaException("Siswa dengan ID " + id + " tidak ditemukan!");
    }

    void hapus(int id) throws SiswaException {
        Siswa s = cari(id); // kalau tidak ada, langsung lempar exception
        daftar.remove(s);
        System.out.println("Data " + s.getNama() + " berhasil dihapus.");
    }
}

public class Soal20DPK {
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

            System.out.println("\nCari id=2: " + manager.cari(2).getNama() + " - " + manager.cari(2).getNilai());

            System.out.println("\nHapus id=3...");
            manager.hapus(3);

            System.out.println("\n=== DATA SISWA (setelah update) ===");
            manager.tampilSemua();

        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}