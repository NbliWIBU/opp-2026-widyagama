import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Catatan {
    public static void main(String[] args) {

        // Menulis 3 baris ke file
        try {
            FileWriter tulis = new FileWriter("catatan.txt");

            tulis.write("Halo, nama saya Chofifa.\n");
            tulis.write("Saya sedang belajar Java.\n");
            tulis.write("Saya belajar membaca dan menulis file.");

            tulis.close();

            System.out.println("Berhasil menulis file!");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
        }

        // Membaca isi file
        try {
            BufferedReader baca = new BufferedReader(
                new FileReader("catatan.txt")
            );

            String baris;

            System.out.println("\nIsi file catatan.txt:");

            while ((baris = baca.readLine()) != null) {
                System.out.println(baris);
            }

            baca.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
        }
    }
}