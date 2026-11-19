public class soal8 {
    public static void main(String[] args) {

        Kucing k = new Kucing();

        k.nama = "Kitty";

        k.suara();
    }
}

class Hewan {
    
    String nama;

    
    public void suara() {
        System.out.println(nama + " bersuara: ...");
    }
}


class Kucing extends Hewan {
    
    
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}


