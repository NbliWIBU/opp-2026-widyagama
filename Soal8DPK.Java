public class Soal6 {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kitty";
        k.suara();
    }
}

class Hewan {
    String nama;

    void suara() {
        System.out.println(nama + " bersuara: ...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

