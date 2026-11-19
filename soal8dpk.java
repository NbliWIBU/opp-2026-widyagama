public class soal8dpk {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";

        System.out.println("Nama hewan: " + kucing.nama);
        kucing.suara();
    }
}
public class Hewan {
    String nama;

    public void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meong!");
    }
}

