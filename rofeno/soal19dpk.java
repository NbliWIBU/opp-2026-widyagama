import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class soal19dpk {
    public static void main(String[] args) {
        String namaFile = "catatan.txt";

        System.out.println("Menulis ke file...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("Belajar Java itu menyenangkan");
            writer.newLine();
            writer.write("OOP bikin kode lebih rapi");
            writer.newLine();
            writer.write("Besok kita bikin database");
            writer.newLine();
            System.out.println("Berhasil ditulis!");
        } catch (IOException e) {
            System.out.println("Gagal menulis ke file: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Membaca dari file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            int nomorBaris = 1;
            while ((baris = reader.readLine()) != null) {
                System.out.println("Baris " + nomorBaris + ": " + baris);
                nomorBaris++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}

/*

PERTANYAAN BONUS:
Kenapa File I/O harus pakai try-catch? Apa yang terjadi kalau file-nya tidak ada?

JAWABAN:
File I/O harus menggunakan try-catch karena operasi membaca dan menulis file melibatkan 
sistem operasi dan perangkat keras (hardisk/SSD) yang bisa saja gagal di tengah jalan. 
Kegagalan ini bisa disebabkan oleh banyak hal, seperti file tidak ditemukan, akses 
ditolak (file sedang dipakai program lain), atau hardisk penuh. Di Java, error-error 
ini dilempar dalam bentuk IOException (Checked Exception), yang wajib ditangani 
menggunakan try-catch atau throws, jika tidak, kode tidak akan bisa di-compile.

Jika file-nya tidak ada:
- Saat MENULIS (FileWriter): File baru akan otomatis dibuat oleh Java (jika foldernya ada).
- Saat MEMBACA (FileReader): Program akan melempar exception berjenis FileNotFoundException 
  (yang merupakan turunan dari IOException). Jika ditangkap oleh try-catch, program tidak akan 
  crash, melainkan akan menjalankan blok catch dan menampilkan pesan error yang kita buat.
  
*/