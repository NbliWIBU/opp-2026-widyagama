public class soal13dpk {
    public static void main(String[] args) {
        BisaTerbang burung = new Burung();
        BisaTerbang pesawat = new Pesawat();

        burung.terbang();
        pesawat.terbang();
    }
}

interface BisaTerbang {
    void terbang();
}

class Burung implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Burung terbang dengan sayap");
    }
}

class Pesawat implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Pesawat terbang dengan mesin");
    }
}
