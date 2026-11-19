import java.util.Scanner;
public class soal16dpk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pertama: ");
            double a = Double.parseDouble(input.nextLine());            System.out.print("Masukkan angka kedua: ");
            double b = Double.parseDouble(input.nextLine());
            double hasil = a / b;
            if (b == 0) {
                throw new ArithmeticException();
            }            System.out.println("Hasil pembagian: " + hasil);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa angka!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        }
        input.close();
    }
}