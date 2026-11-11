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

public class soal13DPK {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.terbang();

        Pesawat pesawat = new Pesawat();
        pesawat.terbang();
    }
}

//Pertanyaan Bonusw
 //Abstract Class: Digunakan ketika class-class turunan memiliki kesamaan sifat/atribut dasar (bisa punya variabel dan method biasa). Gunakan ini jika hubungannya "adalah" (is-a) dan Anda ingin berbagi kode (inheritance).

 //Interface: Digunakan sebagai "kontrak" kemampuan yang bisa dimiliki oleh class apa pun, tanpa memedulikan hierarki induknya. Interface hanya berisi deklarasi method (di Java modern bisa ada default method). Gunakan ini jika Anda ingin mendefinisikan kemampuan spesifik (misal: BisaTerbang) yang bisa dimiliki oleh makhluk hidup, benda mati, dll.