 public class Hewan {
    void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk guk!");
    }
}

class Sapi extends Hewan {
    void suara() {
        System.out.println("Mooo!");
    }
}

public class soal11dpk {
    public static void main(String[] args) {
        Hewan[] daftar = {
            new Kucing(),
            new Anjing(),
            new Sapi()
        };

        for (Hewan h : daftar) {
            h.suara();
        }
    }
}

// Karena polymorphism, method yang dipanggil mengikuti jenis objek sebenarnya.