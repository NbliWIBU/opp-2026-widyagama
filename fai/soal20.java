import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class soal20 {
    public static void main(String[] args) {
        SiswaManager manager = new SiswaManager();

        try {
            manager.tambah(new Siswa(1, "Andi", 80));
            manager.tambah(new Siswa(2, "Budi", 65));
            manager.tambah(new Siswa(3, "Cici", 90));
        } catch (SiswaException e) {

        }

        System.out.println("=== DATA SISWA ===");
        manager.tampilSemua();
        System.out.println();

        System.out.println("Tambah siswa baru: id=4, nama=Dodi, nilai=75");
        try {
            manager.tambah(new Siswa(4, "Dodi", 75));
            System.out.println("Data Dodi berhasil ditambahkan.");
        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Cari id=2:");
        try {
            Siswa ditemukan = manager.cari(2);
            System.out.println(ditemukan.getInfo());
        } catch (SiswaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        manager.simpanKeFile();
        System.out.println("[Sistem: Data berhasil disimpan ke " + "data_siswa.txt]");
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
    
   
    public String getInfo() {
        return id + " - " + nama + " - " + nilai;
    }
}

class SiswaException extends Exception {
    public SiswaException(String message) {
        super(message);
    }
}


class SiswaManager {
 
    private ArrayList<Siswa> daftarSiswa;
    private final String NAMA_FILE = "data_siswa.txt";

    public SiswaManager() {
        daftarSiswa = new ArrayList<>();
        loadDariFile(); 
    }

   

    
    public void tambah(Siswa s) throws SiswaException {
      
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getId() == s.getId()) {
                throw new SiswaException("Siswa dengan ID " + s.getId() + " sudah ada!");
            }
        }
        daftarSiswa.add(s);
    }

   
    public void tampilSemua() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("Data kosong.");
            return;
        }
        for (Siswa s : daftarSiswa) {
            System.out.println(s.getInfo());
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
        Siswa siswaDihapus = null;
        for (Siswa s : daftarSiswa) {
            if (s.getId() == id) {
                siswaDihapus = s;
                break;
            }
        }
        
        if (siswaDihapus != null) {
            daftarSiswa.remove(siswaDihapus);
        } else {
            throw new SiswaException("Gagal menghapus. Siswa dengan ID " + id + " tidak ditemukan!");
        }
    }

   

    public void simpanKeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NAMA_FILE))) {
            for (Siswa s : daftarSiswa) {
                
                writer.write(s.getId() + "," + s.getNama() + "," + s.getNilai());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file: " + e.getMessage());
        }
    }

    public void loadDariFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NAMA_FILE))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] parts = baris.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String nama = parts[1];
                    int nilai = Integer.parseInt(parts[2]);
                    daftarSiswa.add(new Siswa(id, nama, nilai));
                }
            }
        } catch (IOException e) {
           
        }
    }
}


