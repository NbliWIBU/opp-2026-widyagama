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

    @Override
    double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class soal12dpk {
    public static void main(String[] args) {

        Persegi p = new Persegi(5);
        p.info();

        Lingkaran l = new Lingkaran(7);
        l.info();
    }
}

// Jawaban bonus:
// new BangunDatar() error karena BangunDatar merupakan abstract class
// yang tidak dapat dibuat objek secara langsung.
// Sedangkan new Persegi(5) tidak error karena Persegi adalah class biasa
// yang sudah mengimplementasikan method luas() dari BangunDatar.