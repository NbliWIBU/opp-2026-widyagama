class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        setHarga(harga);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

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

    public void tampilMenu() {
        System.out.println(nama + " - Rp" + harga);
    }
}

class Makanan extends Menu {
    private String porsi;

    public Makanan(String nama, int harga, String porsi) {
        super(nama, harga);
        this.porsi = porsi;
    }

    @Override
    public void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama() + " - Rp" + getHarga() + " (Porsi: " + porsi + ")");
    }
}

class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, int harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama() + " - Rp" + getHarga() + " (Ukuran: " + ukuran + ")");
    }
}

public class soal10DPK {
    public static void main(String[] args) {
        Makanan mkn = new Makanan("Nasi Goreng", 15000, "Besar");
        Minuman mnm = new Minuman("Es Teh", 5000, "Large");

        System.out.println("=== DAFTAR MENU ===");
        mkn.tampilMenu();
        mnm.tampilMenu();
        
        System.out.println("-------------------");
        
        int totalHarga = mkn.getHarga() + mnm.getHarga();
        System.out.println("Total harga: Rp" + totalHarga);
    }
}