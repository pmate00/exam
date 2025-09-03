package game;

import user.Player;

import java.util.List;

public class StorytellingGame extends Game{
    private static int minPlayerNumber = 2;

    public StorytellingGame(String name, Complexity complexity) {
        super(name, complexity, minPlayerNumber);
    }

    @Override
    public boolean canStart(List<Player> players) {
         return players.size() >= minPlayerNumber;
    }
}
