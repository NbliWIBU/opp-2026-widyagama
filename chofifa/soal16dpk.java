import java.util.Scanner;

public class soal16dpk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            if (b == 0) {
                throw new ArithmeticException();
            }

            System.out.println("Hasil pembagian: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka!");
        }
    }
}