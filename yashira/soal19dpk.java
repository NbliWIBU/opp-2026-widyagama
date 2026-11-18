
import java.io.*;

class soal19dpk {
    public static void main(String[] args) {
        System.out.println("Menulis ke file...");
        try {
            FileWriter tulis = new FileWriter("catatan.txt");
            tulis.write("Belajar Java itu menyenangkan\n");
            tulis.write("OOP bikin kode lebih rapi\n");
            tulis.write("Besok kita bikin database\n");
            tulis.close();
            System.out.println("Berhasil ditulis!");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("\nMembaca dari file:");
        try {
            BufferedReader baca = new BufferedReader(new FileReader("catatan.txt"));
            String baris;
            int nomor = 1;
            while ((baris = baca.readLine()) != null) {
                System.out.println("Baris " + nomor + ": " + baris);
                nomor++;
            }
            baca.close();
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}