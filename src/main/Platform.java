package main;

public class Platform {
    String name;

    public void playGame(Game game) {
        System.out.println("Vous jouez au jeu " + game.name + " sur la plateforme " + name);
        System.out.println("et il est super!");
    }
}
