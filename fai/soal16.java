import java.util.InputMismatchException;
import java.util.Scanner;

public class soal16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

          
            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            
            int hasil = angka1 / angka2;
            
            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
          
            System.out.println("Error: Tidak bisa membagi dengan nol!");
            
        } catch (InputMismatchException e) {
           
            System.out.println("Error: Input harus berupa angka!");
            
        } finally {
           
            scanner.close();
        }
    }
}