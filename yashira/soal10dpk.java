// Class Induk dengan Enkapsulasi
class Menu {
    private String nama;
    private int harga;

    // Getter & Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter untuk harga dengan validasi > 0
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga harus lebih dari 0!");
        }
    }

    // Method dasar untuk di-override
    public void tampilMenu() {
        System.out.println(nama + " - Rp" + harga);
    }
}

// Class Anak Makanan (Inheritance)
class Makanan extends Menu {
    private String porsi;

    public String getPorsi() {
        return porsi;
    }

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    // Method Overriding
    @Override
    public void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama() + " - Rp" + getHarga() + " (Porsi: " + porsi + ")");
    }
}

// Class Anak Minuman (Inheritance)
class Minuman extends Menu {
    private String ukuran;

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    // Method Overriding
    @Override
    public void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama() + " - Rp" + getHarga() + " (Ukuran: " + ukuran + ")");
    }
}

// Class Utama (Main)
public class soal10dpk {
    public static void main(String[] args) {
        // Membuat objek Makanan
        Makanan mkn = new Makanan();
        mkn.setNama("Nasi Goreng");
        mkn.setHarga(15000);
        mkn.setPorsi("Besar");

        // Membuat objek Minuman
        Minuman mnm = new Minuman();
        mnm.setNama("Es Teh");
        mnm.setHarga(5000);
        mnm.setUkuran("Large");

        // Menampilkan daftar menu
        System.out.println("=== DAFTAR MENU ===");
        mkn.tampilMenu();
        mnm.tampilMenu();
        System.out.println("------------------");

        // Menghitung total harga
        int totalHarga = mkn.getHarga() + mnm.getHarga();
        System.out.println("Total harga: Rp" + totalHarga);
    }
}