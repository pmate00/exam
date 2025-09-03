package game;

import user.Player;

import java.util.List;

public class PuzzleGame extends Game {
    private final static int minPlayerNumber = 1;

    public PuzzleGame(String name, Complexity complexity) {
        super(name, complexity, minPlayerNumber);
    }

    @Override
    public boolean canStart(List<Player> players) {
        return players.size() == 1;
    }


}
