import java.util.Scanner;
import java.util.InputMismatchException;

public class soal16DPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pertama: ");
            int a = scanner.nextInt();
            
            System.out.print("Masukkan angka kedua: ");
            int b = scanner.nextInt();
            
            int hasil = a / b;
            System.out.println("Hasil: " + hasil);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        }
    }
}

//pertanyaan bonus
//Tanpa try-catch, jika pembagi = 0, program akan berhenti mendadak (crash) dan melempar error ArithmeticException: / by zero. Jika input bukan angka, akan melempar InputMismatchException