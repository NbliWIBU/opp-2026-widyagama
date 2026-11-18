public class soal13 {
    public static void main(String[] args) {

        Burung burungku = new Burung();
        Pesawat pesawatku = new Pesawat();

        burungku.terbang();
        pesawatku.terbang();
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
