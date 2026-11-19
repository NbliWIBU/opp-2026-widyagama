import java.util.Scanner;
import java.util.InputMismatchException;

public class soal18dpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pertama: ");
            int a = sc.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int b = sc.nextInt();

            System.out.println("Hasil: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus angka!");
        }
        sc.close();
    }
}