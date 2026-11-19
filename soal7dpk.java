
class Menu {
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

