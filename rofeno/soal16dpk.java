import java.util.InputMismatchException;
import java.util.Scanner;

public class soal16dpk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input bukan angka!");
        } finally {
            scanner.close();
        }
    }
}

/*
 * PERTANYAAN BONUS:
 * Tanpa try-catch, apa yang terjadi kalau pembagi = 0?
 * 
 * JAWABAN:
 * Program akan crash (berhenti secara paksa) dan melemparkan error 
 * ArithmeticException: / by zero. Karena error tersebut tidak ditangkap, 
 * program akan langsung berhenti dan baris kode di bawahnya tidak akan dieksekusi.
 */