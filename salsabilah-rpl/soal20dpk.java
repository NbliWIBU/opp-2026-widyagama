
import java.util.ArrayList;
import java.io.*;

class Siswa {
    private int id;
    private String nama;
    private double nilai;

    public Siswa(int id, String nama, double nilai) {
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

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void tampilkan() {
        System.out.println("ID: " + id +
            ", Nama: " + nama +
            ", Nilai: " + nilai);
    }
}

// Custom Exception
class SiswaException extends Exception {
    public SiswaException(String pesan) {
        super(pesan);
    }
}

// Class SiswaManager
class SiswaManager {
    private ArrayList<Siswa> daftar = new ArrayList<>();

    // Menambah siswa
    public void tambah(Siswa s) throws SiswaException {
        for (Siswa siswa : daftar) {
            if (siswa.getId() == s.getId()) {
                throw new SiswaException("ID sudah ada!");
            }
        }

        daftar.add(s);
        System.out.println("Siswa berhasil ditambahkan.");
    }

    // Menampilkan semua siswa
    public void tampilSemua() {
        System.out.println("\n=== DATA SISWA ===");

        if (daftar.isEmpty()) {
            System.out.println("Data siswa masih kosong.");
        }

        for (Siswa s : daftar) {
            s.tampilkan();
        }
    }

    // Mencari siswa
    public Siswa cari(int id) throws SiswaException {
        for (Siswa s : daftar) {
            if (s.getId() == id) {
                return s;
            }
        }

        throw new SiswaException("Siswa tidak ditemukan!");
    }

    // Menghapus siswa
    public void hapus(int id) throws SiswaException {
        Siswa s = cari(id);
        daftar.remove(s);
        System.out.println("Siswa berhasil dihapus.");
    }

    // Menyimpan data ke file
    public void simpanFile() {
        try {
            BufferedWriter tulis =
                new BufferedWriter(new FileWriter("data_siswa.txt"));

            for (Siswa s : daftar) {
                tulis.write(s.getId() + "," +
                    s.getNama() + "," + s.getNilai());
                tulis.newLine();
            }

            tulis.close();
            System.out.println("Data berhasil disimpan ke file.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }

    // Membaca data dari file
    public void bacaFile() {
        try {
            BufferedReader baca =
                new BufferedReader(new FileReader("data_siswa.txt"));

            String baris;
            System.out.println("\n=== ISI FILE ===");

            while ((baris = baca.readLine()) != null) {
                System.out.println(baris);
            }

            baca.close();

        } catch (IOException e) {
            System.out.println("File belum tersedia.");
        }
    }
}

// Main Program
public class Main {
    public static void main(String[] args) {

        SiswaManager manager = new SiswaManager();

        try {
            // Menambahkan siswa
            manager.tambah(new Siswa(1, "Budi", 85));
            manager.tambah(new Siswa(2, "Andi", 90));
            manager.tambah(new Siswa(3, "Chofifa", 95));

            // Menampilkan semua siswa
            manager.tampilSemua();

            // Mencari siswa
            System.out.println("\n=== HASIL PENCARIAN ===");
            manager.cari(2).tampilkan();

            // Menghapus siswa
            manager.hapus(1);

            // Menampilkan data setelah dihapus
            manager.tampilSemua();

            // Menyimpan dan membaca file
            manager.simpanFile();
            manager.bacaFile();

        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
