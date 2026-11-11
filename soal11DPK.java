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

public class soal11DPK {
    public static void main(String[] args) {
        Hewan[] daftar = { new Kucing(), new Anjing(), new Sapi() };
        for (Hewan h : daftar) {
            h.suara();
        }
    }
}


//Pertanyaan bonus
 //h.suara() bisa memanggil method yang berbeda karena adanya Polymorphism (Dynamic Method Dispatch). Meskipun variabel h bertipe Hewan, Java akan melihat tipe objek aslinya saat program berjalan (runtime). Karena objek aslinya adalah Kucing, Anjing, atau Sapi yang melakukan override method suara(), maka method milik class anak yang akan dieksekusi.