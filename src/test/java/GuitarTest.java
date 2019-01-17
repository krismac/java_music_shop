import music_shop.Guitar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Gibson","Black", 6, 250, 500);
    }

    @Test
    public void canPlay() {
        assertEquals("Strum", guitar.play());
    }

    @Test
    public void hasModel() {
        assertEquals("Gibson", guitar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(250, guitar.getCostPrice());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(500, guitar.getSalePrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(250, guitar.calculateMarkup());
    }


}
