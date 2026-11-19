class Game {
    String judul;
    String genre;
}

public class soal4dpk {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.judul = "Mobile Legends";
        game1.genre = "MOBA";

        Game game2 = new Game();
        game2.judul = "Stardew Valley";
        game2.genre = "Simulasi";

        System.out.println("Game 1: " + game1.judul + " - " + game1.genre);
        System.out.println("Game 2: " + game2.judul + " - " + game2.genre);
    }
}   