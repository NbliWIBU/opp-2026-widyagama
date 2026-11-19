 public class Produk {
    String namaProduk;
    int harga;

    Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

public class soaldpk3 {
    public static void main(String[] args) {
        Produk p1 = new Produk("Kopi Susu", 15000);
        p1.tampilkan();
    }
}