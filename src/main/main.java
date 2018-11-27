package main;

public class main {
    public static void main(String[] args) {
        Game gow = new Game();
        gow.name = "God of War";
        Platform ps4 = new Platform();
        ps4.name = "ps4";
        ps4.playGame(gow);
    }

}
