import java.util.Scanner;
import java.util.InputMismatchException;

public class Soal16DPK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            int hasil = a / b;
            System.out.println("Hasil: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        } finally {
            input.close();
        }
    }
    
}