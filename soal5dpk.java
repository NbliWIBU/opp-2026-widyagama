public class soal5dpk {
    public static void main(String[] args) {
        Barang b1 = new Barang("Indomie", 3000, 10);
        Barang b2 = new Barang("Teh Botol", 5000, 5);

        b1.info();

        System.out.println("Beli 3 Indomie...");
        b1.beli(3);
        System.out.println();

        System.out.println("Beli 20 Indomie...");
        b1.beli(20);
        System.out.println();

        b2.info();
    }
}

public class Barang {
    String nama;
    int harga;
    int stok;

    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void beli(int jumlah) {
        if (stok >= jumlah) {
            stok = stok - jumlah;
            System.out.println("Stok " + nama +
                    " sekarang: " + stok);
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}
