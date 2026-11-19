abstract class BangunDatar {
    abstract double luas();

    void info() {
        System.out.println("Luas bangun = " + luas());
    }
}
class Persegi extends BangunDatar {
    double sisi;
    Persegi(double sisi) {
        this.sisi = sisi;
    }
    double luas() {
        return sisi * sisi;
    }
}
class Lingkaran extends BangunDatar {
    double jari;
    Lingkaran(double jari) {
        this.jari = jari;
    }
    double luas() {
        return 3.14 * jari * jari;
    }
}
public class soal12dpk {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        Lingkaran l = new Lingkaran(7);
        p.info();
        l.info();
    }
}
// BangunDatar error karena abstract class tidak bisa dibuat objek langsung.