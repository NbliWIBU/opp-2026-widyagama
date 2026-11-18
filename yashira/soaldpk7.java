class Hewan {
    String nama;

    void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kitty";
        k.suara();
    }
}