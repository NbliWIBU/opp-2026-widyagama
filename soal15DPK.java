import java.util.ArrayList;

interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}

abstract class Item {
    private String judul;

    Item(String judul) {
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

class Buku extends Item implements BisaDipinjam {
    String penulis;

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
        System.out.println(getJudul() + " telah dikembalikan.");
    }
}

class Majalah extends Item implements BisaDipinjam {
    String edisi;

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
        System.out.println(getJudul() + " telah dikembalikan.");
    }
}

public class soal15DPK {
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

        System.out.println("\nMeminjam: " + buku1.getJudul());
        buku1.pinjam();

        System.out.println("\nTotal item: " + perpustakaan.size());
    }
}