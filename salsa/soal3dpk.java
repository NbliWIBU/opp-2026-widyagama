class Produk {
    String namaProduk;
    int harga;

    // Constructor
    Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    void tampil() {
        System.out.println(namaProduk + " - " + harga);
    }
}

public class soal3dpk {
    public static void main(String[] args) {
        Produk p1 = new Produk("Kopi Susu", 15000);
        p1.tampil();
    }
}