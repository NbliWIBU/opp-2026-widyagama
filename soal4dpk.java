public class soal4dpk {
    public static void main(String[] args) {
        Game g1 = new Game("Mobile Legends", "MOBA");
        Game g2 = new Game("Stardew Valley", "Simulasi");

        System.out.print("Game 1: ");
        g1.tampilkan();

        System.out.print("Game 2: ");
        g2.tampilkan();
    }
}
public class Game {
    String judul;
    String genre;

    Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    void tampilkan() {
        System.out.println("Game: " + judul + " - " + genre);
    }
}
