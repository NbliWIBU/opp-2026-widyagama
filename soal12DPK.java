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
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return 3.14 * r * r;
    }
}

public class soal12DPK {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        p.info();
    }
}

//Pertanyaan Bonuss
 //new BangunDatar() error karena BangunDatar adalah abstract class, yang berarti class tersebut hanya kerangka/blueprint dan belum lengkap (memiliki abstract method yang belum punya isi). Class abstract tidak boleh diinstansiasi secara langsung. Sedangkan new Persegi(5) tidak error karena Persegi adalah class konkrit yang sudah mengimplementasikan (mengisi) method abstrak luas() dari parent-nya.