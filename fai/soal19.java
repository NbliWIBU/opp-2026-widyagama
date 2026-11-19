import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class soal19 {
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

        System.out.println();

        
        System.out.println("Membaca dari file:");
        
        try {
            File file = new File(namaFile);
            Scanner reader = new Scanner(file);
            
            int nomorBaris = 1;
            
            while (reader.hasNextLine()) {
                String baris = reader.nextLine();
                System.out.println("Baris " + nomorBaris + ": " + baris);
                nomorBaris++;
            }
            
            reader.close();
            
        } catch (IOException e) {
            
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}