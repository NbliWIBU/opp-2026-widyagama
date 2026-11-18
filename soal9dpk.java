public class soal8dpk {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Jumlah 2 angka: " + kalkulator.tambah(10, 20));
        System.out.println("Jumlah 3 angka: " + kalkulator.tambah(10, 20, 30));
        System.out.println("Jumlah desimal: " + kalkulator.tambah(2.5, 3.5));
    }
}

class Kalkulator {

    public int tambah(int a, int b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    public double tambah(double a, double b) {
        return a + b;
    }
}


