
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

public class soal14{
    public static void main(String[] args) {
        Burung b = new Burung();
        b.terbang();

        Pesawat p = new Pesawat();
        p.terbang();
    }
}
