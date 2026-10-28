class Hewan {
    String nama;

    public void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

public class soal8DPK {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kitty";
        k.suara();
    }
}