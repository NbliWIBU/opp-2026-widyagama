import java.util.ArrayList;

public class soal15dpk {
    public static void main(String[] args) {
        
        ArrayList<Item> perpustakaan = new ArrayList<>();

        
        perpustakaan.add(new Buku("Laskar Pelangi", "Andrea Hirata"));
        perpustakaan.add(new Buku("Bumi", "Tere Liye"));
        perpustakaan.add(new Majalah("National Geographic", "November 2026"));

        
        System.out.println("--- Daftar Koleksi Perpustakaan ---");
        for (Item item : perpustakaan) {
            item.info();
        }

        
        System.out.println("\n--- Transaksi Peminjaman ---");
        if (perpustakaan.get(1) instanceof BisaDipinjam) {
            BisaDipinjam itemPinjaman = (BisaDipinjam) perpustakaan.get(1);
            itemPinjaman.pinjam();
        }

        
        System.out.println("\nTotal item di perpustakaan = " + perpustakaan.size());
    }
}


interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}


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

    
    public abstract void info();
}


class Buku extends Item implements BisaDipinjam {
    private String penulis;

    public Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    public void info() {
        System.out.println("[Buku] Judul: " + getJudul() + " | Penulis: " + penulis);
    }

    @Override
    public void pinjam() {
        System.out.println("Buku \"" + getJudul() + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku \"" + getJudul() + "\" telah dikembalikan.");
    }
}


class Majalah extends Item implements BisaDipinjam {
    private String edisi;

    public Majalah(String judul, String edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    public void info() {
        System.out.println("[Majalah] Judul: " + getJudul() + " | Edisi: " + edisi);
    }

    @Override
    public void pinjam() {
        System.out.println("Majalah \"" + getJudul() + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikan() {
        System.out.println("Majalah \"" + getJudul() + "\" telah dikembalikan.");
    }
}
