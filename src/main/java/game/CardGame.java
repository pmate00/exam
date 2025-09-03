package game;

import user.Player;

import java.util.List;

public class CardGame extends Game {
    private final static int minPlayerNumber = 2;

    public CardGame(String name, Complexity complexity) {
        super(name, complexity, minPlayerNumber);
    }

    @Override
    public boolean canStart(List<Player> players) {
        return players.size() >= minPlayerNumber;
    }
}
