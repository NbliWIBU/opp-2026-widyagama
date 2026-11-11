 public class Soal6 {
    public static void main(String[] args) {
        Makanan m1 = new Makanan();
        m1.setNama("Nasi Goreng");
        m1.setHarga(15000);
        m1.setPorsi("Besar");

        Minuman m2 = new Minuman();
        m2.setNama("Es Teh");
        m2.setHarga(5000);
        m2.setUkuran("Large");

        System.out.println("=== DAFTAR MENU ===");
        m1.tampilMenu();
        m2.tampilMenu();
        System.out.println("--------------------");

        int total = m1.getHarga() + m2.getHarga();
        System.out.println("Total harga: Rp" + total);
    }
}

class Menu {
    private String nama;
    private int harga;

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getHarga() { return harga; }
    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga harus > 0");
        }
    }

    void tampilMenu() {
        System.out.println(getNama() + " - Rp" + getHarga());
    }
}

class Makanan extends Menu {
    private String porsi;

    public String getPorsi() { return porsi; }
    public void setPorsi(String porsi) { this.porsi = porsi; }

    @Override
    void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama() + " - Rp" + getHarga() + " (Porsi: " + porsi + ")");
    }
}

class Minuman extends Menu {
    private String ukuran;

    public String getUkuran() { return ukuran; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }

    @Override
    void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama() + " - Rp" + getHarga() + " (Ukuran: " + ukuran + ")");
    }
}

