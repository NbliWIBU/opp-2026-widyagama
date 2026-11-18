class Barang {
    String nama;
    int harga;
    int stok;

    // Constructor untuk isi ketiganya
    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method beli
    void beli(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    // Method info
    void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}

public class soal5dpk {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Indomie", 3000, 10);
        Barang barang2 = new Barang("Teh Botol", 5000, 5);

        // Tampil barang 1
        barang1.info();

        // Beli 3
        System.out.println("Beli 3 Indomie...");
        barang1.beli(3);
        System.out.println("Stok Indomie sekarang: " + barang1.stok);
        System.out.println();

        // Beli 20 (gagal)
        System.out.println("Beli 20 Indomie...");
        barang1.beli(20);
        System.out.println();

        // Tampil barang 2
        barang2.info();
    }
}