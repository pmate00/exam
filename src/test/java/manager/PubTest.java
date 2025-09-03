package manager;


import game.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.Player;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PubTest {
    private Pub pub;
    private Game game1;
    private Game game2;
    private Player player1;
    private Player player2;

    @BeforeEach
    void setUp() {
        game1 = new CardGame("game1", Complexity.EASY);
        game2 = new StorytellingGame("game2", Complexity.EASY);
        player1 = new Player("name1", 20, List.of(game1, game2));
        player2 = new Player("name2", 20, List.of(game2));

        pub = new Pub(List.of(game1, game2), List.of(player1));
    }

    @Test
    void getAvailableGames_whenThereAreNotEnoughPlayers_returnsAvailableGames() {
        List<Game> result = pub.getAvailableGames();
        assertEquals(2, result.size());
    }

}