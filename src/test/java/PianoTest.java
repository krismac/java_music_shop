import music_shop.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Mason & Hamlin", "Black", 1500, 2000);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Mason & Hamlin", piano.getManufacturer());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Mooosic", piano.play());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1500, piano.getCostPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2000, piano.getSalePrice());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(500, piano.calculateMarkup());
    }


}