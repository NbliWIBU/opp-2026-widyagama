public class soal12 {
    public static void main(String[] args) {

        Persegi p = new Persegi(5);
        p.info();

        Lingkaran l = new Lingkaran(7);
        l.info();

    }
}

abstract class BangunDatar {
    
    
    public abstract double luas();

   
    public void info() {
        System.out.println("Luas bangun = " + luas());
    }
}


class Persegi extends BangunDatar {
    private double sisi;

  
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

   
    @Override
    public double luas() {
        return sisi * sisi; 
    }
}


class Lingkaran extends BangunDatar {
    private double jariJari;

   
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

   
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
