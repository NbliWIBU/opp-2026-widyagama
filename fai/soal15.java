import java.util.ArrayList;

public class soal15 {
    public static void main(String[] args) {

        ArrayList<Item> daftarPerpustakaan = new ArrayList<>();

        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya");
        Majalah majalah1 = new Majalah("Tempo", "2024");

        daftarPerpustakaan.add(buku1);
        daftarPerpustakaan.add(buku2);
        daftarPerpustakaan.add(majalah1);

        System.out.println("=== DAFTAR PERPUSTAKAAN ===");
        for (Item item : daftarPerpustakaan) {
            item.info();
        }
        System.out.println();

        System.out.println("Meminjam: " + buku1.getJudul());
        buku1.pinjam();
        System.out.println();

        System.out.println("Total item: " + daftarPerpustakaan.size());
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
    private String edisi;

    public Majalah(String judul, String edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    public void info() {
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


