class Barang {
    String nama;
    int harga;
    int stok;

    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void beli(int jumlah) {
        System.out.println("Beli " + jumlah + " " + nama + "...");
        if (jumlah <= stok) {
            stok = stok - jumlah;
            System.out.println("Stok " + nama + " sekarang: " + stok);
        } else {
            System.out.println("Stok tidak cukup!");
        }
        System.out.println();
    }

    void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}

public class soal4DPK {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Indomie", 3000, 10);
        Barang barang2 = new Barang("Teh Botol", 5000, 5);

        barang1.info();
        barang1.beli(3);
        barang1.beli(20);

        barang2.info();
    }
}