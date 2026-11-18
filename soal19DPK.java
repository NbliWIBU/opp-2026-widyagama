import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class soal19DPK {
    public static void main(String[] args) {
        String namaFile = "catatan.txt";
        
        System.out.println("Menulis ke file...");
        try (FileWriter writer = new FileWriter(namaFile)) {
            writer.write("Belajar Java itu menyenangkan\n");
            writer.write("OOP bikin kode lebih rapi\n");
            writer.write("Besok kita bikin database\n");
            System.out.println("Berhasil ditulis!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }

        System.out.println("\nMembaca dari file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            int nomor = 1;
            while ((baris = reader.readLine()) != null) {
                System.out.println("Baris " + nomor + ": " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}

//Pertanyaan
//File I/O (Input/Output) wajib pakai try-catch karena operasi membaca/menulis file melibatkan sistem operasi dan hardisk yang rentan terhadap kegagalan (misal: file terkunci, tidak ada izin akses, atau hardisk penuh). Jika file catatan.txt tidak ada saat dibaca, program akan melempar FileNotFoundException. Tanpa try-catch, program langsung crash.