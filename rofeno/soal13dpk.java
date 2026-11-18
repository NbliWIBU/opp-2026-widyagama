interface BisaTerbang {
    void terbang();
}

class Burung implements BisaTerbang {
    public void terbang() {
        System.out.println("Burung terbang dengan sayap");
    }
}

class Pesawat implements BisaTerbang {
    public void terbang() {
        System.out.println("Pesawat terbang dengan mesin");
    }
}

public class soal13dpk {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Pesawat pesawat = new Pesawat();

        burung.terbang();
        pesawat.terbang();
    }
}