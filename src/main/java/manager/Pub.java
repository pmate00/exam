package manager;

import game.Game;
import game.StorytellingGame;
import user.Player;

import java.util.List;

public class Pub {
    private final List<Game> games;
    private final List<Player> players;

    public Pub(List<Game> games, List<Player> players) {
        this.games = games;
        this.players = players;
    }

    public List<Game> getAvailableGames() {
        return games.stream()
                .filter(game -> !game.canStart(players))
                .toList();
    }

    public boolean checkIfStoryTellingGameIsActive() {
        return games.stream()
                .anyMatch(game -> game instanceof StorytellingGame);

    }

}
