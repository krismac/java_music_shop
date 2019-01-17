import music_shop.Stand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandTest {

    Stand stand;

    @Before
    public void before() {
        stand = new Stand("Black", 5, 10);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", stand.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, stand.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, stand.getSellPrice());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(5, stand.calculateMarkup());
    }


}
