public class Main {
    public static void main(String[] args) {

        Hewan[] hewan = {
            new Kucing(),
            new Anjing(),
            new Sapi()
        };

        for (Hewan h : hewan) {
            h.suara();
        }
    }
}

class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong... Meong...");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk... Guk...");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Moo... Moo...");
    }
}
// Karena menggunakan konsep Polymorphism, method suara()
// yang dipanggil akan menyesuaikan dengan jenis objek aslinya.