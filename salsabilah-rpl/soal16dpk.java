import java.util.Scanner;

class Pembagian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;

            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Angka tidak boleh dibagi 0!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");

        } finally {
            input.close();
        }
    }
}