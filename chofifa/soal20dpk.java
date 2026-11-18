import java.util.ArrayList;
import java.io.*;

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

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}

class SiswaException extends Exception {
    public SiswaException(String pesan) {
        super(pesan);
    }
}

class SiswaManager {
    private ArrayList<Siswa> daftar = new ArrayList<>();

    public void tambah(Siswa s) throws SiswaException {
        for (Siswa data : daftar) {
            if (data.getId() == s.getId()) {
                throw new SiswaException("ID sudah ada!");
            }
        }
        daftar.add(s);
    }

    public void tampilSemua() {
        System.out.println("=== DATA SISWA ===");
        for (Siswa s : daftar) {
            System.out.println(s.getId() + " - " +
                s.getNama() + " - " + s.getNilai());
        }
    }

    public Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftar) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new SiswaException("Siswa tidak ditemukan!");
    }

    public void hapus(int id) throws SiswaException {
        Siswa s = cari(id);
        daftar.remove(s);
    }

    public void simpanFile() {
        try {
            FileWriter file = new FileWriter("data_siswa.txt");

            for (Siswa s : daftar) {
                file.write(s.getId() + " - " +
                    s.getNama() + " - " + s.getNilai() + "\n");
            }

            file.close();
            System.out.println("Data berhasil disimpan!");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan file!");
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

            manager.tampilSemua();

            System.out.println("\nTambah siswa baru: id=4, nama=Dodi, nilai=75");
            manager.tambah(new Siswa(4, "Dodi", 75));
            System.out.println("Data Dodi berhasil ditambahkan.");

            Siswa hasil = manager.cari(2);
            System.out.println("\nCari id=2: " +
                hasil.getNama() + " - " + hasil.getNilai());

            System.out.println("\nHapus id=3...");
            manager.hapus(3);
            System.out.println("Data Cici berhasil dihapus.");

            System.out.println("\n=== DATA SISWA (setelah update) ===");
            manager.tampilSemua();

            manager.simpanFile();

        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}