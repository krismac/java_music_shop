import behaviours.ISell;
import music_shop.Guitar;
import music_shop.Book;
import music_shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell item;

    @Before
    public void before() {
        shop = new Shop("Golden Disks");
        item = new Book("Music for Beginners", 3, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Golden Disks", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddGuitarToStock() {
        item = new Guitar("Gibson", "Black", 6, 250, 500);
        shop.addToStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canTakeItemFromStock() {
        shop.addToStock(item);
        shop.takeFromStock(item);
        assertEquals(0, shop.stockCount());
    }

}