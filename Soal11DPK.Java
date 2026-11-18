public class soal1 {
    public static void main(String[] args) {
        Hewan[] daftar = { new Kucing(), new Anjing(), new Sapi() };

        for (Hewan h : daftar) {
            h.suara();
        }
        return;
        // Karena terjadi polymorphism / dynamic method dispatch: walaupun tipe variabelnya Hewan, Java akan memanggil method suara() milik objek aslinya (Kucing, Anjing, Sapi) saat program berjalan, bukan milik class Hewan.
    }
}

class Hewan {
    void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk!");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Mooo!");
    }
}

