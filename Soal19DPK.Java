import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Soal19DPK {
    public static void main(String[] args) {
        String namaFile = "catatan.txt";

        // 1. Menulis 3 baris ke file
        System.out.println("Menulis ke file...");
        try {
            FileWriter tulis = new FileWriter(namaFile);
            tulis.write("Belajar Java itu menyenangkan\n");
            tulis.write("OOP bikin kode lebih rapi\n");
            tulis.write("Besok kita bikin database\n");
            tulis.close();
            System.out.println("Berhasil ditulis!");
        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
        }

        // 2. Membaca file yang sama, tampilkan baris per baris
        System.out.println("\nMembaca dari file:");
        try {
            BufferedReader baca = new BufferedReader(new FileReader(namaFile));
            String baris;
            int nomor = 1;
            while ((baris = baca.readLine()) != null) {
                System.out.println("Baris " + nomor + ": " + baris);
                nomor++;
            }
            baca.close();
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
    // BONUS: File I/O harus pakai try-catch karena IOException itu
    // checked exception, Java WAJIB menangkapnya, kalau tidak program
    // tidak mau di-compile.
    // Kalau file-nya tidak ada, akan muncul FileNotFoundException
    // dan program langsung crash kalau tidak ditangkap.
    // Dengan try-catch, kita bisa tampilkan pesan yang enak dibaca.
}