public class soal10dpk {
    public static void main(String[] args) {
        Makanan makanan = new Makanan();
        makanan.setNama("Nasi Goreng");
        makanan.setHarga(15000);
        makanan.setPorsi(1);

        Minuman minuman = new Minuman();
        minuman.setNama("Es Teh");
        minuman.setHarga(5000);
        minuman.setUkuran("Large");

        makanan.tampilMenu();
        System.out.println();

        minuman.tampilMenu();
        System.out.println();

        int totalHarga = makanan.getHarga() + minuman.getHarga();
        System.out.println("Total harga: Rp" + totalHarga);
    }
}
public class Menu {
    private String nama;
    private int harga;

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
            System.out.println("Error: Harga harus lebih dari 0!");
        }
    }

    public void tampilMenu() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

class Makanan extends Menu {
    private int porsi;

    public int getPorsi() {
        return porsi;
    }

    public void setPorsi(int porsi) {
        this.porsi = porsi;
    }

    @Override
    public void tampilMenu() {
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Porsi: " + porsi);
    }
}

class Minuman extends Menu {
    private String ukuran;

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilMenu() {
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Ukuran: " + ukuran);
    }
}