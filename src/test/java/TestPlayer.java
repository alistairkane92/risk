import models.Colour;
import models.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {
    Player player;

    @Before
    public void setUp(){
        player = new Player("Bob", Colour.BLACK);

    }

    @Test
    public void testPlayerHasName() {
        assertEquals("Bob", player.getName());
    }

    @Test
    public void testPlayerHasColour() {
        assertEquals(Colour.BLACK, player.getColour());
    }

}
