import Cafe.Food.Sandwich;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwandwichTest {

    private Sandwich blt;

    @Before
    public void setup(){
        blt = new Sandwich("Bacon Lettuce Tomato", 4.8, true);
    }

    @Test
    public void hasPrice() {
        assertEquals(4.8, blt.getPrice(), 0.0);
    }

    @Test
    public void canSell() {
        assertEquals("Sold Sandwich", blt.sell());
    }

}
