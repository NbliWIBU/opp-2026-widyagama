public class soal10 {
    public static void main(String[] args) {

        Makanan mkn = new Makanan("Nasi Goreng", 15000, "Besar");

        Minuman mnm = new Minuman("Es Teh", 5000, "Large");

        System.out.println("=== DAFTAR MENU ===");
        mkn.tampilMenu();
        mnm.tampilMenu();
        System.out.println("-------------------");

        double totalHarga = mkn.getHarga() + mnm.getHarga();

        System.out.println("Total harga: Rp" + (int) totalHarga);
    }
}

class Menu {
    
    private String nama;
    private double harga;

    
    public Menu(String nama, double harga) {
        this.nama = nama;
        setHarga(harga);
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Validasi Gagal: Harga harus lebih dari 0!");
            this.harga = 0;
        }
    }

    
    public void tampilMenu() {
        System.out.println("Nama: " + nama + " - Harga: Rp" + harga);
    }
}


class Makanan extends Menu {
    
    private String porsi;

   
    public Makanan(String nama, double harga, String porsi) {
        super(nama, harga);
        this.porsi = porsi;
    }

    
    @Override
    public void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama() + " - Rp" + (int)getHarga() + " (Porsi: " + porsi + ")");
    }
}


class Minuman extends Menu {
   
    private String ukuran;

   
    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga); 
        this.ukuran = ukuran;
    }

    
    @Override
    public void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama() + " - Rp" + (int)getHarga() + " (Ukuran: " + ukuran + ")");
    }
}


