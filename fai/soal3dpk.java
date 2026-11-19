
public class soal3dpk {
    public static void main(String[] args) {
        
        Produk p1 = new Produk("Kopi Susu", 15000);
        p1.tampilkan();
    }
}

public class Produk {
    
    String namaProduk;
    int harga;

    
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    
    void tampilkan() {
        System.out.println("Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
    }
}
