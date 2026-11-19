
import java.util.ArrayList;

// MAIN CLASS
public class soal15dpk {
    public static void main(String[] args) {

        ArrayList<Item> perpustakaan = new ArrayList<>();

        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya");
        Majalah majalah1 = new Majalah("Tempo", "2024");

        perpustakaan.add(buku1);
        perpustakaan.add(buku2);
        perpustakaan.add(majalah1);

        System.out.println("=== DAFTAR PERPUSTAKAAN ===");

        for (Item item : perpustakaan) {
            item.info();
        }

        System.out.println("\n=== PEMINJAMAN ITEM ===");
        buku1.pinjam();

        System.out.println("\nTotal item: " + perpustakaan.size());
    }
}

// INTERFACE
interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}

// ABSTRACT CLASS
abstract class Item {
    private String judul;

    public Item(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    abstract void info();
}

// CLASS BUKU
class Buku extends Item implements BisaDipinjam {
    private String penulis;

    public Buku(String judul, String penulis) {
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
        System.out.println(getJudul() + " telah dikembalikan.");
    }
}

// CLASS MAJALAH
class Majalah extends Item implements BisaDipinjam {
    private String edisi;

    public Majalah(String judul, String edisi) {
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
        System.out.println(getJudul() + " telah dikembalikan.");
    }
}
