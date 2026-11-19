import java.util.ArrayList;

// Interface
interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}

// Abstract Class
abstract class Item {
    private String judul;

    // Constructor
    Item(String judul) {
        this.judul = judul;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Abstract Method
    abstract void info();
}

// Class Buku
class Buku extends Item implements BisaDipinjam {
    private String penulis;

    Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    void info() {
        System.out.println("[BUKU] " + getJudul() + " - " + penulis);
    }

    @Override
    public void pinjam() {
        System.out.println(getJudul() + " berhasil dipinjam!");
    }

    @Override
    public void kembalikan() {
        System.out.println(getJudul() + " berhasil dikembalikan!");
    }
}

// Class Majalah
class Majalah extends Item implements BisaDipinjam {
    private String edisi;

    Majalah(String judul, String edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    void info() {
        System.out.println("[MAJALAH] " + getJudul() + " - Edisi " + edisi);
    }

    @Override
    public void pinjam() {
        System.out.println(getJudul() + " berhasil dipinjam!");
    }

    @Override
    public void kembalikan() {
        System.out.println(getJudul() + " berhasil dikembalikan!");
    }
}

// Main Class
public class soal15dpk {
    public static void main(String[] args) {

        // Membuat ArrayList
        ArrayList<Item> daftar = new ArrayList<>();

        // Menambahkan 2 buku dan 1 majalah
        daftar.add(new Buku("Laskar Pelangi", "Andrea Hirata"));
        daftar.add(new Buku("Bumi Manusia", "Pramoedya"));
        daftar.add(new Majalah("Tempo", "2024"));

        // Menampilkan semua item
        System.out.println("=== DAFTAR PERPUSTAKAAN ===");

        for (Item item : daftar) {
            item.info();
        }

        // Meminjam salah satu item
        System.out.println("\nMeminjam: " + daftar.get(0).getJudul());

        BisaDipinjam pinjam = (BisaDipinjam) daftar.get(0);
        pinjam.pinjam();

        // Menampilkan total item
        System.out.println("\nTotal item: " + daftar.size());
    }
}