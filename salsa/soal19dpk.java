import java.io.*;

public class soal19dpk {
    public static void main(String[] args) {
        try {
            // Menulis ke file
            FileWriter tulis = new FileWriter("catatan.txt");

            tulis.write("Belajar Java itu menyenangkan\n");
            tulis.write("OOP bikin kode lebih rapi\n");
            tulis.write("Besok kita bikin database\n");

            tulis.close();

            System.out.println("Menulis ke file...");
            System.out.println("Berhasil ditulis!");

            // Membaca file
            BufferedReader baca = new BufferedReader(
                new FileReader("catatan.txt")
            );

            System.out.println("\nMembaca dari file:");

            String baris;
            int nomor = 1;

            while ((baris = baca.readLine()) != null) {
                System.out.println("Baris " + nomor + ": " + baris);
                nomor++;
            }

            baca.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}