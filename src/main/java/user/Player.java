package user;

import game.Game;

import java.util.List;

public class Player {
    private final String name;
    private int age;
    private final List<Game> games;

    public Player(String name, int age, List<Game> games) {
        this.name = name;
        this.age = age;
        this.games = games;
    }
}
