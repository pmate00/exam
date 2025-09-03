package game;

import user.Player;

import java.util.List;

public abstract class Game {
    private final String name;
    private final Complexity complexity;
    private final int minPlayerNumber;

    public Game(String name, Complexity complexity, int minPlayerNumber) {
        this.name = name;
        this.complexity = complexity;
        this.minPlayerNumber = minPlayerNumber;
    }

    public abstract boolean canStart(List<Player> players);
}
